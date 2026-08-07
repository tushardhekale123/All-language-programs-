import java.util.Scanner;

class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Row Size");
        int row = sc.nextInt();

        System.out.println("Enter Column Size");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        System.out.println("Enter Element");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter Search Element");
        int x = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == x) {
                    System.out.println("Element Found at Index = " + (i + 1) + " " + (j + 1));
                }
            }
        }
    }
}