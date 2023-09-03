package Binary_Search;

//Find position of an element in a sorted array of infinite numbers

public class DS_04_Infinite_Element {
    public static int findingRange(int [] arr, int target){
        //Start with box of 2
        int start = 0;
        int end = 1;
        int n = 2;

        //Checking whether target lies within a range or not

        while (target > arr[end]){
            n = n*2;
            start = end + 1;
            end =  end + n;
        }
        return BinarySearch(arr,target,start,end);
    }
    static int BinarySearch(int [] arr, int item, int start, int end){
//        int start = 0;
//        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == item) {
                return mid;
            }
            if (arr[start] < arr[end]) {
                // Array is sorted in Increasing order
                if (item < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] num = {26,59,60,61,66,74,84,87,94,99,106,111,125,195,222,254,271,298,345,367,380,429,488,567,628,791,888,995};
        System.out.println(findingRange(num, 195));
    }
}
