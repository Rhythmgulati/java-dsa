// import java.util.Scanner;

// public class Array {
// public static void main(String[] args) {
// int size;
// Scanner sc = new Scanner(System.in);

// size = sc.nextInt();

// String[] names = new String[size];

// for (int i = 0; i < size; i++) {
// names[i] = sc.next();
// }
// for (int i = 0; i < size; i++) {
// System.out.print(names[i]);
// }

// }
// }

// import java.util.Scanner;

// public class Array {
// public static void main(String[] args) {
// int size;
// Scanner sc = new Scanner(System.in);

// size = sc.nextInt();

// int min = Integer.MAX_VALUE;
// int max = Integer.MIN_VALUE;
// System.out.println(min);

// int[] arr = new int[size];

// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();
// }
// for (int i = 0; i < size; i++) {
// if (arr[i] > max) {
// max = arr[i];
// }
// ;
// if (arr[i] < min) {
// min = arr[i];
// }
// ;
// }
// System.out.println(min);
// System.out.println(max);

// }
// }

// import java.util.Scanner;

// public class Array {
// public static void main(String[] args) {
// int size;
// Scanner sc = new Scanner(System.in);

// size = sc.nextInt();

// int[] arr = new int[size];
// boolean isascending = true;
// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();
// }
// for (int i = 0; i < size - 1; i++) {
// if (arr[i + 1] > arr[i]) {
// continue;
// } else {
// isascending = false;
// }
// ;
// }
// System.out.println(isascending);

// }
// }

// import java.util.Scanner;

// public class Array {
// public static void main(String[] args) {
// int row, column;
// Scanner sc = new Scanner(System.in);

// row = sc.nextInt();
// column = sc.nextInt();

// int[][] arr = new int[row][column];

// for (int i = 0; i < row; i++) {
// for (int j = 0; j < column; j++) {
// arr[i][j] = sc.nextInt();
// }
// }
// for (int i = 0; i < row; i++) {
// for (int j = 0; j < column; j++) {
// System.out.print(arr[i][j]);
// }
// System.out.println();
// }

// for (int i = 0; i < row; i++) {
// for (int j = 0; j < column; j++) {
// if (arr[i][j] == 4) {
// System.out.println("row: " + i + "column: " + j);
// }

// }
// }

// }
// }
