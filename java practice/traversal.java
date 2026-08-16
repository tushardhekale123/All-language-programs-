// Array Traversal

// Print all elements of an array.
// Print array elements using for loop.
// Print array elements using while loop.
// Print array elements in reverse order.
// Print elements at even indexes.
// Print elements at odd indexes.
// Print first element of an array.
// Print last element of an array.
// Print array elements with their indexes.
// Count total number of elements in an array. 

// 🟡 Medium
// Find sum of all array elements.
// Find average of array elements.
// Find maximum element.
// Find minimum element.
// Count even and odd numbers.
// Count positive and negative numbers.
// Count zero elements.
// Search an element in an array.
// Count how many times a given element occurs.
// Copy one array into another array.

// 🟠 Important Interview Questions
// Reverse an array.
// Find second largest element.
// Find second smallest element.
// Find duplicate elements.
// Remove duplicate elements.
// Find frequency of every element.
// Find the missing number in an array.
// Move all zeroes to the end.
// Find the largest and smallest element in one traversal.
// Check whether an array is sorted or not.

// elements using while loop.

// class traversal {
//     public static void main (String [] args ) {
//         int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//         int i = 0;
//         while (i<arr.length) {
//             System.out.print(arr[i]+ " ");
//             i++;
//         }
//         System.out.println();
//     }
// }

// array elements in reverse order.

// class traversal {
//     public static void main (String [] args) {
//         int arr[] = {1,2,3,4,5,6,7,8,9,10};
//         for (int i = arr.length-1; i>=0; i--) {
//             System.out.print(arr[i]+ " ");
//         }
//     }
// }

// Print elements at even indexes.

// class traversal {

//     public static void main (String [] args) {
//         int arr[] = {1,2,3,4,5,6,7,8,9,10};
//         for (int i = 0; i<arr.length; i++) {
//             if (i%2==0) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }

// Print array elements with their indexes.

// class traversal {
//     public static void main (String [] args) {
//         int arr[] = {10,20,30,40,50,60,70,80,90,100};
//             System.out.println( arr[0]);
//     }
// }

// class traversal {
//     public static void main (String [] args) {
//         int arr[] = {10,20,30,40,50,60,70,80,90,100};
//             System.out.println(arr[arr.length-1]);
//     }
// }

// Count even and odd numbers.

// class traversal {
//     public static void main (String [] args) {
//         int arr[] = {1,2,3,4,5,6,7,8,9,10};
//         int even = 0;
//         int odd = 0;

//         for (int i=0; i<arr.length; i++) {
//             if (arr[i] % 2 == 0){
//                 even++;
//             } else {
//                 odd++;
//             }
//         }
//         System.out.println("Even numbers: " + even);
//         System.out.println("Odd numbers: " + odd);
//     }
// }

// Find second largest element.

// class traversal {
//     public static void main(String[] args) {
//         int arr[] = { 100, 20, 30, 40, 50, 60, 70, 80, 90, 10 };
//         int largest = arr[0];
//         int secondLargest = arr[1];

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > largest) {
//                 secondLargest = largest;
//                 largest = arr[i];
//             } 
//         }
//         System.out.println("Second Largest Element: " + secondLargest);
//     }
// }


// Find second largest element.

// class traversal {
//     public static void main(String[] args) {
//         int arr[] = { 100, 20, 30, 40, 50, 60, 70, 80, 90, 10 };
//         int largest = arr[0];
//         int secondLargest = arr[1];

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > largest) {
//                 secondLargest = largest;
//                 largest = arr[i];
//             } else if (arr[i] > secondLargest && arr[i] != largest) {
//                 secondLargest = arr[i];
//             }
//         }
//         System.out.println("Second Largest Element: " + secondLargest);
//     }
// }




// class traversal {
//     public static void main(String[] args) {
//         int arr[] = { 100, 20, 30, 40, 50, 60, 70, 80, 90, 10 };
//         int largest = arr[0];
//         int secondLargest = arr[1];

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] < largest) {
//                 secondLargest = largest;
//                 largest = arr[i];
//             } else if (arr[i] < secondLargest && arr[i] != largest) {
//                 secondLargest = arr[i];
//             }
//         }
//         System.out.println("Second Smallest Element: " + secondLargest);
//     }
// }


// Find frequency of every element.

// class traversal {
//     public static void main (String [] args) {
//         int arr[] = {1,2,3,4,5,2,3,2,1,2,5,};

//         boolean visited[] = new boolean[arr.length];

//         for (int i=0; i<arr.length; i++) {
//             if (visited[i] == true) {
//                 continue;
//             }
//             int count = 1;
//             for (int j=i+1; j<arr.length; j++) {
//                 if (arr[i] == arr[j]) {
//                     visited[j] = true;
//                     count++;
//                  }
//             }
//             System.out.println("Element " + arr[i] + " occurs " + count + " times");
//         }
//     }
// }


// import java.util.Scanner;
// class traversal {
//     public static void main (String []args) {
//         Scanner sc = new Scanner (System.in);

//         System.out.print("Enter the size of the array: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];

//         System.out.println("Enter the elements of the array: ");
//         for (int i=0; i<n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         boolean visited[] = new boolean[n];

//         for (int i=0; i<n; i++) {
//             if (visited[i] == true) {
//                 continue;
//             }
//             int count = 1;
//             for (int j=i+1; j<n; j++) {
//                 if (arr[i] == arr[j]) {
//                     count++;
//                     visited[j] = true;
//                 }
//             }
//             System.out.println(arr[i] + " = " + count);
//         }
//     }
// }




// Move all zeroes to the end.

// class traversal {
//     public static void main(String[] args) {
//         int arr[] = {0,5,0,5,3,4,0,1};

//         int index = 0;
//         for (int i=0; i<arr.length; i++) {
//             if (arr[i] != 0) {
//                 arr[index] = arr[i];
//                 index++;
//             }
//         }
//         while (index < arr.length) {
//             arr[index] = 0;
//             index++;
//         }
//         for(int i=0; i<arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }


// Check whether an array is sorted or not.

// class traversal {
//     public static void main (String[] args) {
//         int arr[] = {10,20,30,40,10};
//          boolean sorted = true;

//          for (int i=0; i<arr.length-1; i++) {
//             if (arr[i] > arr[i+1]) {
//                 sorted = false;
//                 break;
//             }
//          }
//          if (sorted) {
//             System.out.println("Arrays is sorted");
//          } else {
//             System.out.println("Arrays is Mot sorted");
//          }
//     }
// } 


