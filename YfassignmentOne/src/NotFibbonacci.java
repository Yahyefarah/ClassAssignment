public class NotFibbonacci {

    public static void main(String[] args) {
        int n = 10;
        long[] result = notFib(n);

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }





    public static long[] notFib(int n) {
        long[] arrayseq = new long[n];
        //my first two values
        arrayseq[0] = 0;
        arrayseq[1] = 2;

        for (int i = 2; i < n; i++) {

            arrayseq[i] = (long) Math.floor((1.5 * arrayseq[i - 1]) + (2 * arrayseq[i - 2]));
        }
        return arrayseq;
    }


}
