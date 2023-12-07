package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power >= 0) {
            int result = 1;
            int index = 0;
            while (index <= power) {
                result *= index < 1 ? 1 : 2;
                index++;
                System.out.println(result);
            }
        } else {
            System.out.println("too much power");
        }
    }
}
