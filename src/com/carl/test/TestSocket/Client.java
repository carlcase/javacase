package com.carl.test.TestSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Carl on 15-1-22.
 */
public class Client {
    public static Socket client;

    public Client(String ip,int port) {
        try {
            client = new Socket(ip,port);
            System.out.println("Client is created! ip:"+ip+" port:"+port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String sendMsg(String msg){
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream(),"UTF8"));
            PrintWriter out = new PrintWriter(client.getOutputStream());
            out.println(msg);
            out.flush();
            return in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public void close(){
        try {
            this.client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
