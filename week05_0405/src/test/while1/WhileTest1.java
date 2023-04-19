package test.while1;

import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("성명 입력: ");
			String name = s.nextLine();//이름을 입력받음
			
			System.out.println(name + "님 환영합니다.");
			
			System.out.println("계속 하시겠습니까? (y/n) :");
			String end = s.nextLine();// y와 n 중에 값을 새로 받음
			if(end.equals("n")) // == 말고 equals로 비교하기 (문자열 비교할때)
				break;
		}
		
		s.close();
	}
	
}
