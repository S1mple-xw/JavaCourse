package edu.csuft.xw.demo;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



/**
 *  程序入口
 * @author xw
 *
 */
// 影片名称   String title
// 相关信息   String info
// 评分           double rating
// 评分人数    int num
// 影片排名    int id
// 短评            String quote
public class demo {
//	alt+/
     public static void main(String[] args) {
    	 //目标 URL
    	 String url="http://movie.douban.com/top250";
    	 // 使用JSOUP抓取文档
    	try
    	{ Document doc = Jsoup.connect(url).get();
    	     
    	     Elements es= doc.select(".grid_view .item");
    	     System.out.println(es.size());
    	     for(Element e: es){
    	    	 // 每一部影片
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
