public class ch4_8_leibniz {
    /**
     * ex4_8
     * Author:Yu-Ching, Liu
     */
    public static void main(String[] args) {
        /**萊布尼茲公式
        PI = 4  * ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + ..... )
         * (a) PI = 4  * ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 )
         * (b) PI = 4  * ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 )
         * (c) PI = 4  * ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 )
        */
        double PI;
        PI = (4  * ( 1 - 1.0/3.0 + 1.0/5 - 1.0/7 + 1.0/9 ));
        System.out.println("4 * (1 - 1/3 + 1/5 - 1/7 + 1/9) = " + PI);
        leibniz(5);
        PI = (4  * ( 1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 ));
        System.out.println("4  * ( 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 ) = "+ PI );
        PI = (4  * ( 1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13 ));
        System.out.println("4  * ( 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 ) = " + PI );
    }


    public static void leibniz(int num){

            double result = 0;
            for(int i = 1;i <= num;i++) {
                double b = 2 * i - 1;
                if(i % 2 == 1) {
                    result = result + 1 / b;
                } else {
                    result = result - 1 / b;
                }
            }
            System.out.printf("%f%n", (4*result));
    }
}
