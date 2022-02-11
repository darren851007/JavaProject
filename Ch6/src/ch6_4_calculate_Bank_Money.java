import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Scanner;

public class ch6_4_calculate_Bank_Money {
    /**
     * ex6-4
     * Author:Yu-Ching, Liu
     */
    public static void main(String[] args) {
        double save_Money, years, rate; //本金, 年分, 利率
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入存款本金：");
        save_Money = scanner.nextDouble();
        System.out.print("請輸入存款年數：");
        years = scanner.nextDouble();
        System.out.print("請輸入存款年利率(%)：");
        rate = scanner.nextDouble() / 100;
        df.format(rate);
        calculateSum(save_Money,years,rate);




    }
    public static void calculateSum(double save_Money, double years, double rate){
        double sum = 0;
        for(int i =1; i<=years; i++){
            save_Money *= (1+rate);
            System.out.printf("第 %d 年本金和：%.1f%n", i, save_Money);
        }




    }
}
