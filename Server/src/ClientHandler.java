import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
public class ClientHandler implements Runnable {

    private final Socket socket;
    private final int playerID;
    private BufferedReader in;
    private PrintWriter out;
    private volatile boolean connected;
    private questionBank questionBank = new questionBank();

    public ClientHandler(Socket socket, int playerID) throws IOException {
        this.socket = socket;
        this.playerID = playerID;
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        in = new BufferedReader(isr);
        out = new PrintWriter(socket.getOutputStream(), true);
        connected = true;

    }


    public void run() {
        String message = null;
        try {
            while (connected) {
                message = in.readLine();

                if(message == null){
                    break;
                }

                processMessage(message);
            }


        }catch (IOException e) {
            System.out.println("Disconnected");
        }

        finally{

            disconnect();
        }
    }


    void processMessage(String message) throws IOException {
        message = message.toLowerCase().trim();


        switch (message){
            case "hello":
                System.out.println("hello");
                break;
                default:
                    break;

            case "nwq":;
            System.out.println("nwq");
            sendNewQuestion();
                break;

        }
    }



    void send(String message) throws IOException {
        if(connected) {
            out.println(message);
        }
    }


    public void disconnect() {
        if(!connected) {
            return;
        }

        try{
            in.close();
            out.close();
            socket.close();
        }catch (IOException e) {

        }
        connected = false;
        System.out.println("Disconnected");
        out.println("disconnected");
    }


    public void sendNewQuestion() throws IOException {
        questionBank.getNewQuestion();
        String questionData = questionBank.getCurrentQuestion().getQuestionData();

        Packet packet = new Packet("nwq",questionData);
        out.println(packet.getPacketData());



    }

}
