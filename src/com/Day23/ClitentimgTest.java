package com.Day23;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClitentimgTest {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 6667);
        OutputStream outputStream = socket.getOutputStream();
        FileInputStream fis = new FileInputStream("src/test.png");
        byte buf[] = new byte[1024];
        int length;
        while ((length = fis.read(buf)) != -1) {
            outputStream.write(buf, 0, length);
        }
        fis.close();
        outputStream.close();
        socket.close();

    }
}
