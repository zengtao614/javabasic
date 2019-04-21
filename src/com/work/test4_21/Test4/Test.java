package com.work.test4_21.Test4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Test {
    /**
     * 四.io流
     * 根据需求完成以下功能
     * a.已知在当前工程的根目录下有一个a.txt,a.txt中的内容为:
     * (可以在a.txt中手动输入以下内容)
     * I love you
     * I miss you
     * I hate you
     * I want you
     * 1.利用 字符数组,FileReader,FileWriter将a.txt拷贝到当前工程下的b.txt中,
     * 异常不需要处理,抛出即可(throws)
     * 2.利用 BufferedReader和BufferedWriter将a.txt拷贝到当前工程下的c.txt中,
     * 异常不需要处理,抛出即可(throws)
     */
    public static void main(String[] args) throws Exception {
        /*FileReader fr = new FileReader("src/a.txt");
        FileWriter fw = new FileWriter("src/com/work/copy1.txt");
        char buf[] = new char[10];
        int length = 0;
        while ((length = fr.read(buf)) != -1) {
            fw.write(buf, 0, length);
        }
        fw.close();
        fr.close();*/

        BufferedReader br = new BufferedReader(new FileReader("src/a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/work/copy2.txt"));
        while (br.ready()) {
            bw.write(br.readLine());
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
