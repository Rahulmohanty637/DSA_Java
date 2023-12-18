package Problems;

public class DSA_LC_Kth_Missing_Positive_Number {
    public static int findKthPositive(int[] arr, int k) {
        int count = 0;
        int j = 0;
        for(int i = 1; i < arr[arr.length-1]; i++){
            if(i != arr[j]){
                count++;
                if(count == k){
                    return i;
                }
            }
            else if(i == arr[j]){
                j++;
            }
        }
        return arr[j]+k-count;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int num = findKthPositive(arr, 5);
        System.out.println(num);
    }
}
