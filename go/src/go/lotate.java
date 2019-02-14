/**
 * @Summary   : 
 * @Package : go
 * @FileName : lotate.java
 * @Author : Yang TaeIl
 * @date : 2018. 10. 18.  
 * 
 */
package go;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @Package : go
 * @FileName : lotate.java
 * @Author : Yang TaeIl
 * @date : 2018. 10. 18. 
 * 
 */
public class lotate {
	static BufferedWriter bw;
	static {
		try {
			bw = new BufferedWriter(new FileWriter("C:\\Users\\xoxod\\eclipse-workspace\\go\\src\\go\\resultLotate.csv"));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		int[][] mtrx = new int[964][362];
		try {
			csvToMtrx("C:\\Users\\xoxod\\eclipse-workspace\\go\\src\\go\\result.csv", mtrx);
			for(int i=0;i<mtrx.length;i++) {
				mtrxLotate(mtrx[i]);
			}
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void csvToMtrx(String filePath, int[][] mtrx) throws IOException {
		try {
			//read csv data file
			File csv = new File(filePath);
			BufferedReader br = new BufferedReader(new FileReader(csv));
			String line = "";
			String[] field = null;
			
			for(int i=0; i<mtrx.length; i++) {
				if((line=br.readLine())!= null) {
					field = line.split(",");
					for(int j=0; j<field.length; j++) {
						mtrx[i][j] = Integer.parseInt(field[j]);
					}
				}
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void mtrxLotate(int[] mtrx) {
		int[][] tmp = new int[19][19];
		int[][] resultArr = new int[19][19];
		for(int i=0;i<mtrx.length;i++) {
			if(i==mtrx.length-1) {
				tmp[mtrx[i]/19][mtrx[i]%19]=3;
				break;
			}
			tmp[i/19][i%19]=mtrx[i];
		}
		for(int x=0;x<4;x++) {
			if(x==0) {
				for(int j=0;j<tmp.length;j++) {
					for(int i=tmp.length-1,z=0;i>-1;i--,z++) {
						resultArr[j][z]=tmp[i][j];
					}
				}
			}else {
				tmp = resultArr;
				resultArr = new int[19][19];
				for(int j=0;j<tmp.length;j++) {
					for(int i=tmp.length-1,z=0;i>-1;i--,z++) {
						resultArr[j][z]=tmp[i][j];
					}
				}
			}
			printArr(resultArr);
		}
		tmp = resultArr;
		resultArr = new int[19][19];
		for(int i=0;i<tmp.length;i++) {
			for(int j=0;j<tmp.length;j++) {
				resultArr[j][i]=tmp[i][j];
			}
		}
		for(int x=0;x<4;x++) {
			tmp = resultArr;
			resultArr = new int[19][19];
			for(int j=0;j<tmp.length;j++) {
				for(int i=tmp.length-1,z=0;i>-1;i--,z++) {
					resultArr[j][z]=tmp[i][j];
				}
			}
			printArr(resultArr);
		}
	}
	
	public static void printArr(int[][] mtrx) {
		int saveI=-1,saveJ=-1;
		try {
			for(int i=0;i<mtrx.length;i++) {
				for(int j=0;j<mtrx.length;j++) {
					if(mtrx[i][j]==3) {
						saveI=i;
						saveJ=j;
						bw.write(0+"");
					}else {
						bw.write(mtrx[i][j]+"");
					}
					bw.write(',');
				}
			}bw.write((saveI*19+saveJ)+"");
			bw.newLine();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
