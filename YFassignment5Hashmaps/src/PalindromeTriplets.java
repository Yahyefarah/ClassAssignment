import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromeTriplets {

    public static List<List<Integer>> findTriplets(String[] words) {
        List<List<Integer>> output = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                for (int k = 0; k < words.length; k++) {

                    if (i != j && i != k && j != k) {
                        String fullword = words[i] + words[j] + words[k];

                        if (isPalindrome(fullword)) {
                            output.add(Arrays.asList(i, j, k));
                        }
                    }
                }
            }
        }

        return output;
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String[] words = {"race", "car", "ecar", ""};
        //String[] words = {"race", "car", "ecar"};

        List<List<Integer>> Theword = findTriplets(words);

        System.out.println(Theword);
    }
}
