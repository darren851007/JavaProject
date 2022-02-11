import java.text.DecimalFormat;
import java.util.Scanner;

public class ch5_6_BMI {
    /**
     * ex5-6
     * Author:Yu-Ching, Liu
     */
    public static void main(String[] args) {
        /**
         *          BMI                       分類
         *       BMI<18.5                    體重過輕
         *       BMI >= 18.5 && BMI < 24       正常
         *       BMI >= 24 && BMI < 28         超重
         *       BMI >= 28                     肥胖
         */
        DecimalFormat frmt = new DecimalFormat(); // 設定小數點限制
        Scanner scanner = new Scanner(System.in);
        System.out.printf("請輸入身高(公分) : ");
        double height = scanner.nextDouble();
        System.out.printf("請輸入體重(公斤) : ");
        double weight = scanner.nextDouble();
        double bmi;
        bmi = weight / ((height / 100) * (height / 100));

        frmt.setMaximumFractionDigits(2);
        System.out.print("BMI = " + frmt.format(bmi) + "\t");

        if(bmi < 18.5)
            System.out.println("體重過輕");
        else if (bmi >= 18.5 && bmi < 24)
            System.out.println("體重正常");
        else if (bmi >= 24 && bmi < 28)
            System.out.println("體重超重");
        else
            System.out.println("體重肥胖");
    }
}
