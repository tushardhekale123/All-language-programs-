
//     public static void main(String[]args) {
//         int marks [] = new int[5]; 
//         marks[0] = 98;
//         marks[1] = 68;
//         marks[2] = 34;
//         marks[3] = 76;

//         System.out.println(marks[0]);
//         System.out.println(marks[1]);
//         System.out.println(marks[2]);
//         System.out.println(marks[3]);
//         System.out.println(marks[4]);
//     }    
// }


// class arrays {
//     public static void main(String[] args) {
//         int marks [] = new int [4];
//         marks[0] = 56;
//         marks[1] = 89;
//         marks[2] = 23;
//         marks[3] = 56;

//         for (int i=0; i<=4; i++){
//             System.out.println(marks[i]);
//         }
//     }
// }


// class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
    
//         System.out.println("Enter array length = ");
//         int n = sc.nextInt();
//         int number[] = new int[n];

//         System.out.println("Enter marks = ");
//         for (int i=0; i<n; i++){
//         number[i] = sc.nextInt();
//        }
//        System.out.println("Arraya element ");
//        for (int i=0; i<n; i++) {
//         System.out.println(number[i]);
//        }
//        sc.close();
//     }
// }


// class arrays {
//     public static void main(String[] args) {
//         int value[] = new int [12];

//         value [0]= 20;
//         value [1]= 45;
//         value [2]= 45;
//         value [3]= 50;

//         int Sum = value[2] + value[1];

//         System.out.println(Sum);
//     }

// }




// import java.util.Scanner;

// class arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter rows");
//         int rows = sc.nextInt();

//         System.out.println("Enter cols");
//         int cols = sc.nextInt();

//          int [][] number = new int [rows][cols];

//          for (int i=0;i<rows; i++) {
//             for (int j=0;j<cols; j++) {
//                 number [i][j] = sc.nextInt();
//             }
//             }
//             for (int i=0;i<rows; i++) {
//             for (int j=0;j<cols; j++) {
//                 System.out.print(number[i][j] + " ");
//             }
//              System.out.println();
//          }
//     }
// }


// find the arrys x row and colume 

// import java.util.Scanner;

// class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter row value");
//         int row = sc.nextInt();

//         System.out.println("Enter cols value");
//         int cols = sc.nextInt();

//         int number [][] = new int[row][cols];

//         for (int i=0; i<row; i++) {
//             for (int j=0; j<cols; j++) {
//                 number [i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Enter find value");
//         int x = sc.nextInt();

//         for (int i=0; i<row; i++) {
//             for (int j=0; j<cols; j++) {
                
//                 if (number [i][j] == x){
//                     System.out.println((i+1)  + " " + (j+1) );
//                 }
//             }
//         }
//     }
// }

// 1. Print Array 

// class arrays {
//     public static void main(String[] args) {
//         int arr[] = {10,20,30,40,50};
//         for (int i=0; i<arr.length;i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


// import java.util.Scanner;

// class arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter size");
//         int n = sc.nextInt();

//         int arr[] = new int[n];
//         System.out.println("enter elements ");

//         for (int i=0; i<n;i++) {
//             arr[i] = sc.nextInt();
//         }
//         for (int i=0; i<n;i++) {
//             System.out.println(arr[i] + " ");
//         }
//     }
// }


// 2 .sum arrays

// class arrays {
//     public static void main(String[] args) {
//         int arr[] = {10,20,30};

//         int sum = 0;

//         for(int i = 0; i < arr.length; i++){
//             sum = sum +arr[i];
//         }
//         System.out.println("sum" + sum);
//     }
// }


// import java.util.Scanner;

// class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter array lenght");
//         int n = sc.nextInt();

//         int arr[] = new int [n];

//         int sum = 0;

//         for (int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//             sum = sum + arr[i];
//         }
//         System.out.println(sum);
//     }
// }

// 3 avrage of array

// class arrays {
//     public static void main(String[] args) {
//         int arr[] = {10,20,30,40,50};

//         int sum = 0;

//         for (int i=0;i<arr.length;i++){
//             sum= sum+arr[i];
//         }
//         double avg = sum / arr.length;

//         System.out.println(avg);
//     }
// }


// import java.util.Scanner;
// class arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter size");
//         int n = sc.nextInt();

//         int arr[] = new int [n];

//         int sum = 0;

//         for (int i=0; i<arr.length; i++){
//             arr [i] = sc.nextInt();
//             sum = sum + arr[i];
//         }
//         double avg = (double)sum / n;
//         System.out.println(avg);
//     }
// }

// 4 Find Maximum Element

// class arrays{
//     public static void main(String[] args) {
//         int arr[] = {60,20,30,90,50};

//         int max = arr [0];

//         for (int i=0; i<arr.length; i++){

//             if (arr [i] > max) {
//                 max = arr[i];
//             }
//         }
//         System.out.println(max);
//     }
// }


// import java.util.Scanner;

// class arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter size ");
//         int n = sc.nextInt();

//         int arr[] = new int [n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int max = arr[0];

//         for (int i=1; i<n; i++) {
//             if (arr[i] > max)
//             max = arr[i];
//         }
//         System.out.println(max);
//     }
// }


// 5 even odd number 

// class arrays {
//     public static void main(String[] args) {
//         int arr[] = {10,15,20,25,30,35};

//         int even =0;
//         int odd = 0;

//         for (int i = 0; i < arr.length; i++){

//             if (arr[i] % 2 == 0)
//             even++;
//             else
//                 odd++; 
//             } 
//             System.out.println(even);
//             System.out.println(odd);       
//     }
// }

// import java.util.Scanner;

// class arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.err.println("enter size");
//         int n = sc.nextInt();
        
//         int arr[] = new int [n];

//         int even = 0;
//         int odd = 0;

//         System.out.println("enter element");

//         for (int i=0; i<arr.length; i++){
//             arr[i] = sc.nextInt();

//             if (arr[i] % 2 == 0)
//             even++;
//             else
//             odd++;
//         }
//         System.out.println(even);
//         System.out.println(odd);
//     }
// }



// revers array

// class arrays {
//     public static void main(String[] args) {
//         int arr[] = {10,20,30,60,50};

//         for (int i=arr.length-1;i>=0;i--){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// import java.util.Scanner;

// class arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter size");
//         int n = sc.nextInt();

//         int arr[] = new int [n];

//         for (int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         for (int i=n-1; i>=0;i--) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// import java.util.Scanner;

// class arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter name");
//         String name = sc.nextLine();

//         System.out.println("revers name ");
//         for (int i=name.length()-1; i>=0; i--){
//             System.out.print(name.charAt(i));
//         }
//     }
// 

// class arrays {
//     public static void main(String[] args) {

//         int arr [] = {10,50,60,40,90};

//         int largest = 0;
//         int secondlargest = 0;
//         for (int i = 0; i < arr.length; i++) {
//              if (arr[i] > largest) {
//                 secondlargest = largest;
//                 largest = arr[i];
//              }
//              else if (arr[i] > secondlargest) {
//                 secondlargest = arr[i];
//              }
//         }
//         System.out.println(secondlargest);
//     }
// }


// Linear Search

// class arrays {
//     public static void main(String[] args) {
//         int arr[] = {10,40,30,20,50};
       
//         int x = 30;

//         boolean found = false;

//         for (int i=0; i<= arr.length; i++) {

//             if (arr[i] == x) {
//                 System.out.println("Element Found a Index" + " = " + (i+1));
//                 found = true;
//                 break;
//             }
//         }
//         if (!found) {
//             System.out.println("Element Not Found");
//         }
//     }
// }