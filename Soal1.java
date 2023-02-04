package soal1;

import java.util.*;

/**
 *
 * @author aulaw
 */

public class Soal1 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        String[] sentences = splitSentences(sentence);

        System.out.println(sentences.length);
        for (int i = 0; i < sentences.length; i++) {
            System.out.println(sentences[i]);
        }
    }

    /**
     *
     * @param sentence adalah parameter untuk method splitSentence
     * @return untuk mengembalikan string input yang telah dipisah
     */
    public static String[] splitSentences(String sentence) {
        return sentence.split("[@'!.?, _]+");
    }
}

