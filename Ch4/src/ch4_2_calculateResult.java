public class ch4_2_calculateResult {
    /**
     * ex4_2
     * Author:Yu-Ching, Liu
     */
    public static void main(String[] args) {
            int s = 0,
                a = 10,
                b = 18,
                c = 5;

        /**
         * (a) s = a + b - c
         * (b) s = 2 * a + 3 - c
         * (c) s = b * c + 18 / b
         * (d) s = a % c * b + 10
         * (e) s = a * c - a * b * c
         */
        s = a + b - c;
        System.out.printf("%d%n",s);
        s = 2 * a + 3 - c;
        System.out.printf("%d%n",s);
        s = b * c + 18 / b;
        System.out.printf("%d%n",s);
        s = a % c * b + 10;
        System.out.printf("%d%n",s);
        s = a * c - a * b * c;
        System.out.printf("%d%n",s);


    }
}
