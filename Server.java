package Server;
import java.net.*;
import java.io.*;

public class Server
{

    ServerSocket server;
    Socket socket;
    int port = 4433;
    DataOutputStream out;
    BufferedReader entry;
    public void run() {
        try {
            System.out.println("Esperando cliente");
            server = new ServerSocket(port);
            socket = new Socket();
            socket = server.accept();
            System.out.println("Cliente conectado");

            entry= new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String menssage = entry.readLine();
            System.out.println(menssage);
            out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF("Server Cerrado");
            String empty = (" ")
            while(

         socket.close();       
        } catch(Exception e) {
        }



    }
}