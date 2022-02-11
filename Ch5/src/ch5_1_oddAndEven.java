import java.util.Scanner;

public class ch5_1_oddAndEven {
    /**
     * ex5-1
     * Author:Yu-Ching, Liu
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.print("請輸入整數：");
        a = scanner.nextInt();

        if(a == 0)
            System.out.println("輸入是0");
        else if ( a % 2 == 0 )
            System.out.println("輸入是偶數");
        else
            System.out.println("輸入是奇數");


    }
}
