package com.carl.test.TestSocket.n_socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Carl on 15-1-23.
 */
public class SimpleServer {
    //客户端列表
    public static ArrayList<Socket> socketList = new ArrayList<Socket>();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ServerSocket ss=new ServerSocket(30000);
        while (true) {
            Socket s=ss.accept();
            socketList.add(s);
            new Thread(new ServerTherad(s)).start();
        }
    }

}
