import java.util.Scanner;

public class ch4_3_input {
    /**
     * ex4_3
     * Author:Yu-Ching, Liu
     */
    public static void main(String[] args) {
        int x;
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入小於10的整數：");
        x = scanner.nextInt();
        sum = Math.pow(x,2);
        System.out.printf("平方是：%4.2f%n",sum);
        sum = Math.pow(x,3);
        System.out.printf("立方是：%6.2f",sum);

    }
}
