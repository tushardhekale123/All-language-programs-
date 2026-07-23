
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


class arrays {
    public static void main(String[] args) {
        int value[] = new int [12];

        value [0]= 20;
        value [1]= 45;
        value [2]= 45;
        value [3]= 60;

        int Sum = value[2] + value[1];

        System.out.println(Sum);
    }
}