package com.carl.test.TestSocket.n_socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Carl on 15-1-23.
 */
public class ServerTherad implements Runnable{

    private Socket s = null;
    private BufferedReader buRead = null;
    StringBuffer stb = new StringBuffer();

    public ServerTherad(Socket s) throws IOException {
        this.s = s;
        this.buRead = new BufferedReader(new InputStreamReader(s.getInputStream(),"UTF8"));
    }

    @Override
    public void run() {
        String connet = null;
        try {
            while((connet = readFormClient())!=null){
                System.out.println("客户端说："+connet);
                for (Socket ss:SimpleServer.socketList) {
                    OutputStream out=ss.getOutputStream();
                    out.write((connet+"\n").getBytes("utf-8"));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readFormClient(){
        try {
            return buRead.readLine();
        } catch (IOException e) {
            SimpleServer.socketList.remove(s);
        }
        return null;
    }
}
