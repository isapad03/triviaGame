import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.lang.System.in;
import static java.lang.System.out;


public class Client  {
private BufferedReader in;
private PrintWriter out;
private volatile String message;
   // public static void main(String[] args) {
    public Client( String ip){
        try{
            Socket socket = new Socket(ip, 5000);

             in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             out = new PrintWriter(socket.getOutputStream(), true);
            Scanner input = new Scanner(System.in);



            Thread reciever = new Thread(() -> {
                try{


                    while((message=in.readLine())!=null){
                        processMessage(message);
                    }
                }catch(IOException e){
                    System.out.println("disconnected");

                }

            });
            reciever.start();


            while(true){
                String command = input.nextLine();



                if(command.equals("quit")){
                    break;
                }
                out.println(command);
            }

            socket.close();

        }catch(Exception e){

        }





    }


    public void sendMessage(String message){

        out.println(message);

    }

    public String getMessage(){
        return message;
    }




    public void processMessage(String message){

        System.out.println(message);


    }
}
