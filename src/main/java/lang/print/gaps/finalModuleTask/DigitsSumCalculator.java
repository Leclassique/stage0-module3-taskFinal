package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int one = number / 1000;
        int two = (number - one*1000) / 100;
        int three = (number - one*1000-two*100) / 10;
        int four = number - one*1000-two*100-three*10;
        System.out.println(one+two+three+four);
    }
}
