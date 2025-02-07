package org.example.chat.server;

import java.io.IOException;
import java.net.ServerSocket;

public class Program {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            Server server = new Server(serverSocket);       //создадим объект сервер
            server.runServer();
        }

        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
