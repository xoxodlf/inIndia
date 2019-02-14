/**
 * @Summary   : 
 * @Package : basicProject
 * @FileName : basicCrawler.java
 * @Author : Yang TaeIl
 * @date : 2018. 7. 12.  
 * 
 */
package basicProject;


import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
/**
 * 
 * @Package : basicProject
 * @FileName : basicCrawler.java
 * @Author : Yang TaeIl
 * @date : 2018. 7. 12. 
 * 
 */
public class basicCrawler {
	
	Elements getTitles() throws Exception{
		String URL = "http://news.naver.com/main/ranking/popularDay.nhn?rankingType=popular_day&sectionId=105";
        Document doc = Jsoup.connect(URL).get();
        Elements news = doc.body().getElementsByClass("nclicks(rnk.sci)");
        for(int i=0;i<news.size();i++) {
        	if(news.eq(i).text().equals("")) {
        		news.remove(i);
        		i--;
        		continue;
        	}
        }
        return news;
	}
	
}
