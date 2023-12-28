package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public static void calculateSum(int number) {
        int res = (number/1000) + ((number%1000)/100) + ((number%100)/10) + (number%10);
        System.out.println(res);
    }
    public static void main(String[] args) {
        calculateSum(2897);
    }
}
