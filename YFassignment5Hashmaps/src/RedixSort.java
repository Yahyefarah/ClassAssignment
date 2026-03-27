import java.util.ArrayList;
//import java.util.

public class RedixSort {

    public static void radixSort(String[] array) {
        if (array.length == 0) {
            return;
        }

        // Step one, find longest word length
        int maxLength = 0;
        for (String s : array) {
            maxLength = Math.max(maxLength, s.length());
        }

        // Step two, go from last character to first
        for (int pos = maxLength - 1; pos >= 0; pos--) {

            // Step 3, create 27 buckets
            ArrayList<ArrayList<String>> buckets = new ArrayList<>();

            for (int i = 0; i < 27; i++) {
                buckets.add(new ArrayList<>());
            }

            // Step 4, place words into buckets
            for (String word : array) {
                int index;

                if (pos < word.length()) {
                    // 'a' = 1, 'b' = 2 ... 'z' = 26
                    //turn letter into number and +1 shifts so my bucket 0 ia empty and free
                    index = word.charAt(pos) - 'a' + 1;
                } else {
                    index = 0; // shorter words
                }

                buckets.get(index).add(word);
            }

            // Step 5, rebuild array
            int i = 0;
            for (ArrayList<String> bucket : buckets) {
                for (String word : bucket) {
                    array[i++] = word;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {
                "google", "gojo", "amazingly", "jogo", "luna",
                "pup", "solas", "solo", "pupperino", "amaterasu",
                "amazon", "puppy", "hydra", "amazonia", "vueltiao"
        };

        radixSort(arr);

        for (String s : arr) {
            System.out.print(s + ", ");
        }
    }
}
