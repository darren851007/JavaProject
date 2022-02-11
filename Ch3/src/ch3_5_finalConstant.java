public class ch3_5_finalConstant {
    /**
     * ex3_5
     * Author:Yu-Ching, Liu
     */
    public static void main(String[] args) {
        final double pi = 3.14159;
        double radius = 10;
        double circle_area = circle_area( radius, pi);
        double circle_perimeter = circle_perimeter( radius, pi );

        System.out.println("r = " + radius + "， 圓周長 = " + circle_perimeter);
        System.out.println("r = " + radius + "， 圓面積 = " + circle_area);

        radius = 20 ;
        circle_area( radius, pi);
        circle_perimeter( radius, pi );
        System.out.println("r = " + radius + "， 圓周長 = " + circle_perimeter( radius, pi ));
        System.out.println("r = " + radius + "， 圓面積 = " + circle_area( radius, pi));

    }

    public static double circle_area(double r, final double pi){
        double circle_area = Math.pow(r,2) * pi;
        return circle_area;
    }
    public static double circle_perimeter(double r, final double pi){
        double circle_perimeter = 2 * pi * r;
        return circle_perimeter;
    }


}
