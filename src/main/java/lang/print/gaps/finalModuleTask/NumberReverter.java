package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public static void revert(int number) {
        int result = ((number%10)*100) + ((number%100)-((number%100)%10)) + (number/100);
        System.out.println(result);
    }
    public static void main(String[] args) {
        revert(657);
    }
}
