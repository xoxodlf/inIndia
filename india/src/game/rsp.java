package game;

import java.util.Scanner;

class com{
	String name;
	int stair = 0;
	int winCnt=0;
	int loseCnt=0;
	int drawCnt=0;
	
	com(String name){
		this.name=name;
	}
	int doRSP(){
		return (int)(Math.random()*3)+1;
	}
	void win() {
		winCnt++;
	}
	void draw() {
		drawCnt++;
	}
	void lose() {
		loseCnt++;
	}
}

public class rsp {
	public static void main (String args[]) {
		com a =new com("COM1");
		com b =new com("COM2");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("계단의 수를 설정해주세요");
		int stair = sc.nextInt();
		System.out.println("가위바위보를 시작합니다.");
		while(a.stair<stair&&b.stair<stair) {
			if(a.doRSP()==1) {
				if(b.doRSP()==1) {
					a.draw();b.draw();
					System.out.println("둘다 가위로 비겼습니다.");
				}else if(b.doRSP()==2) {
					a.lose();b.win();b.stair=b.stair+1;
					System.out.println(b.name+"가 바위로 이겼습니다."+b.stair+"째 계단입니다.");
				}else {
					b.lose();a.win();a.stair=a.stair+2;
					System.out.println(a.name+"가 가위로 이겼습니다."+a.stair+"째 계단입니다.");
				}
			}else if(a.doRSP()==2) {
				if(b.doRSP()==1) {
					b.lose();a.win();a.stair=a.stair+1;
					System.out.println(a.name+"가 바위로 이겼습니다."+a.stair+"째 계단입니다.");
				}else if(b.doRSP()==2) {
					a.draw();b.draw();
					System.out.println("둘다 바위로 비겼습니다.");
				}else {
					a.lose();b.win();b.stair=b.stair+5;
					System.out.println(b.name+"가 보로 이겼습니다."+b.stair+"째 계단입니다.");
				}
			}else {//보
				if(b.doRSP()==1) {
					a.lose();b.win();b.stair=b.stair+2;
					System.out.println(b.name+"가 가위로 이겼습니다."+b.stair+"째 계단입니다.");
				}else if(b.doRSP()==2) {
					b.lose();a.win();a.stair=a.stair+5;
					System.out.println(a.name+"가 보로 이겼습니다."+a.stair+"째 계단입니다.");
				}else {
					a.draw();b.draw();
					System.out.println("둘다 보로 비겼습니다.");
				}
			}
		}
		if(a.stair>b.stair) {
			System.out.println(a.name+"가 이겼습니다. 이긴횟수 :"+a.winCnt+" 진 횟수 :"+a.loseCnt+" 비긴 횟수 :"+a.drawCnt);
		}else {
			System.out.println(b.name+"가 이겼습니다. 이긴횟수 :"+b.winCnt+" 진 횟수 :"+b.loseCnt+" 비긴 횟수 :"+b.drawCnt);
		}
		
		
		
	}
}
