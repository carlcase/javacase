package com.carl.test.TestSocket;

/**
 * Created by Carl on 15-1-22.
 */
public class TestServer {
    public static void main(String[] args){
        Server server = new Server(10000);
        server.beginListen();
    }
}
