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
		System.out.println("����� ���� �������ּ���");
		int stair = sc.nextInt();
		System.out.println("������������ �����մϴ�.");
		while(a.stair<stair&&b.stair<stair) {
			if(a.doRSP()==1) {
				if(b.doRSP()==1) {
					a.draw();b.draw();
					System.out.println("�Ѵ� ������ �����ϴ�.");
				}else if(b.doRSP()==2) {
					a.lose();b.win();b.stair=b.stair+1;
					System.out.println(b.name+"�� ������ �̰���ϴ�."+b.stair+"° ����Դϴ�.");
				}else {
					b.lose();a.win();a.stair=a.stair+2;
					System.out.println(a.name+"�� ������ �̰���ϴ�."+a.stair+"° ����Դϴ�.");
				}
			}else if(a.doRSP()==2) {
				if(b.doRSP()==1) {
					b.lose();a.win();a.stair=a.stair+1;
					System.out.println(a.name+"�� ������ �̰���ϴ�."+a.stair+"° ����Դϴ�.");
				}else if(b.doRSP()==2) {
					a.draw();b.draw();
					System.out.println("�Ѵ� ������ �����ϴ�.");
				}else {
					a.lose();b.win();b.stair=b.stair+5;
					System.out.println(b.name+"�� ���� �̰���ϴ�."+b.stair+"° ����Դϴ�.");
				}
			}else {//��
				if(b.doRSP()==1) {
					a.lose();b.win();b.stair=b.stair+2;
					System.out.println(b.name+"�� ������ �̰���ϴ�."+b.stair+"° ����Դϴ�.");
				}else if(b.doRSP()==2) {
					b.lose();a.win();a.stair=a.stair+5;
					System.out.println(a.name+"�� ���� �̰���ϴ�."+a.stair+"° ����Դϴ�.");
				}else {
					a.draw();b.draw();
					System.out.println("�Ѵ� ���� �����ϴ�.");
				}
			}
		}
		if(a.stair>b.stair) {
			System.out.println(a.name+"�� �̰���ϴ�. �̱�Ƚ�� :"+a.winCnt+" �� Ƚ�� :"+a.loseCnt+" ��� Ƚ�� :"+a.drawCnt);
		}else {
			System.out.println(b.name+"�� �̰���ϴ�. �̱�Ƚ�� :"+b.winCnt+" �� Ƚ�� :"+b.loseCnt+" ��� Ƚ�� :"+b.drawCnt);
		}
		
		
		
	}
}
