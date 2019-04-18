package com.Day23;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerimgTest {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(6667);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream("src/com/Day23/test.jpg");
        byte buf[] = new byte[1024];
        int length = 0;
        while ((length = inputStream.read(buf)) != -1) {
            fileOutputStream.write(buf, 0, length);
        }
        fileOutputStream.close();
        inputStream.close();
        accept.close();
        serverSocket.close();
    }
}
