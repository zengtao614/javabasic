package com.Day21;

import java.io.*;
import java.util.Arrays;

public class Homework {
    public static void main(String[] args) throws Exception {
        //IO流作业1
//        work1();
        //IO流作业2
//        1.使用字符输入和输出流FileReader和FileWriter实现文本文件的读和写，
//          以及粘贴复制效果（边读边写）
//        FileReader fr = new FileReader("src/d.txt");
//        FileWriter fw = new FileWriter("src/a.txt");
//        char buf[] = new char[10];
//        int length;
//        while ((length = fr.read(buf)) != -1) {
//            fw.write(buf, 0, length);
//        }
//        fw.close();
//        fr.close();

//        2.使用字符缓冲输入流和缓冲输出流，BufferedReader 和BufferedWriter实现文本文件的读和写，
//          以及粘贴和复制效果
        BufferedReader br = new BufferedReader(new FileReader("src/b.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("copy.txt"));
        while (br.ready()) {
            bw.write(br.readLine());
            bw.newLine();
        }
        bw.close();
        br.close();

//        3.实现非文本文件，图片和mp3文件的拷贝。
//        DataInputStream dis = new DataInputStream(new FileInputStream("src/test.png"));
//        DataOutputStream dos = new DataOutputStream(new FileOutputStream("copy.png"));
//        byte buf[] = new byte[1024];
//        int length;
//        while ((length = dis.read(buf)) != -1) {
//            dos.write(buf, 0, length);
//        }
//        dos.close();
//        dis.close();

//        4.实现宠物对象pet(有名称，年龄和性别属性)的读写操作（序列化和反序列化）
        Dog dog1 = new Dog("旺财",3,"公狗");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/c.txt"));
        oos.writeObject(dog1);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/c.txt"));
        Dog dog2 = (Dog) ois.readObject();
        System.out.println(dog2);


    }

    private static int  getNum(int month) {
        if (month<3){
            return 1;
        }else {
            return getNum(month-1)+getNum(month-2);
        }
    }

    private static void work1() {
        //        1.创建文件删除文件，创建文件夹删除文件夹，输出文件的属性：文件名，文件路径，文件字节长度
//        File file = new File("src/test.txt");
//        System.out.println(file.createNewFile());
//        System.out.println(file.delete());
//
//        File folder = new File("src/a");
//        System.out.println(folder.mkdirs());
//        System.out.println(folder.delete());
//
//        File txtfile = new File("src/d.txt");
//        System.out.println(txtfile.getName());
//        System.out.println(txtfile.getPath());
//        System.out.println(txtfile.length());

//        2.使用字节输入流的三个重载的read()方法，读取并输出a.txt文件中的数据。
//        FileInputStream fis = new FileInputStream("b.txt");
//        System.out.println(fis.read());
//        byte buf[] = new byte[10];
//        System.out.println(fis.read(buf));
//        System.out.println(Arrays.toString(buf));
//        System.out.println(fis.read(buf, 0, 5));
//        System.out.println(Arrays.toString(buf));

//        3.使用字节输出流的三个重载的write()方法，向a.txt中写入一句话。
//        FileOutputStream fos = new FileOutputStream("src/a.txt");
//        fos.write("我草泥马".getBytes());
//        fos.write(48);
//        fos.write(65);
//        fos.write(97);
//        fos.write("abcdefg".getBytes(), 2, 3);

//        4.使用字节输入流和输出流实现文件的粘贴复制效果：将E盘中的某个文件夹下的文件，
//        复制粘贴到F盘的某个文件夹下。
//        FileInputStream fis = new FileInputStream("src/d.txt");
//        FileOutputStream fos = new FileOutputStream("copy.txt");
//        byte buf[] = new byte[10];
//        int length;
//        while ((length=fis.read(buf))!=-1){
//            fos.write(buf,0,length);
//        }
    }
}
