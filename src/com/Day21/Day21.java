package com.Day21;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Day21 {
    public static void main(String[] args) throws Exception{
        //缓冲流读写测试
//        bufferStreamTest();
        //二进制文件读写(基于字节流)
//        dataSteamTest();
        //序列化
//        objectStreamTest();
        //输入字符流
//        readerTest();
        //输出字符流
//        writerTest();
        //边读边写
//        rwTest();
        //缓冲区流
        bufferTest();
    }

    private static void bufferTest() throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("src/d.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/b.txt"));
        while (br.ready()){
            bw.write(br.readLine());
            bw.newLine();
        }
        bw.close();
        br.close();
    }

    private static void rwTest() throws Exception{
        Reader reader = new FileReader("src/d.txt");
        Writer writer = new FileWriter("src/b.txt");
        char buf[] = new char[10];
        int length;
        while ((length=reader.read(buf))!=-1){
            writer.write(buf,0,length);
        }
        writer.close();
        reader.close();

    }

    private static void writerTest() throws Exception{
        Writer writer = new FileWriter("src/b.txt");

        writer.write("hello",2,2);
        writer.append("a");
        writer.close();

    }

    private static void readerTest() throws Exception{
        Reader reader = new FileReader("src/b.txt");
        char buf[] = new char[6];
        int i = reader.read(buf,3,3);
        System.out.println(i);
        System.out.println(buf);
    }

    private static void objectStreamTest() throws IOException, ClassNotFoundException {
        Dog dog1 = new Dog("旺财",3,"公狗");
        ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("src/c.txt"));
        oot.writeObject(dog1);
        oot.flush();
        oot.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/c.txt"));
        Dog dog2 = (Dog) ois.readObject();
        System.out.println(dog2);
    }

    private static void dataSteamTest() throws IOException {
        DataInputStream dit = new DataInputStream(new FileInputStream("C:\\Users\\曾涛\\Pictures\\gank.io所有妹子图\\第47张图.png"));
        DataOutputStream dot = new DataOutputStream(new FileOutputStream("src/test.png"));
        byte bytes[] = new byte[1024];
        int i;
        while ((i=dit.read(bytes))!=-1){
            dot.write(bytes);
            dot.flush();
        }
        dot.close();
        dit.close();
    }

    private static void bufferStreamTest() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/b.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/e.txt"));

        String str;
        while ((str=reader.readLine())!=null){
            writer.write(str);
            writer.newLine();
            writer.flush();
        }
        writer.close();
        reader.close();
    }
}
