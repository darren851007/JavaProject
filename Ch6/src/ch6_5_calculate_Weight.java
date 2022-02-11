import java.util.Scanner;

public class ch6_5_calculate_Weight {
    /**
     * ex6-5
     * Author:Yu-Ching, Liu
     */
    public static void main(String[] args) {
        double weight, addWeight_perYear, years;
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入目前體重：");
        weight = scanner.nextDouble();
        System.out.print("請輸入每年增重：");
        addWeight_perYear = scanner.nextDouble();
        System.out.print("請輸入年份：");
        years = scanner.nextDouble();

        for(int i =1; i<=years; i++){
            weight+=addWeight_perYear;
            System.out.printf("第%d年重：%.2f%n",i,weight);
        }


    }
}
