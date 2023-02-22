package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        if (printToInclusive == 0) {
            System.out.println("1");
            return;
        }
        int num = 0;
        int result = 1;
        while (num <= printToInclusive) {
            if (num == 0) {
                System.out.println("1");
            } else {
                result *= num;
                System.out.println(result);
            }
            num++;

        }
    }
}
