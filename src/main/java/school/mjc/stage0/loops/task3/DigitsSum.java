package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number){
        int sum = 0;
        String numberStr = Integer.toString(number);
        for(int i = 0; i < numberStr.length(); i++){
            char digitChar = numberStr.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            sum += digit;

        }
        System.out.println(sum);
    }
}
