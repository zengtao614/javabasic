package com.Day23;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("70.1.1.161", 666);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("你好".getBytes());

        InputStream inputStream = socket.getInputStream();
        byte buf[] = new byte[20];
        inputStream.read(buf);
        System.out.println(new String(buf));

        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
