package sample;

import java.net.*;
import java.io.*;

public class Client {

    Socket client;
    int port = 4433;
    String ip = "127.0.0.1";
    BufferedReader entry, keybord;
    PrintStream out;

    public void run2(){

        try {
            client = new Socket(ip,port);
            entry =new BufferedReader(new InputStreamReader(client.getInputStream()));
            keybord = new BufferedReader(new InputStreamReader(System.in));
            String key = keybord.readLine();
            out = new PrintStream(client.getOutputStream());
            out.println(key);
            String msg = entry.readLine();
            System.out.println(msg);

            entry.close();
            out.close();
            keybord.close();
            client.close();
        }catch(Exception e){}




    }






}


