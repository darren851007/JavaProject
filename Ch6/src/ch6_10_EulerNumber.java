import java.text.DecimalFormat;

public class ch6_10_EulerNumber {
    /**
     * ex6-9
     * Author:Yu-Ching, Liu
     */
    public static void main(String[] args) {
        double e = 1;
        double data = 1;

        for (int i = 1; i <= 100; i++) {
            data = data / i;
            e += data;

            if(i % 10 == 0){
                System.out.printf("當 i = %d , e = %.14f%n",i,e);
            }
        }
    }

}

