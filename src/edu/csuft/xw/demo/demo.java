package edu.csuft.xw.demo;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



/**
 *  �������
 * @author xw
 *
 */
// ӰƬ����   String title
// �����Ϣ   String info
// ����           double rating
// ��������    int num
// ӰƬ����    int id
// ����            String quote
public class demo {
//	alt+/
     public static void main(String[] args) {
    	 //Ŀ�� URL
    	 String url="http://movie.douban.com/top250";
    	 // ʹ��JSOUPץȡ�ĵ�
    	try
    	{ Document doc = Jsoup.connect(url).get();
    	     
    	     Elements es= doc.select(".grid_view .item");
    	     System.out.println(es.size());
    	     for(Element e: es){
    	    	 // ÿһ��ӰƬ
    	    	 Element t = e.select(".title").first();
    	    	 String num =e.select(".star span").last().text();
    	    	 System.out.println(t.text());
    	     }
    	     
    	 
		//    String title= doc.title();
	
	//	     String data =doc.data();
		     
		     
		//     System.out.println(title);
		  //   System.out.println(data);
    	
	}
    	catch (IOException e) {
			// TODO: handle exception
    		e.printStackTrace();
		}
    	

}
}
