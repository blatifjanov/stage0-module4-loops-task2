package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive == 0) {
            return;
        }
        int count=0;
        if (multiplyByAndToInclusive < 0) {
            multiplyByAndToInclusive *= -1;
            while (count <= multiplyByAndToInclusive) {
                System.out.println(-1 * count * multiplyByAndToInclusive);
                count++;
            }
        } else {
            while (count <= multiplyByAndToInclusive) {
                System.out.println(count * multiplyByAndToInclusive);
                count++;
            }


        }
    }
}
