package com.carl.test.TestSocket;

/**
 * Created by Carl on 15-1-22.
 */
public class TestClient {
    public static void main(String[] args){
        Client client = new Client("127.0.0.1",10000);
        String serverMsg = client.sendMsg("哈哈哈哈");
        System.out.println("serverMsg:"+serverMsg);
        client.close();
        Client client1 = new Client("127.0.0.1",10000);
        String serverMsg1 = client.sendMsg("sjflksajflasdfjlasdjflk");
        System.out.println("serverMsg:"+serverMsg1);
        client1.close();
    }
}
