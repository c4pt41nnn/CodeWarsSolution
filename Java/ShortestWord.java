import java.util.Arrays;

public class Kata {
    public static int findShort(String s) {
        int l = Integer.MAX_VALUE;
        String[] words=s.split("\\s");
        for (int i=0;i<words.length;i++) {
          l = Math.min(l, words[i].length());
        }
        return l;
    }
}

// Esse aqui eu tive ajuda de um gringo, esqueci o nome dele mas mesmo assim obrigado <3. 
