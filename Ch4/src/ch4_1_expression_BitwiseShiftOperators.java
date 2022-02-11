public class ch4_1_expression_BitwiseShiftOperators {
    /**
     * ex4_1
     * Author:Yu-Ching, Liu
     */
    public static void main(String[] args) {
        /**
         * (a) x = 6 * 8 - 7 * 6　>> 2
         * (b) x = 6 >> 5 * 8 - 10 * 4 + 1
         * (c) x = 5 + 6 << 2
         * (d) x = 7 * 3 + 8 >> 3
         */
        int a = 6 * 8 - 7 * 6 >> 2;      //  6 >> 2 =>  0110 >> 2 =>   0001 = 1
        int b = 6 >> 5 * 8 - 10 * 4 + 1; //  6 >> 1 =>  0110 >> 1 =>   0011 = 3
        int c = 5 + 6 << 2;              // 11 << 2 =>  1011 << 2 => 101100 = 44
        int d = 7 * 3 + 8 >> 3;          // 29 >> 3 => 11101 >> 3 =>  00011 = 3

        System.out.printf("%d%n",a);
        System.out.printf("%d%n",b);
        System.out.printf("%d%n",c);
        System.out.printf("%d%n",d);
    }
}
