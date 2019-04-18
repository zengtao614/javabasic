package com.Day23;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        byte buf[] = new byte[20];
        inputStream.read(buf);
        System.out.println(new String(buf));

        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("谢谢".getBytes());

        outputStream.close();
        inputStream.close();
        accept.close();
        serverSocket.close();
    }
}
