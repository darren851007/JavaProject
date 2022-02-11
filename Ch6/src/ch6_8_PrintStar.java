import java.util.Scanner;

public class ch6_8_PrintStar {
    /**
     * ex6-8
     * Author:Yu-Ching, Liu
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width,high;
        System.out.print("請輸入高度：");
        high = scanner.nextInt();
        System.out.print("請輸入寬度：");
        width = scanner.nextInt();
        for(int i = 1;  i  <= high; i++){
            for(int j=1; j <= width; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
