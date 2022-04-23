package JAVA_BOOK;
import java.util.*;
import java.io.*;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//    *
		//   **
		//  ***
		// ****
		//*****
		
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {  //다이아의 높이
			for (int j = 0; j < num; j++) {  //다이아의 가로길이
				if(i <= num/2) { // 위쪽 영역
					if(i + j <= num/2 - 1) // 왼쪽 위 공백찍기

						System.out.print(" ");
					else if(j - i >= num/2 + 1) //오른쪽 위 공백찍기
						System.out.print(" ");
					else
						System.out.print("*");//*찍기
				}
				else if(i > num/2){//아래쪽 영역
					if (i - j >= num/2 + 1)//왼쪽 밑 공백
						System.out.print(" ");
					else if (i + j >= num/2 * 3 + 1)//오른쪽 밑 공백
						System.out.print(" ");
					else 
						System.out.print("*");// *찍기
				}
			}
			System.out.println();// 줄바꿈
		}

//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 3 - i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < i * 2 + 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = 0; i < 3; i++) {
//			System.out.print(" ");
//			for (int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < 3 - i; j++) {
//				System.out.print("*");
//				
//			}
//			for (int j = 0; j < 2 - i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
	}

}

