package Ch07;
import java.util.*;

public class C02While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 전체구구단(가로)
//		int dan = 2;
//		int i = 2;
//		while(dan <= 9) {
//			i = 2;
//			while(i <= 9) {
//				System.out.print(i + " x " + dan + " = " + dan * i + "\t");
//				i++;
//			}
//			System.out.println();
//			dan++;
//			
//		}

		// 전체구구단(세로)
//		int dan = 2;
//		int i = 1;
//		while(dan <= 9) {
//			i = 1;
//			while(i <= 9) {
//				System.out.printf("%d x %d = %d\n",dan,i,(dan*i));
//				i++;
//			}
//			System.out.println();
//			dan++;
//			
//		}
		
		//전체 구구단을 역순출력합니다
		//9 x 1 = 9
		//9 x 2 = 18
		//..
		//2 x 2 = 4
		//2 x 1 = 2
//		int dan = 9;
//		int i = 1;
//		while(dan >= 2) {
//			i = 1;
//			while(i <= 9) {
//				System.out.printf("%d x %d = %d\n",dan,i,(dan*i));
//				i++;
//			}
//			System.out.println();
//			dan--;
//			
//		}
		// 9 x 9 = 81
		// 9 x 8 = 72
		//....
		// 2 x 2 = 4
		// 2 x 1 = 2
//		int dan = 9;
//		int i = 1;
//		while(dan >= 2) {
//			i = 9;
//			while(i >= 1) {
//				System.out.printf("%d x %d = %d\n",dan,i,(dan*i));
//				i--;
//			}
//			System.out.println();
//			dan--;
//			
//		}
		
		// *****
		// *****
		// *****
		// *****
		// *****
//		for (int i = 0; i <5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// *
		// **
		// ***
		// ****
//		int i = 0;	//행
//		int j = 0;	//별
//
//		while(i < 4) {
//			j = 0;
//			while(j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		// 높이 : 3
		// *
		// **
		// ***
//		int i = 0;
//		int j = 0;
//		System.out.print("높이 : ");
//		int n = sc.nextInt();
//		
//		while(i < n) {
//			j = 0;
//			while(j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		// ****
		// ***
		// **
		// *
//		int i = 4;
//		int j = 0;
//		
//		while(i > 0) {
//			j = 0;
//			while(j < i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i--;
//		}
		

		
		// 높이 : 3
		// ***
		// **
		// *
//		System.out.print("높이 : ");
//		int i = sc.nextInt();
//		int j = 0;
//		
//		while(i > 0) {
//			j = 0;
//			while(j < i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i--;
//		}

		//   *
		//  ***
		// *****
		//*******
		
//		int i = 0;		//높이
//		int j = 0;		//공백
//		int k = 0;		//별
//		
//		while(i < 4) {
//			j = 0;
//			while(j <= 2 - i) {
//				System.out.print(" ");
//				j++;
//			}
//			k = 0;
//			while(k <= 2 * i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
	
		// *****
		// *****
		// *****
//		for (int i = 0; i <= 2; i++) {
//			for (int j = 0; j <= 4; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
				
		// *
		// **
		// ***
		// ****
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
				
		// 높이 : 3
		// *	
		// **
		// ***
//		for (int i = 0; i <= 3; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// ****
		// ***
		// **
		// *
//		for (int i = 4; i >= 0; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
				
		// 높이 : 3
		// ***
		// **
		// *
//		for (int i = 3; i >= 0; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//	}
//	
				
		//   *
		//  ***
		// *****
		//*******
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 3-i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < 2 * i + 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
				
		// 높이 : 3
		//   *
		//  ***
		// *****	
