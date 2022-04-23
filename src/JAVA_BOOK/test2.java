package JAVA_BOOK;
import java.util.*;

public class test2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {  //다이아의 높이
			for (int j = 0; j < num; j++) {  //다이아의 가로길이
				if (i <= num / 2) { // 위쪽 영역
					if (i + j <= num / 2 - 1) // 왼쪽 위 공백찍기
						System.out.print(" ");
					else if (j - i >= num / 2 + 1) //오른쪽 위 공백찍기
						System.out.print(" ");
					else
						System.out.print("*");//*찍기
				}
			}
			System.out.println();
		}
	}
}
