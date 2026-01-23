public class comSub {


    public static void main(String[] args) {

         System.out.println(CommonSubstring("spy family", "jujutzu"));
        //System.out.println(CommonSubstring("gears of war", "History of warriors"));
         //System.out.println(CommonSubstring("", "ferris"));


    }

    public static int CommonSubstring(String s1, String s2) {

        // converted strings into char because its easier to point at when im doing the table.
        char[] f = s1.toCharArray();
        char[] s = s2.toCharArray();

//here is my 2D array which i use to store answers to smaller subproblems, for example


        int[][] table2 = new int[f.length + 1][s.length + 1];

        //to store what is the longest common string
        int max = 0;


        for (int i = 1; i <= f.length; i++) {

            for (int j = 1; j <= s.length; j++) {
                //if char are the same
                if (f[i - 1] == s[j - 1]) {
                    //get the number from diagonaly opposite and add 1
                    table2[i][j] = table2[i - 1][j - 1] + 1;

                    max = Math.max(table2[i][j], max);

                }
                //return max;
            }
        }
        return max;
    }
}
