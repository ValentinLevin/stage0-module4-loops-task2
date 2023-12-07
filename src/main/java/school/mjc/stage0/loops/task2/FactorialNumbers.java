package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int result = 1;
        int index = 0;
        while (index <= printToInclusive) {
            result *= index < 1 ? 1 : index;
            System.out.println(result);
            index++;
        }
    }
}
