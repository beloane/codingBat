package WarmupTwo;

public class removeVouls {
    public static void main(String[] args) {
        String word = "abecedar";
        remove(word);
    }


    public static void remove(String word) {
        String wordDone = "";
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (int i = 0; i < word.length(); i++) {
            if ((word.charAt(i) != vowels[0])
                    && (word.charAt(i) != vowels[1])
                    && (word.charAt(i) != vowels[2])
                    && (word.charAt(i) != vowels[3])
                    && (word.charAt(i) != vowels[4])
                    && (word.charAt(i) != vowels[5])
                    && (word.charAt(i) != vowels[6])
                    && (word.charAt(i) != vowels[7])
                    && (word.charAt(i) != vowels[8])
                    && (word.charAt(i) != vowels[9]))
                wordDone = wordDone + word.charAt(i);
        }
        System.out.println(wordDone);
    }
}



