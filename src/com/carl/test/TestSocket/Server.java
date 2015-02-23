package com.carl.test.TestSocket;

import org.apache.log4j.net.SocketServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Carl on 15-1-22.
 */
public class Server {
    private ServerSocket server;

    public Server(int port) {
        try {
            server = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void beginListen(){
        while(true){
            try {
                final Socket client = server.accept();
                new Thread(new Runnable(){
                    public void run() {
                        BufferedReader in;
                        try {
                            in = new BufferedReader(new InputStreamReader(client.getInputStream(),"UTF8"));
                            PrintWriter out = new PrintWriter(client.getOutputStream());
                            while(!client.isClosed()){
                                String str = in.readLine();
                                out.println("Hi..."+str);
                                out.flush();
                                if(str == null || "end".equals(str)){
                                    break;
                                }
                                System.out.println(str);
                            }
                            client.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
