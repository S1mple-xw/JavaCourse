package edu.csuft.xw.demo;

import java.io.IOException;
import java.util.ArrayList;

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
// ����            String poster
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
    	     
    	    	 // ÿһ��ӰƬ
    	    	
    	     
 //����һ��ӰƬ���б�
   ArrayList<Film> list = new ArrayList();
   
   for(Element e : es){
	   Film f = new Film();
	   //ÿһ��ӰƬ
	   f.id = Integer.parseInt(e.select(".pic em").first().text());
	   f.poster = e.select("img").first().attr("src");
	   f.info = e.select(".bd p").first().text();
	   f.title = e.select(".title").first().text();
	   f.rating = Double.parseDouble(e.select(".rating_num").first().text());
	   String num = e.select(".star span").last().text();
	   f.num = Integer.parseInt(num.substring(0, num.length() -3));
	   f.quote = e.select(".inq").first().text();
	   System.out.println(f);
	   list.add(f);
   
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
