package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        long sum = 0;
        long n = Long.parseLong("9".repeat(lengthOfLastNumber));

        for (int i = 1; i <= lengthOfLastNumber; i++) {
            long term = Long.parseLong("9".repeat(i));
            sum += term;
        }

        System.out.printf(String.valueOf(sum));

    }
}
