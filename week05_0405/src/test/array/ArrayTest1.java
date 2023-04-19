package test.array;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		String[] subjects = {"국어","영어","수학","화학","생명"};
		int[] scores = new int[5];
		int sum = 0;
		double avg = 0;
		
		Scanner s = new Scanner(System.in);
//	과목별로 성적을 입력받아서 scores 에 저장
		System.out.println("과목별 성적을 입력해주세요.");
		for(int i = 0; i < scores.length; i++)
		{
			System.out.println(subjects[i] +":");
			scores[i] = s.nextInt();
			sum += scores[i];
		}
		avg = sum / (double)subjects.length;
//	출력		
		for(int i = 0; i < scores.length; i++)
		{
			System.out.printf("%s: %d점\t", subjects[i], scores[i]);
		}
		System.out.println();
		System.out.printf("총합계 %d점\n평균은 %.2f", sum, avg);
		
		s.close();
	}

}
