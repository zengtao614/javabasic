package com.work.test4_22.Test5;

import java.io.*;

public class Test {
    /**
     * 第五题（IO 流）
     * <p>
     * 使用字节流，字符流和带缓冲区字符流三种方式，将 D 盘下的 a.txt 文件拷贝到
     * E 盘。Txt 文本内容：长亭外，古道边，芳草碧连天。晚风拂柳笛声残，夕阳山外山！
     */
    public static void main(String[] args) throws Exception {
        //字节流
//        function1();
//        字符流
//        function2();
        //缓冲流
//        function3();
    }

    private static void function3() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("src/com/work/test4_22/a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/work/test4_22/Test5/a.txt"));
        String buf = null;
        while ((buf = br.readLine()) != null) {
            bw.write(buf);
            bw.newLine();
        }
        bw.close();
        br.close();

    }

    private static void function2() throws Exception {
        FileReader fr = new FileReader("d:/a.txt");
        FileWriter fw = new FileWriter("e:/a.txt");
        char buf[] = new char[20];
        int length = 0;
        while ((length = fr.read(buf)) != -1) {
            fw.write(buf, 0, length);
        }
        fw.close();
        fr.close();
    }

    private static void function1() throws IOException {
        FileInputStream fis = new FileInputStream("d:/a.txt");
        FileOutputStream fos = new FileOutputStream("e:/a.txt");
        byte buf[] = new byte[20];
        int length = 0;
        while ((length = fis.read(buf)) != -1) {
            fos.write(buf, 0, length);
        }
        fos.close();
        fis.close();
    }
}
