package test.for1;

import java.util.Scanner;

public class ForTest4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("수를 입력하세요: ");
		int num = s.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++)
		{
			sum = sum + i;
		}
		System.out.printf("1~%d까지의 합계는 %d입니다.\n",num,sum);
		
		s.close();
		
		
	}

}
