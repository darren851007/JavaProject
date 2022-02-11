public class ch6_6_PrintStar {
    /**
     * ex6-6
     * Author:Yu-Ching, Liu
     */
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10 - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
