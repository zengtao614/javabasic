package com.Day20;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Day20 {
    public static void main(String[] args) throws Exception{

        //File类操作
//        fileTest();


        //文件字节输入流
//        inputStreamTest();
        //文件字节输出流
        OutputStream os = new FileOutputStream("src/c.txt");
        //ASCII码表
        byte ASC[] = new byte[128];
        for (int i=0;i<=127;i++){
            ASC[i] = (byte)i;
        }

        //0:null

        //48~57:0~9
        os.write(ASC,48,10);
        //32:spc(空格)
        os.write(32);
        //65~90:A~Z
        os.write(ASC,65,26);
        os.write(32);
        //97~122:a~z
        os.write(ASC,97,26);

    }

    private static void inputStreamTest() throws IOException {
//        InputStream is = new FileInputStream(new File("src/c.txt"));
//        while (is.read()!=-1)
//        byte b[] = new byte[10];
//        System.out.println(is.read());
//        System.out.println(Arrays.toString(b));
    }

    private static void fileTest() throws IOException {
        File file = new File("D:\\helloworld.java");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getParent());
        System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile().getName());
        System.out.println(file.getCanonicalFile().getAbsolutePath());

        File file1 = new File("src/com/Day20/a.txt");
        System.out.println(file1.createNewFile());
        //重命名加剪切粘贴过程
        System.out.println(file1.renameTo(new File("src/b.txt")));
    }
}
