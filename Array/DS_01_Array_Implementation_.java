package Array;

import java.util.Scanner;

public class DS_01_Array_Implementation_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[20];
        int n = 0;
        int choice;
        do {
            System.out.println("Enter Your Choice");
            System.out.println("1 -> Create");
            System.out.println("2 -> Traverse");
            System.out.println("3 -> Insert");
            System.out.println("4 -> Delete");
            System.out.println("5 -> Linear Search");
            choice = sc.nextInt();

            switch (choice) {
                case 1 :
                    System.out.println("Enter the Number of elements");
                    int e = sc.nextInt();
                    n = e;
                    ArrayCreation(arr,n);
                    break;
                case 2 :
                    ArrayTraversal(arr,n);
                    break;
                case 3 :
                    System.out.println("Enter the Position");
                    int pos = sc.nextInt();
                    System.out.println("Enter the Item");
                    int item = sc.nextInt();
                    ArrayInsertion(arr, n, pos, item);
                    n++;
                    break;
                case 4 :
                    System.out.println("Enter the position");
                    pos = sc.nextInt();
                    ArrayDeletion(arr, n, pos);
                    n--;
                    break;
                case 5 :
                    System.out.println("Enter the element");
                    item = sc.nextInt();
                    LinearSearch(arr, n, item);
                    break;
            }
        }while (choice < 6);
    }

    static void ArrayCreation(int [] arr, int n){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            System.out.println("Enter the element in index "+ i);
            arr[i] = input.nextInt();
        }
    }
    static void ArrayTraversal(int [] arr, int n){
//      for (int element : arr){
//          System.out.println(element);
//      }
        for (int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }

    static void ArrayInsertion(int [] arr, int n, int pos, int item){
        for (int i = n; i >= pos - 1; i--){
            arr[i+1] = arr[i];
            if (i == (pos - 1)){
                arr[i] = item;
            }
        }
    }

    static void ArrayDeletion(int [] arr, int n, int pos){
        for (int i = 0; i < n; i++){
            if (i >= pos - 1){
                arr[i] = arr[i+1];
            }
        }
        System.out.println("Item deleted");
    }

    static void LinearSearch(int [] arr, int n, int item){
        for (int i = 0; i < n; i++){
            if (arr[i] == item){
                System.out.println("The Element found in "+i+" index");
                break;
            }
            if (i == n && arr[i] != item){
                System.out.println("Element not found");
            }
        }
    }

}

