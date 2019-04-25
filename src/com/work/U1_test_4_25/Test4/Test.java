package com.work.U1_test_4_25.Test4;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test {
    /**
     * 第四题 (io流)
     * 将本地磁盘上E盘的图片复制到F盘
     */
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("d:/611138.png");
        FileOutputStream fos = new FileOutputStream("e:/copy.png");
        byte buf[] = new byte[1024];
        int length = 0;
        while ((length = fis.read(buf)) != -1) {
            fos.write(buf, 0, length);
        }
        fos.close();
        fis.close();

    }
}
