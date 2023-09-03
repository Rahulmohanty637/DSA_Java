package Binary_Search;
interface MountainArray {
    public default int get(int index) {
        return index;
    }
    public default int length() {
        return 0;
    }
}
public class DS_07_MountainArray implements MountainArray{

    public static void main (String[] args) {
//        int [] arr = array = [1,2,3,4,5,3,1], target = 3
//        MountainArray mountainArray = {1,2,3,4,5,3,1};
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int p = peakIndexInMountainArray(mountainArr);
        int first = BinarySearch(mountainArr, target, 0, p);
        if (first != -1){
            return first;
        }
        else
            return BinarySearch(mountainArr, target, p+1, mountainArr.length());
    }
    public static int peakIndexInMountainArray( MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;
        int mid = 0;
        while (start <= end){
            mid = start + (end - start)/2;
            if (mountainArr.get(mid) > mountainArr.get(mid-1) && mountainArr.get(mid) > mountainArr.get(mid+1)){
                return mid;
            }
            else if (mountainArr.get(mid) > mountainArr.get(mid-1)){
                start = mid + 1;
            }
            else {
                end = mid;
            }

        }
        return mid;
    }
    public static int BinarySearch(MountainArray mountainArr, int item, int start, int end){
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) == item) {
                return mid;
            }
            if (mountainArr.get(start) < mountainArr.get(end)) {
                // Array is sorted in Increasing order
                if (item < mountainArr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else {
                // Array is sorted in Decreasing order
                if (item > mountainArr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
