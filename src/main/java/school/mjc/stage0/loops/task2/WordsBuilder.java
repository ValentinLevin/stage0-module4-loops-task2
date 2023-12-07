package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int index = 0;
        int charCount = chars.length;
        while (index < charCount) {
            System.out.print(chars[index]);
            index++;
        }
//        System.out.println();
    }
}
