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

class traversal {
    public static void main (String [] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for (int i = arr.length-1; i>=0; i--) {
            System.out.print(arr[i]+ " ");
        }
    }
}