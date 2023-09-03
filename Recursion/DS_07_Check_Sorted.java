package Recursion;

public class DS_07_Check_Sorted {
    public static void main(String[] args) {
        int [] arr = {3, 7, 13, 29,26,44};
        System.out.println("IS IT SORTED OR NOT : "+ srotedOrNot(arr, 0));
    }

    public static boolean srotedOrNot(int [] arr, int n){
        if (n == arr.length - 1){
            return true;
        }
        return arr[n] < arr[n+1] && srotedOrNot(arr, n+1);
    }
}
