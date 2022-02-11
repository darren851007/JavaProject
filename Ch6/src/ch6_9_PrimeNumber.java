import java.util.Scanner;

public class ch6_9_PrimeNumber {
    /**
     * ex6-9
     * Author:Yu-Ching, Liu
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enter_Num;
        boolean isPrime = true;
        System.out.print("請輸入一數字：");
        enter_Num = scanner.nextInt();
        if( enter_Num == 2){
            System.out.println(enter_Num);
        }
        for(int i = 3; i <= enter_Num; i++){
            isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j ==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}
