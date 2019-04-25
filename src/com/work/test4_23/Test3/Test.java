package com.work.test4_23.Test3;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test {
    /**
     * 3.你突然穿越到了20年前，发现当时的开发工具并没有研发出来。迫于无奈，你只能用记事本开发。
     * 你的公司给你的要求就是如何使用代码复制文件。
     *  需求:1.使用记事本工具编写。2.cmd进入黑窗口，使用命令进行操作。
     *      2.如果编写不出来，改为helloword得5分
     */
    public static void main(String[] args) throws Exception{


        FileInputStream fis = new FileInputStream("d:/611138.png");
        FileOutputStream fos = new FileOutputStream("e:/copy.png");
        byte buf[] = new byte[1024];
        int length = 0;
        long starttime = System.currentTimeMillis();
        while ((length=fis.read(buf))!=-1){
            fos.write(buf,0,length);
        }
        fos.close();
        fis.close();
        long endtime = System.currentTimeMillis();
        System.out.println("复制完成，耗时"+(endtime-starttime));
    }
}
