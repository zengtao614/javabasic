package com.Day20;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception{

        //File类操作
        fileTest();
        //字节输入流
        byte[] b = inputStreamTest();
        //字节输出流
        outputStreamTest(b);
        //边读边写
        inputAndoutputTest();

    }

    private static void inputAndoutputTest() throws IOException {
        InputStream is = new FileInputStream("src\\c.txt");
        OutputStream os = new FileOutputStream("src\\d.txt");
        int i;
        while ((i=is.read())!=-1){
            os.write(i);
        }
    }

    private static void outputStreamTest(byte[] b) throws IOException {
        OutputStream os = new FileOutputStream("src\\d.txt");
        os.write(b);
    }

    private static byte[] inputStreamTest() throws IOException {
        InputStream is = new FileInputStream("src\\b.txt");
        System.out.println(is.read());
        byte b[] = new byte[10];
        System.out.println(is.read(b));
        System.out.println(is.read(b,0,6));
        return b;
    }

    private static void fileTest() {
        File file = new File("src\\c.txt");
        System.out.println(file.exists());
        System.out.println(file.length());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.isFile());
    }
}
