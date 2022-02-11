import java.util.Scanner;

public class ch5_5_dayOfWeek {
    /**
     * ex5-5
     * Author:Yu-Ching, Liu
     */
    public static void main(String[] args) {
        /**
         * 假設今天為星期日
         * N天後為星期幾
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("今天是星期日，請輸入天數：");
        int days = scanner.nextInt();

        switch (days % 7){
            case 0:
                System.out.printf("%d天後是星期天",days);
                break;
            case 1:
                System.out.printf("%d天後是星期一",days);
                break;
            case 2:
                System.out.printf("%d天後是星期二",days);
                break;
            case 3:
                System.out.printf("%d天後是星期三",days);
                break;
            case 4:
                System.out.printf("%d天後是星期四",days);
                break;
            case 5:
                System.out.printf("%d天後是星期五",days);
                break;
            case 6:
                System.out.printf("%d天後是星期六",days);
                break;
        }

    }
}
