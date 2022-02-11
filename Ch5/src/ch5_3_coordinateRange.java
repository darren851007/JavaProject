import java.util.Scanner;

public class ch5_3_coordinateRange {
    /**
     * ex5-3
     * Author:Yu-Ching, Liu
     */
    public static void main(String[] args) {
        /**
         * 判斷是否在半徑20的範圍內
         * 中心座標為(0,0)
         */
        double x, y, distance;
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入點座標(數字間用空白隔開)：");
        x = scanner.nextInt();
        y = scanner.nextInt();
        distance = Math.sqrt((Math.pow(x,2) + Math.pow(y,2)));

        System.out.printf("%s",(distance<=20?"座標在圓內":"座標在圓外"));




    }
}
