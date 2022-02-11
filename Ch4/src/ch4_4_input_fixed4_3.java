import java.util.Scanner;

public class ch4_4_input_fixed4_3 {
    /**
     * ex4_4
     * Author:Yu-Ching, Liu
     */
    public static void main(String[] args) {
        int x;
        double sum;
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入小於10的整數：");
        x = scanner.nextInt();
        sum = Math.pow(x,2);
        System.out.printf("%d 的平方是：%6.2f%n",x,sum);
        sum = Math.pow(x,3);
        System.out.printf("%d 的立方是：%5.2f",x,sum);
    }
}
