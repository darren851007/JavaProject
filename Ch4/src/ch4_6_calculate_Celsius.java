import java.util.Scanner;

public class ch4_6_calculate_Celsius {
    /**
     * ex4_6
     * Author:Yu-Ching, Liu
     */
    public static void main(String[] args) {
        // C = ( F - 32 ) * 5 / 9
        int fahrenheit;
        double celsius;
        Scanner scanner = new Scanner(System.in);



        System.out.print("請輸入華氏溫度：");
        fahrenheit = scanner.nextInt();
        celsius = ( fahrenheit - 32 ) * 5 / 9;
        System.out.printf("攝氏溫度是：%6.2f", celsius);
    }
}
