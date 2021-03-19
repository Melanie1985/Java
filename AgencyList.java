import java.util.Arrays;
import java.util.Scanner;

public class AgencyList {
    public static void main(String[] args) {
        //declare array with int data type
        int arr1[] = {17, 21, 97, 66, 55, 30, 33, 45, 58, 67, 38, 39, 41, 19, 23};
        //call selection sort routine
        sortedList(arr1);

        //print out sorted list using enhanced for loop
        System.out.println("Sorted List of Ages: ");
        for (int i : arr1) {
            System.out.print(i + " ");

        }
    }

            //bubble sort algorithm
            public static void sortedList(int arr[]){
                int len = arr.length;

                for (int i = 0; i < len - 1; i++) {
                    for (int j = 0; j < len - 1; j++)
                        if (arr[j] > arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                }
    }
}

