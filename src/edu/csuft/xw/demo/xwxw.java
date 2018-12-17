package edu.csuft.xw.demo;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;



public class xwxw {
	 public static void main(String[] args) {
    	 //目标 URL
    	 String url="http://movie.douban.com/top250";
    	 // 使用JSOUP抓取文档
    	 try {
    		 //获得网页中的内容 （DOM 树）
			Document d = Jsoup.connect(url).get();
			Elements es = d.select(".pic em");
			System.out.println(es.text());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}