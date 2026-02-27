// public class Array {
//     public static void main(String[] args) {
//         int num [] = {1, 2, 3, 4, 5};
//         for (int i = 0; i < num.length; i++) {
//             System.out.println(num[i]);
//         }   
//     }
// }


// public class Array {
//     public static void main(String[] args) {
//         int nums [] = {5, 2, 3, 4, 5};
//         nums [1] = 7;
//         for (int i=0; i<=5; i++) {
//             System.out.println(nums[i]);
//         }
//     }
// }


public class Array {
    public static void main(String[] args) {
        int nums [] [] = new int [3] [4];

        for (int i=0; i<3; i++){
            for (int j=0; j<4; j++) {

            nums [i] [j] = (int) (Math.random() * 10);

            System.out.print(nums [i] [j] + " ");
            }
            System.out.println();
        } 
    }
}