package ch05;

public class EX5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		double average = 0f;
		
		int[] score = { 98, 100, 88, 90, 92, 100, 99 };
		
		for (int i=0; i < score.length ; i++) {
		
             sum += score[i];
		}
    // 계산결과를 double로 얻기 위해서 형변환
	average = sum / (double) score.length;
	//average = sum / 5.;
	
	System.out.println("Array: " + score.length);
	System.out.println("총점 : " + sum);
	System.out.println("평균 : " + average);
	}
}
