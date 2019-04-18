package com.Day23;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {
    public static void main(String[] args) throws Exception {
        String str = "德玛西亚";
        DatagramSocket socket = new DatagramSocket();
        DatagramPacket packet = new DatagramPacket(str.getBytes(), 0, str.getBytes().length, InetAddress.getByName("localhost"), 9999);
        socket.send(packet);

        packet.setData(new byte[20]);
        socket.receive(packet);
        System.out.println(new String(packet.getData()));
        socket.close();
    }
}
