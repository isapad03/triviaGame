import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import static java.lang.Thread.sleep;
public class TriviaServer {

    private static final int PORT = 5000;

    private ServerSocket serverSocket;
    private ClientHandler clientHandler;
    private volatile boolean running;

    private Question currentQuestion;



    public static void main(String[] args) {
        TriviaServer server = new TriviaServer();
        try {
            server.startServer();
        } catch (IOException e) {

            e.printStackTrace();

        }
    }


    public void startServer() throws IOException {
        running = true;
        serverSocket = new ServerSocket(PORT);
        System.out.println("Trivia Server Started on port " + PORT);
        Thread connection = new Thread(() -> {
            try {
                connectClients();
            } catch (IOException e) {
                e.printStackTrace();

            }
        });
        connection.start();

    }


    public void connectClients() throws IOException {
        while (running) {

            Socket socket = serverSocket.accept();
            newConnection(socket);

        }
    }


    public void newConnection(Socket socket) throws IOException {
        if(clientHandler == null) {
            clientHandler = new ClientHandler(socket,1);
            Thread p1Thread = new Thread(clientHandler);
            p1Thread.start();
            clientHandler.send("Welcome player!");
        }
    }






}


