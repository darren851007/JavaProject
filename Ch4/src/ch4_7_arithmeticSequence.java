import java.util.Scanner;

public class ch4_7_arithmeticSequence {
    /**
     * ex4_7
     * Author:Yu-Ching, Liu
     */
    public static void main(String[] args) {
        //高斯數學等差數列運算
        int start, end, d_value ,sum;
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入數列起始值：");
        start = scanner.nextInt();
        System.out.print("請輸入數列終點值：");
        end = scanner.nextInt();
        System.out.print("請輸入數列差異值：");
        d_value = scanner.nextInt();

        sum = ( start + end ) * (( end - start ) / d_value + 1 ) / 2 ;

        System.out.printf("%d 到 %d 差值是 %d 的數列總和是： %d", start, end, d_value, sum);

    }
}
