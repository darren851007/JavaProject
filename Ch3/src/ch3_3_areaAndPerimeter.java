public class ch3_3_areaAndPerimeter {
    /**
     * ex3_3
     * Author:Yu-Ching, Liu
     */
    public static void main(String[] args) {
        int high = 5, width = 10;               //設定長寬
        int area = high * width;                //面積 = 長 * 寬
        int perimeter = ( high + width ) * 2;   //周長 = (長 + 寬) * 2
        System.out.println("面積：" + area);
        System.out.println("周長：" + perimeter);
    }
}
