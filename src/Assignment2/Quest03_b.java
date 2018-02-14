package Assignment2;

import java.util.StringTokenizer;

public class Quest03_b {

	public static void main(String[] args) {
        String[] words = { "oracle" };
        for (int i = 0 ; i < words.length ; i++) {
            words[i] = Reverse(words[i]);
        }
        for (int i = 0 ; i < words.length ; i++) {
            System.out.println(words[i]);
        }
    }
    private static String Reverse(String str) {
        StringBuilder result = new StringBuilder();
        StringTokenizer st = new StringTokenizer(str, "");
        while (st.hasMoreTokens()) {
            StringBuilder thisToken = new StringBuilder(st.nextToken());
            result.append(thisToken.reverse() + " ");
        }
        return result.toString();
    }
}