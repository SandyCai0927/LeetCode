public class Offer21 {
    public int[] exchange(int[] nums) {
        int i=0,j=nums.length-1;
        if (j<0)
            return nums;
        while (i!=j){
            while (i!=j&&nums[i]%2!=0){
                i++;
            }
            while (i!=j&&nums[j]%2==0){
                j--;
            }
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }

        return nums;
    }
}
