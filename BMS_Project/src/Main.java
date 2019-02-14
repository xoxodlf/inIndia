import java.util.ArrayList;
import java.util.Scanner;

import com.tb.bms.board.controller.ArticleController;
import com.tb.bms.board.controller.BoardController;
import com.tb.bms.board.domain.ArticleDTO;
import com.tb.bms.board.domain.BoardDTO;
import com.tb.bms.reply.controller.ReplyController;
import com.tb.bms.reply.domain.ReplyDTO;
import com.tb.bms.user.controller.UserController;
import com.tb.bms.user.domain.UserDTO;

/**
 * @Summary   : 
 * @Package : 
 * @FileName : Main.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 9.  
 * 
 */

/**
 * 
 * @Package : 
 * @FileName : Main.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 9. 
 * 
 */
public class Main {

	/**
	 * 
	 *
	 * @Method Name : main
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		UserDTO session = null;
		UserController UserC=new UserController();
		boolean isLogin=false;
		while(!isLogin) {
			System.out.println("1. LOGIN");
			System.out.println("2. SIGN UP");
			int m=sc.nextInt();
			if(m==1) {
				System.out.println("ID\t\t\tPassword를 입력하세요.");
				session=UserC.login(sc.next(), sc.next());
				if(session==null) {
					System.out.println("ID와 Password를 확인해주세요.");
					continue;
				}else {
					System.out.println("로그인에 성공하였습니다.");
					isLogin=true;
					break;
				}
			}else if (m==2) {
				System.out.println("ID\t\t\tPassword\t\t\t 이름을 입력하세요.");
				String id=sc.next();
				if(UserC.isExist(id)) {
					System.out.println("aleady exist");
				}
				UserC.createUser(new UserDTO(0,sc.next(),sc.next(),sc.next()));
				continue;
			}else continue;
		}
		System.out.println();
		while(isLogin) {
			BoardController BoardC =new BoardController();
			ArrayList<BoardDTO> bl=new ArrayList<BoardDTO>();
			System.out.println("1.BoardList");
			System.out.println("2.Create Board");
			System.out.println("3.Modify Board");
			System.out.println("4.Delete Board");
			int n=sc.nextInt();
			if(n==1) {
				System.out.println("\nBoard List");
				bl=BoardC.listAll();
				for(BoardDTO board:bl) {
					System.out.println(board.getBoardNo()+" "+board.getTitle()+ " "+ board.getInfo());
				}
				System.out.println();
				System.out.println("select the number what you want to enter");
				int bn=sc.nextInt();
				
				
				System.out.println("1.ArticleList");
				System.out.println("2.Create Article");
				System.out.println("3.Modify Article");
				System.out.println("4.Delete Article");
				int nn=sc.nextInt();
				ArticleController ArticleC=new ArticleController();
				if(nn==1) {
					ArrayList<ArticleDTO> al=new ArrayList<ArticleDTO>();
					
					al=ArticleC.listAll(bn);
					for(ArticleDTO article:al) {
						System.out.println(article.getArticleNo()+" "+article.getTitle());
					}
					System.out.println();
					System.out.println("select the number what you want to enter");
					int an=sc.nextInt();
					for(ArticleDTO article:al) {
						if(article.getArticleNo()==an) {
							System.out.println(article.getArticleNo()+" "+article.getTitle()+" "+article.getContents());
							ReplyController replyC=new ReplyController();
							ArrayList<ReplyDTO> rl=new ArrayList<ReplyDTO>();
							System.out.println("1. 댓글보기, 2. 댓글쓰기, 3. 댓글수정, 4. 댓글삭제");
							int con=sc.nextInt();
							if(con==1) {
								rl=replyC.listAll(an);
								for(ReplyDTO reply:rl) {
									System.out.println(reply.getReplyNo()+" "+reply.getContents());
								}
							}else if(con==2) {
								replyC.createReply(new ReplyDTO(0, an, session.getUserNo(), sc.next()));
							}else if(con==3) {
								rl=replyC.listAll(an);
								for(ReplyDTO reply:rl) {
									System.out.println(reply.getReplyNo()+" "+reply.getContents());
								}
								System.out.println("enter number you modify");
								int rn=sc.nextInt();
								replyC.modityReply(new ReplyDTO(rn, an, session.getUserNo(), sc.next()));
							}else if(con==4) {
								rl=replyC.listAll(an);
								for(ReplyDTO reply:rl) {
									System.out.println(reply.getReplyNo()+" "+reply.getContents());
								}
								System.out.println("enter number you delete");
								int rn=sc.nextInt();
								replyC.deleteReply(rn);
							}
						}
					}
				}else if(nn==2) {
					System.out.println("Title\\t\\t Contents");
					String title=sc.next();
					String contents=sc.next();
					ArticleDTO article=new ArticleDTO(n, title, contents, session.getUserNo(), bn);
					ArticleC.createArticle(article);
					System.out.println("Article Created");
				}else if(nn==3) {
					System.out.println("\nArticle List");
					ArrayList<ArticleDTO> al=new ArrayList<ArticleDTO>();
					
					al=ArticleC.listAll(bn);
					for(ArticleDTO article:al) {
						System.out.println(article.getArticleNo()+" "+article.getTitle());
					}
					System.out.println();
					System.out.println("select the number what you want to modify");
					int an=sc.nextInt();
					int cnt=0;
					for(ArticleDTO article:al) {
						if(an==article.getArticleNo()) {
							cnt++;
						}
					}
					if(cnt==0) System.out.println("There is no article that you selected");
					else {
						System.out.println("Article's title and Contents");
						ArticleC.modityArticle(new ArticleDTO(an,sc.next(),sc.next(),session.getUserNo(),bn));
					}
				}else if(nn==4) {
					System.out.println("\nArticle List");
					ArrayList<ArticleDTO> al=new ArrayList<ArticleDTO>();
					
					al=ArticleC.listAll(bn);
					for(ArticleDTO article:al) {
						System.out.println(article.getArticleNo()+" "+article.getTitle());
					}
					System.out.println();
					System.out.println("select the number what you want to delete");
					int an=sc.nextInt();
					int cnt=0;
					for(ArticleDTO article:al) {
						if(an==article.getArticleNo()) {
							cnt++;
						}
					}
					if(cnt==0) System.out.println("There is no article that you selected");
					else {
						ArticleC.deleteAriticle(an);
					}
				}
				
			}else if(n==2) {
				System.out.println("Title\t\t Info");
				String title=sc.next();
				String info=sc.next();
				if(BoardC.isExist(title)) {
					System.out.println("aleady exists");
				}else {
					BoardDTO board=new BoardDTO(0,title,info);
					BoardC.createBoard(board);
					System.out.println("Board Created");
				}
			}else if(n==3) {
				System.out.println("\nBoard List");
				bl=BoardC.listAll();
				for(BoardDTO board:bl) {
					System.out.println(board.getBoardNo()+" "+board.getTitle()+ " "+ board.getInfo());
				}
				System.out.println();
				System.out.println("select the number what you want to modify");
				int bn=sc.nextInt();
				int cnt=0;
				for(BoardDTO board:bl) {
					if(bn==board.getBoardNo()) {
						cnt++;
					}
				}
				if(cnt==0) System.out.println("There is no board that you selected");
				else {
					System.out.println("Board's title and info");
					BoardC.modifyBoard(new BoardDTO(bn,sc.next(),sc.next()));
				}
			}else if(n==4) {
				System.out.println("\nBoard List");
				bl=BoardC.listAll();
				for(BoardDTO board:bl) {
					System.out.println(board.getBoardNo()+" "+board.getTitle()+ " "+ board.getInfo());
				}
				System.out.println();
				System.out.println("select the number what you want to delete");
				int bn=sc.nextInt();
				int cnt=0;
				for(BoardDTO board:bl) {
					if(bn==board.getBoardNo()) {
						cnt++;
					}
				}
				if(cnt==0) System.out.println("There is no board that you selected");
				else {
					BoardC.deleteBoard(bn);
					System.out.println("Delete success");
				}
			}
			
		}
		

	}

}
