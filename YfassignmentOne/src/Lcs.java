public class Lcs {

public static void main(String[] args){

   // System.out.println(longestCommonSubsequence("bond", "bond"));
    System.out.println(longestCommonSubsequence("alucards", "alliances"));
   // System.out.println(longestCommonSubsequence("cannon ball", "ferris"));


}

    public static int longestCommonSubsequence(String text1, String text2) {
    // i created char array and toCharArray() job is to copies
        // each character from the string into this array
        // because its easier to point at when im doing the table.
        char[] f = text1.toCharArray();
        char[] s = text2.toCharArray();

//here is my 2D array which i use to store answers to smaller subproblems, for example
        //it stores the length of the longest common subsequence b/w
        // the first 1 character of a and the first j character of b

        int[][] table = new int[f.length + 1][s.length + 1];

        //filling the  table array

        for (int i = 1; i <= f.length; i++) {

            for (int j = 1; j <= s.length; j++) {
                  //if char are the same
                if (f[i - 1] == s[j - 1]) {
                //get the number from diagonaly opposite and add 1
                    table[i][j] = table[i - 1][j - 1] + 1;

                } else {
                    //this Take the larger subsequence found b/w char at j and char i (previous column and previous row
                    table[i][j] = Math.max(table[i - 1][j], table[i][j - 1]);
                }
            }
        }
        //so the finnal answer is stored here
        // also this has the full length of my both strings  and lcs length
        return table[f.length][s.length];
    }





}
