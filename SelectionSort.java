public class SelectionSort {
    public static void main(String[] args) {
        //declare array with double data type
        double arr[] = {150.00d, 200.00d, 154.98d, 335.01d, 475.12d, 555.87d, 216.38d};
        //call selection sort routine
        revenue(arr);
        //print sorted array
        System.out.println("The largest value is £" + arr[0]);

    }
    //selection sort algorithm
    public static void revenue(double arr[]) {
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {

            int max_index = i;

            for (int j = i + 1; j < len; j++)
                if (arr[max_index] < arr[j])
                    max_index = j;

            double temp = arr[max_index];
            arr[max_index] = arr[i];
            arr[i] = temp;

        }

    }
}




