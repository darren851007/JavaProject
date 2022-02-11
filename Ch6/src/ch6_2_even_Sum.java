public class ch6_2_even_Sum {
    /**
     * ex6-2
     * Author:Yu-Ching, Liu
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i =1; i<=100; i++){
            if(i%2 == 0)
                sum += i;
            else continue;
        }
        System.out.print("Sum = "+ sum);
    }
}
