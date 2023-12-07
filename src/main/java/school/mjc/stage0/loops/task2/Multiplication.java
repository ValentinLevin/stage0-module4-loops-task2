package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive != 0) {
            int index = 0;
            int iterationCount = multiplyByAndToInclusive < 0 ? -multiplyByAndToInclusive : multiplyByAndToInclusive;
            while (index <= iterationCount) {
                System.out.println(index * multiplyByAndToInclusive);
                index++;
            }
        }
    }
}
