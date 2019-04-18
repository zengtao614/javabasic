package com.Day23;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public abstract class ServerTest {
    public static void main(String[] args) throws Exception {
        /*ServerSocket serverSocket = new ServerSocket(6666);
        Socket accept = serverSocket.accept();

        InputStream inputStream = accept.getInputStream();
        byte buf[] = new byte[50];
        inputStream.read(buf);
        System.out.println(new String(buf));


        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("服务器返回的消息".getBytes());

        inputStream.close();
        outputStream.close();
        accept.close();
        inputStream.close();*/

        //1.构建服务器端的站点socket
        DatagramSocket socket = new DatagramSocket(6666);
        //2.构建 接收 快递 的包裹packet
        byte buf[] = new byte[100];
        DatagramPacket packet = new DatagramPacket(buf,0,buf.length);
        //开始接收客户端发送的数据包，将数据放进自己构建的包中
        socket.receive(packet);

        System.out.println(new String(packet.getData()));

        String str = "大水冲了龙王庙";
        packet.setData(str.getBytes());
        socket.send(packet);

        socket.close();
    }
}
