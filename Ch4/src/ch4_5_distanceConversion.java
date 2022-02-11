import java.util.Scanner;

public class ch4_5_distanceConversion {
    /**
     * ex4_5
     * Author:Yu-Ching, Liu
     */
    public static void main(String[] args) {
        //1 mile = 1.609 kilometers
        double mile, kilometer;
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入英里（miles）：");
        mile = scanner.nextDouble();
        kilometer = mile * 1.609;
        System.out.printf("%6.2f 英里是 %1.2f 公里",mile , kilometer);

    }
}
