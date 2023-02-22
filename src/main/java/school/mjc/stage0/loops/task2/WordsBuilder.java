package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int length = chars.length;
        String[] arr = new String[length];
        int index = 0;
        while (index < length) {
            System.out.print(chars[index]);
            index++;
        }

    }
}
