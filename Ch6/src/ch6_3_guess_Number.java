import java.util.Random;
import java.util.Scanner;

public class ch6_3_guess_Number {
    /**
     * ex6-3
     * Author:Yu-Ching, Liu
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int res_num = random.nextInt(100);
        int g_Num = 0;
        int count = 0;
        char q = ' ';
        while( q!='Q' ){
            System.out.print("請猜0-99的數字：");
            g_Num = scanner.nextInt();
            q = Integer.toString(g_Num).charAt(0);
            if( g_Num < res_num ){
                System.out.println("請猜大一點!");
                count++;
                System.out.print("請問是否要繼續?(Y/N)");
                q = scanner.next().charAt(0);
                if(q =='N'|| q == 'n') break;
                else continue;
            }
            else if( g_Num > res_num ) {
                System.out.println("請猜小一點!");
                count++;
                System.out.print("請問是否要繼續?(Y/N)");
                q = scanner.next().charAt(0);
                if(q =='N') break;
                else continue;
            }
            else {
                System.out.println("恭喜猜對了!!");
                count++;
                break;
            }
        }
        System.out.printf("總共猜了%d次",count);
    }
}
