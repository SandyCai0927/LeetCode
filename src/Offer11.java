public class Offer11 {
    public int minArray(int[] numbers) {
        int low = 0,high = numbers.length-1,mid;
        while (low<high){
            mid = (low+high)/2;
            if (numbers[mid]>numbers[high]){
                low = mid+1;
                continue;
            }
            else if (numbers[mid]<numbers[high]){
                high = mid;
                continue;
            }
            else
                high--;
        }
        return numbers[low];
    }
}
