public class Sorting {

    public static void printarr(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {

        // bubble sort
        int arr[] = { 2, 4, 3, 2, 66, 44, 1 };

        // for (int i = 0; i < arr.length - 1; i++) {
        // for (int j = 0; j < arr.length - i - 1; j++) {
        // if (arr[j] > arr[j + 1]) {
        // int temp = arr[j + 1];
        // arr[j + 1] = arr[j];
        // arr[j] = temp;
        // }
        // }
        // }

        // for (int i = 0; i < arr.length - 1; i++) {
        // int smallest = i;
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[j] < arr[smallest]) {
        // smallest = j;
        // }
        // }

        // int temp = arr[smallest];
        // arr[smallest] = arr[i];
        // arr[i] = temp;
        // }

        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printarr(arr);

    }
}
