package com.Day20;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Day20 {
    public static void main(String[] args) throws Exception{

//        File file = new File("D:\\helloworld.java");
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getPath());
//        System.out.println(file.getParent());
//        System.out.println(file.getName());
//        System.out.println(file.getAbsoluteFile().getName());
//        System.out.println(file.getCanonicalFile().getAbsolutePath());

        File file1 = new File("src/com/Day20/a.txt");
        System.out.println(file1.createNewFile());
        //重命名加剪切粘贴过程
        System.out.println(file1.renameTo(new File("src/b.txt")));

    }
}
