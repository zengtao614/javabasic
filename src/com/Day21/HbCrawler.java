package com.Day21;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HbCrawler {

    private static String  get_img_regex = "<img src=\"//hbimg.*?/>";
    private static String  get_src_regex = "\"//hbimg.huabanimg.com/.*?\"";

//    <img src="//hbimg.huabanimg.com/654953460733026a7ef6e101404055627ad51784a95c-B6OFs4_sq75sf" data-baiduimageplus-ignore="1"/>
    public static void main(String[] args) throws Exception {
        downloadImg(getSrc(getHtml("https://huaban.com/boards/44911037/")));;
//        System.out.println(getSrc(getHtml("https://huaban.com/boards/44911037/")));
    }

    public static StringBuffer getHtml(String url) throws IOException {
        URL url1 = new URL(url);
        URLConnection connection = url1.openConnection();
        InputStream is = connection.getInputStream();
        BufferedReader bf = new BufferedReader(new InputStreamReader(is));

        StringBuffer sb= new StringBuffer();
        String aline;
        while ((aline=bf.readLine())!=null){
            sb.append(aline,0,aline.length()).append("\n");
        }
        bf.close();
        is.close();
        return sb;
    }

    public static HashSet<String> getSrc(StringBuffer sb){
        HashSet<String> srcs = new HashSet<>();
        Matcher matcherImg = Pattern.compile(get_img_regex).matcher(sb);
        while (matcherImg.find()){
            Matcher matcherSrc = Pattern.compile(get_src_regex).matcher(matcherImg.group());
            while (matcherSrc.find()){
//                System.out.println(matcherSrc.group());
                srcs.add("http:"+matcherSrc.group().substring(1,matcherSrc.group().length()-4)+"658");
            }
        }
        return srcs;
    }

    public static void downloadImg(HashSet<String> imgsrcs) throws Exception {
        for (String imgsrc:imgsrcs){
            try{
                String imgName = imgsrc.substring(imgsrc.lastIndexOf("/"))+".jpg";
                String folderName = "C:\\Users\\曾涛\\Desktop\\新建文件夹\\";
                URL uri = new URL(imgsrc);
                InputStream is = uri.openStream();
                FileOutputStream fos = new FileOutputStream(folderName+imgName);
                byte buf[] = new byte[1024];
                int length;
                System.out.println("开始下载"+imgName);
                while ((length=is.read(buf))!=-1){
                    fos.write(buf,0,length);
                }
                System.out.println("下载成功");
                fos.close();
                is.close();
                is.close();
            }catch (Exception e){
                System.out.println("下载失败");
            }
        }
    }
}
