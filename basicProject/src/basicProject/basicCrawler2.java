/**
 * @Summary   : 
 * @Package : basicProject
 * @FileName : basicCrawler2.java
 * @Author : Yang TaeIl
 * @date : 2018. 7. 12.  
 * 
 */
package basicProject;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
/**
 * 
 * @Package : basicProject
 * @FileName : basicCrawler2.java
 * @Author : Yang TaeIl
 * @date : 2018. 7. 12. 
 * 
 */
public class basicCrawler2 {

	/**
	 * 
	 *
	 * @Method Name : main
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		String URL = "http://news.naver.com/main/ranking/popularDay.nhn?rankingType=popular_day&sectionId=105&date=20180714";
        Document doc = Jsoup.connect(URL).get();
        Elements news = doc.body().getElementsByClass("nclicks(rnk.sci)");
        for(int i=0;i<news.size();i++) {
        	if(news.eq(i).text().equals("")) {
        		news.remove(i);
        		i--;
        		continue;
        	}
        	System.out.println("news titles : "+news.eq(i).text());
        	System.out.println("news Link : "+news.eq(i).select("a").attr("href"));
        	System.out.println("Post Image : "+news.eq(i).select("img").attr("lazy-src"));
        	System.out.println();
        }
	}

}
