
//     }
// }


// public class Loop {
//     public static void main(String[] args) {
        
//         int i= 1;
//         while (i<=5) {
//         System.out.println("Tushar");
//         i++;
//         }
//     }
// }


// public class Loop {
//     public static void main(String[] args) {
        
//         int i= 1;
//         while (i<=5) {
//         System.out.println("Tushar");
//         i++;
//         }
//         while (i<=10) {
//             System.out.println("munna");
//             i++;
//         }
//     }
// }


// public class Loop {
//     public static void main(String[] args) {
        
//         int i= 1, j=1;

//         while (i<=5) {
//         System.out.println("Tushar");
//             while (j<=10) {
//             System.out.println("munna");
//             j++;
//             }
//             i++;
//         }
//     }
// }



// public class Loop {
//     public static void main(String[] args) {
        
//         for (int i=1;  i<=5; i++) {
//             System.out.println(i);
//         }
//     }
// }



// public class Loop {
//     public static void main(String[] args) {
//     int i = 2;
//     while (i <= 10) {
//     System.out.println(i);
//     i += 2;
//       }
//     }
//  }


// public class Loop {
//     public static void main(String[] args) {
//     int i = 1;
//     do  {
//         System.err.println("Tushar");
//         i++;
//       }  while (i<=5);
//     }
//  }  



// public class Loop {
//     public static void main(String[] args) {
//         for (int i=10; i>=1 ; i--) {
//             System.out.println(i);
//         }
//     }
// }

// public class Loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         for (int i=1; i<=n; i++) {
//            sum += i;                                                            
//         }System.out.println(sum);
//     }
// }


// public class Loop {
//     public static void  main (String[] args) {
//         int sum = 0;
//         for ( int i=1;i<=10;i++)
//          {
//             sum += i;
//         } System.out.println(sum);
//     }   
// }


// class Loop {
//     public static void  main (String[] args) {
//         int no = 5;
//         for (int i=1;i<=10;i++){
//             System.out.println(i*no);
//         }
//     }
// }



// public class Loop {
//     public static void main(String[] args) {
//         int n=5, fact = 1;
//         for (int i=1;i <=n;i++) 
//         fact = fact * i;
//         System.out.println(fact);
//     }
// }


// public class Loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter digit");
//         int n = sc.nextInt();
//         int  count = 0;
//         while (n > 0) {
//             n /= 10;
//             count++;
//         }
//         System.out.println(count);
//     }
// }



// public class Loop {
//     public static void main(String[] args) {
//       int n = 123, rev=0;
//       while (n>0) {
//         rev = rev * 10 + n % 10;
//         n /=10;
//       }
//       System.out.println(rev);
//     }
// }



// public class Loop {
//   public static void main(String[] args) {
//       int n =121, temp=n, rev =0;
//       while (n>0) {
//         rev = rev * 10 + n % 10;
//         n/=10;
//       }
//          if (temp == rev) 
//           System.out.println("palidroma");
//         else 
//           System.out.println("not palidroma");
         
//    }
// }


// public class Loop {
//     public static void main(String[] args) {
//        int n = 7, flag = 0;
//        for (int i=2; i<n; i++) {
//         if (n % i == 0) {
//           break;
//         }
//       }
       
//         if (flag == 0) {
//           System.out.println("prime");
//         } else {
//           System.out.println("not prime");
        
//        }
//     }
// }



// public class Loop {
// 	  public static void main (String[] args){
// 	    for (int i = 2; i <= 50; i++) {
// 	    int count = 0;
// 	    for (int j = 1; j <= i; j++) {
// 	        if (i % j == 0){ 
// 	        count++;
// 	        }
// 	    }
// 	    if (count == 2)
// 	        System.out.println(i);
// 	    }
// 	  }


// public  class Loop {
// 	public static void main(String[] args) {
// 		 int n =152, sum=0 , temp = n ;
// 		while (n>0) {

// 			int r = n % 10;
// 			sum += r*r*r;
// 	         n/=10;
// 		}
// 			if (n==sum) 
// 				System.out.println("armstrong");
// 			else 
// 				System.out.println("not armstrong");
// 			}
// 		}
	


// public class Loop {
// 	public static void main(String[] args) {
// 		int n= 145, sum = 0 ,  temp =n;
// 		while (n >0) {
// 			int r =n % 10, fact = 1;
// 			for (int i =1; i <= r; i++) 
// 				fact *= i;
// 				sum+= fact;
// 				n /=10;
//         } if (temp == sum)
// 			System.out.println("strong");
// 		else 
// 			System.out.println("not strong");
// 	}
// }
	

// public class Loop {
// 	public static void main(String[] args) {
// 		 for (int i=1; i<=5; i++) {
// 			for (int j=1; j<=i; j++) {
// 				System.out.print("*");
// 			} System.out.println(" ");
// 		 }
// 	}
// }



// public class Loop {
// 	public static void main(String[] args) {
// 		 for (int i=1; i<=5; i++) {
// 			for (int j=1; j<=i;j++){
// 				System.out.print("*");
// 			}System.out.println();
// 		 }
// 	}
// }


// public class Loop {
// 	public static void main(String[] args) {
// 		 for (int i=5; i>=1; i--){
// 			for (int j=1; j<=i; j++){
// 				System.out.print("*");
// 			}System.out.println();
// 		 }
// 	}
// }


// public class Loop {
// 	public static void main(String[] args) {
// 		 for (int i=1; i<=5; i++) {
// 			for (int s=5; s>=i; s-- )  
// 				System.out.print(" ");
			
// 			for (int j=1; j<=2*i-1; j++)
// 				System.out.print("*");
		 
// 		 System.out.println();
// 	}
// 	}
// }




public class Loop {
    public static void main(String[] args) {
        
        for (int i=1; i<=5; i++) {
            for (int s=5; s>=i; s--)
            System.out.print(" ");

        for (int j=1; j<=2*i-1; j++)
            System.out.print("*"); 

        System.out.println();
            
        }
        for (int i=4; i>=1; i--) {
            for (int s=5; s>=i; s--)
            System.out.print(" ");

        for (int j=1; j<=2*i-1; j++)
            System.out.print("*"); 

        System.out.println();
            
        }
    }
}