//		int i = 0;		//높이
//		int j = 0;		//공백
//		int k = 0;		//별
//		System.out.print("높이 : ");
//		int h = sc.nextInt();
//		while(i < h) {
//			j = 0;
//			while(j <= h - i) {
//				System.out.print(" ");
//				j++;
//			}
//			k = 0;
//			while(k <= 2 * i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
				
		//*******
		// *****
		//  ***
		//   *
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < 4 - i; j++) {
//				System.out.print("*");
//			}
//			for (int j = 0; j < 3 - i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		int i = 0; //행
//		int j = 0; //공백
//		int k = 0; //별
//		
//		while(i < 4) {
//			j = 0;
//			while(j <= i -1) {
//				System.out.print(" ");
//				j++;
//			}
//			k = 0;
//			while(k <= 6 - (2 * i)) {
//				System.out.print("*");
//				k++;
//				
//			}
//			System.out.println();
//			i++;
//		}
				
		// 높이 : 3
		// *****
		//  ***
		//   *
//		int i = 0; //행
//		int j = 0; //공백
//		int k = 0; //별
//		
//		System.out.print("높이 : ");
//		int h = sc.nextInt();
//		while(i < h) {
//			j = 0;
//			while(j <= i -1) {
//				System.out.print(" ");
//				j++;
//			}
//			k = 0;
//			while(k <= 6 - (2 * i)) {
//				System.out.print("*");
//				k++;
//				
//			}
//			System.out.println();
//			i++;
//		}
//		System.out.print("높이 : ");
//		int n = sc.nextInt();
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print(" ");	
//			}
//			for (int j = 0; j < n - i; j++) {
//				System.out.print("*");
//			}
//			for (int j = 0; j < n - i - 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
				
				
		//   *
		//  ***
		// *****
		//******* 
		// *****
		//  ***
		//   *
		
//		int i = 0; //행
//		int j = 0; //공백
//		int k = 0; //별
//		
//		while(i < 7) {
//			if(i < 4) {
//				//공백 (점점감소)
//				j = 0;
//				while(j <= 2 - i) {
//					System.out.print(" ");
//					j++;
//				}
//				//별 (점점증가)
//				k = 0;
//				while(k <= 2 * i) {
//					System.out.print("*");
//					k++;
//				}
//			}else {
//				j = 0;
//				while(j <= i -4 ) {
//					System.out.print(" ");
//					j++;
//				}
//				while(k <= 6 * 2 - 2 * i) {
//					System.out.print("*");
//					k++;
//				}
//			}
//				System.out.println();
//				i++;
//			}
	

//		
//		 좀더해야함
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.print(" ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 3 - i; j++) {
				System.out.print("*");
				
			}
			for (int j = 0; j < 2 - i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//   *
		//  ***
		// *****
		//  ***
		//   *
		
//		System.out.println(5/2);
//		int num = sc.nextInt();  // 높이
//		System.out.println();
//		for (int i = 0; i < num; i++) { // i는 0부터 시작해서 num[5](높이)가 될떄까지 반복
//			for (int j = 0; j < num; j++) { // j는 0부터 시작해서 num[5](높이)가 될떄까지 반복
//				if(i <= 5/2) { // num[5](높이)을 반으로 잘라 윗부분에 해당하는 영역
//					if(i + j <= 5/2 - 1) // 왼쪽 위 공백찍기(5/2 -1 = 1)이기 때문에 if문안의 공백이 실행됨
//						System.out.print(" ");// 두번 실행 후 한번 실행됨
//					else if(j - i >= 5/2 + 1) //오른쪽 위 공백찍기(5/2 + 1 = 3)이기 떄문에 j - i가 3이될떄까지 공백실행
//						System.out.print(" ");// 마찬가지로 실행
//					else
//						System.out.print("*");// 
//				}else if(i > 5/2){//아래쪽 영역
//					if (i-j >= 5/2+1)//왼쪽 밑 공백
//						System.out.print(" ");
//					else if (i + j >= 5/2 * 3 + 1)//오른쪽 밑 공백
//						System.out.print(" ");
//					else 
//						System.out.print("*");// *찍기
//				}
//			}
//			System.out.println();// 줄바꿈
//		}
		

		// 높이(홀수값) : 3
		//  *
		// ***
		//  *
		
//		int i = 0; //행
//		int j = 0; //공백
//		int k = 0; //별
//		System.out.print("높이 : ");
//		int h = sc.nextInt();
//		
//		while(i < h) {
//			if(i < h/2) {
//				//공백 (점점감소)
//				j = 0;
//				while(j <= (h-2)- i + 1) {
//					System.out.print(" ");
//					j++;
//				}
//				//별 (점점증가)
//				k = 0;
//				while(k <= 2 * i) {
//					System.out.print("*");
//					k++;
//				}
//			}else {
//				j = 0;
//				while(j <= i -(h/2) + 1) {
//					System.out.print(" ");
//					j++;
//				}
//				while(k <= 6 * 2 - 2 * i) {
//					System.out.print("*");
//					k++;
//				}
//			}
//				System.out.println();
//				i++;
//			}
		
		
		
		
//		int num = sc.nextInt();
//		for (int i = 0; i < num; i++) {  //다이아의 높이
//			for (int j = 0; j < num; j++) {  //다이아의 가로길이
//				if(i <= num/2) { // 위쪽 영역
//					if(i + j <= num/2 - 1) // 왼쪽 위 공백찍기
//						System.out.print(" ");
//					else if(j - i >= num/2 + 1) //오른쪽 위 공백찍기
//						System.out.print(" ");
//					else
//						System.out.print("*");//*찍기
//				}else if(i > num/2){//아래쪽 영역
//					if (i - j >= num/2 + 1)//왼쪽 밑 공백
//						System.out.print(" ");
//					else if (i + j >= num/2 * 3 + 1)//오른쪽 밑 공백
//						System.out.print(" ");
//					else 
//						System.out.print("*");// *찍기
//				}
//			}
//			System.out.println();// 줄바꿈
//		}

		//******* 
		// *****
		//  ***
		//   *
		//  ***
		// *****
		//******* 		
				
					
		
	}

}
