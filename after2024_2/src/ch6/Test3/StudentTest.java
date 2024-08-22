package ch6.Test3;

public class StudentTest {

    public static void main(String[] args) {
        // 과목별 총점
        int[][] score = {{94,82,100},
                        {76,75,90},
                        {92,90,92},
                        {86,90,75},
                        {99,94,100}};
        // 과목별 총점
        int korTotal = 0, engTotal = 0, mathTotal = 0;

        System.out.println("번호 국어 영어 수학 총점 평균");
        System.out.println("=============================");

        for (int i = 0; i < score.length; i++)
        {
            int sum = 0; // 개인별 총점
            float avg = 0.0f; // 개인별 평균

            korTotal += score[i][0]; // 국어 전체 합
            engTotal += score[i][1]; // 영어 전체 합
            mathTotal += score[i][2]; // 수학 전체 합

            System.out.printf("%3d", i+1); // 입력된 건 수, 차례대로 출력

            for (int j = 0; j < score[i].length; j++)
            {
                sum += score[i][j]; // 개인 전체 합(국어+영어+수학)

                System.out.printf("%5d", score[i][j]);
            }

            avg = (float)sum / score[i].length; // 개인 전체 합 / 과목 수
            System.out.printf("%7d %5.1f%n", sum, avg);
        }

        int total = korTotal + engTotal + mathTotal; // 전체 총점
        float average = (float)total / (score.length * 3); // 전체 평균
        System.out.println("==================================");
        System.out.printf("총점:%4d %4d %4d %6d %5.1f%n", korTotal, engTotal, mathTotal, total, average);
        System.out.printf("총점:%6.1f %3.1f %3.1f%n", (float)korTotal/score.length, (float)engTotal/score.length,(float)mathTotal/score.length);
    }
}
