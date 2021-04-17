public class Array {
    public static void main(String[] args) {
        arrayOne();
    }

    public static void arrayOne(){
        int [][] arr = new int[3][3];
        int rows = 3;
        int columns = 3;

        arr[0][0] = 5;
        arr[0][1] = 10;
        arr[0][2] = 15;

        arr[1][0] = 8;
        arr[1][1] = 10;
        arr[1][2] = 12;

        arr[2][0] = 1;
        arr[2][1] = 2;
        arr[2][2] = 3;

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.println("The value at row " + i + " and at index " + j + " is " + arr[i][j] + " ");
            }
        }
    }
}
