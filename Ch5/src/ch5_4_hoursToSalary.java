import java.util.Scanner;

public class ch5_4_hoursToSalary {
    /**
     * ex5-4
     * Author:Yu-Ching, Liu
     */
    public static void main(String[] args) {
        /**
         * 基本時薪為 150
         * 小於40小時/週 時薪為基本時薪的0.8倍
         * 等於40小時/週 時薪為基本時薪
         * 大於40小時/週，且50小時(含)內，時薪為基本時薪1.2倍
         * 大於50小時/週 時薪為基本時薪的1.6倍
         *  *
         */


        final double s_perHour = 150;
        double sum = 0, h_PerWeek;
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入本週工作時數：");
        h_PerWeek = scanner.nextInt();

        if(h_PerWeek < 40){
            sum = s_perHour * h_PerWeek * 0.8;
        }
        else if(h_PerWeek == 40){
            sum = s_perHour * h_PerWeek;
        }
        else if(h_PerWeek > 40 && h_PerWeek <=50){
            sum = s_perHour * h_PerWeek * 1.2;
        }
        else {
            sum = s_perHour * h_PerWeek * 1.6;
        }
        System.out.printf("本週薪資：%.1f",sum);
    }
}
