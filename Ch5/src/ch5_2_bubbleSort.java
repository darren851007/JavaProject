import java.util.Scanner;

public class ch5_2_bubbleSort {
    /**
     * ex5-2
     * Author:Yu-Ching, Liu
     */
    public static void main(String[] args) {
        int [] x = new int[3];
        int temp;
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入 3 個整數(數字間用空白隔開)：");
        x[0] = scanner.nextInt();
        x[1] = scanner.nextInt();
        x[2] = scanner.nextInt();

        for( int i =0 ; i<=x.length-1 ; i++ ){
            for( int j = i+1 ; j<=x.length-1 ; j++ ){
                if( x[i] < x[j] ){
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        System.out.printf("大到小分別是 %d, %d, %d",x[0],x[1],x[2]);
    }
}
