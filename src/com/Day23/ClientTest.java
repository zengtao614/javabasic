package com.Day23;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientTest {
    public static void main(String[] args) throws Exception{
        /*try {
            Socket socket = new Socket("localhost", 6666);
            OutputStream os = socket.getOutputStream();
            os.write("客户端消息".getBytes());


            InputStream inputStream = socket.getInputStream();
            byte buf[] = new byte[50];
            System.out.println(inputStream.read(buf));
            System.out.println(new String(buf));

            inputStream.close();
            os.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        //构建socket站点对象
        DatagramSocket socket = new DatagramSocket();
        //构建一个数据包对象
        String str = "发水了";
        DatagramPacket packet = new DatagramPacket(str.getBytes(),
                0,str.getBytes().length, InetAddress.getByName("localhost"),
                6666);
        socket.send(packet);
        packet.setData(new byte[50]);
        socket.receive(packet);
        System.out.println(new String(packet.getData()));

        socket.close();
    }
}
