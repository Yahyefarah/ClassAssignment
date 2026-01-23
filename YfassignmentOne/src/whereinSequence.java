public class whereinSequence {

    public static void main(String[] args) {
        System.out.println(findTheIndex(8));     // 3
       // System.out.println(findThIndex(1763));  // 9
       //System.out.println(findTheIndex(300));//7
    }



    public static int findTheIndex(long target) {
     //these two  store the 1st and 2nd notfibonacci  s #bers
        long prev1 = 0; // index 0
        long prev2 = 2; // index 1

        //this tracks the index  or position of thr current # ijn the notFib sequence
        // previvous1,
        int index = 1;
//this condition handles if the # is smaller than 2 , the answer must be in index 0
// bcs 0 is the smallest value in the sequence
                   if (target < 2) {

                       return 0;
        }

        while (prev1 <= target) {
            //i calculate the notfib number while using the formula
            long Mynextnumber = (long) Math.floor((1.5 * prev1) + (2 * prev2));

           //i move the second -previous value forward ,so now the old prev1 becomes new prev2
            //and moves my nextnumber in the sequence
            prev2 = prev1;
            prev1 = Mynextnumber;


            index++;
        }
//The loop goes one step too far, so i have to subtract 1 to go back to the correct index
// which is before index.
        return index - 1;
    }

}
