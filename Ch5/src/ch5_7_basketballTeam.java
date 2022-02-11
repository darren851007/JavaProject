import java.util.Scanner;

public class ch5_7_basketballTeam {
    /**
     * ex5-7
     * Author:Yu-Ching, Liu
     */
    public static void main(String[] args) {
        /**
         *          身高             位置
         *         <=191            後衛
         *     >=192 && <=199       前鋒
         *         >=200            中鋒
         */
        Scanner scanner = new Scanner(System.in);
        double height;
        System.out.print("請輸入身高(公分)：");
        height = scanner.nextInt();

        if(height <= 191)
            System.out.print("這是後衛人選");
        else if(height >= 192 && height <= 199)
            System.out.print("這是前鋒人選");
        else
            System.out.print("這是中鋒人選");
    }
}
