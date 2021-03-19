import java.util.Scanner;

public class BubbleSort1 {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }
    public static void main(String[] args) {
        int arr[] ={34, 2, 10, 6, 7, 5, 1, 5};

        int num;
        int len1 = arr.length;
        int count = 0;


        //create Scanner class object to read inputs
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = scan.nextInt();

        //use for loop to determine how many counts of user input there is in the array (still working on it)
        for (int k = 0; k < len1; k++) {
            if (num == arr[k]) {

                count++;
            }

        }

        System.out.println("We found " + count + " counts of " + num);


        int arr1[] ={34, 2, 10, 6, 7, 5, 1, 5};

        bubbleSort(arr1);//sorting array elements using bubble sort

        System.out.println("Sorted List");
        for(int i=0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }

    }
}
