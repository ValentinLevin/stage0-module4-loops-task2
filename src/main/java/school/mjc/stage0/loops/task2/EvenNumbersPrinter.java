package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int index = 0;
        while (index <= printTillInclusive) {
            System.out.println(index);
            index += 2;
        }
    }
}
