package com.Day23;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(9999);

        byte buf[] = new byte[20];
        DatagramPacket packet = new DatagramPacket(buf, 0, buf.length);
        socket.receive(packet);
        System.out.println(new String(packet.getData()));

        packet.setData("诺克萨斯".getBytes());
        socket.send(packet);
        socket.close();
    }
}
