public class RemoveElements {


    public static int removeE(double[] nums, double val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= val) {
                nums[k] = nums[i];
                k++; // i needa increment k everytime i add number at begining of the array
            }
        }
        return k;
    }

    public static void main(String[] args) {
       // double[] nums = {1.2, 3.5, 0.5,5.0,6.0, 4.0};
        double[] nums = {1.2, 1.5,2.0, 0.5, 1.0};
        double val = 2.0;

        int k = removeE(nums,val);

        System.out.println(k);


    }



}
