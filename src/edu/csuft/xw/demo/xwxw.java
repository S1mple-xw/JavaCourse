package edu.csuft.xw.demo;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;



public class xwxw {
	 public static void main(String[] args) {
    	 //Ŀ�� URL
    	 String url="http://movie.douban.com/top250";
    	 // ʹ��JSOUPץȡ�ĵ�
    	 try {
    		 //�����ҳ�е����� ��DOM ����
			Document d = Jsoup.connect(url).get();
			Elements es = d.select(".pic em");
			System.out.println(es.text());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}