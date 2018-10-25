
package binary;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class FactorialII {
    public static void main(String []args){
        Scanner keyborad = new Scanner(System.in);
        System.out.println("Enter a nonnegative integer ( >=0: )");
        int number = keyborad.nextInt();
        System.out.println(number +"! = "+ recursiveFactorial(number));
    }
    public static double recursiveFactorial(int num){               
       if ( num <= 1 )  // base case
          return 1;
       else
          return num * recursiveFactorial( num - 1 );
    }
    public static double nonrecursiveFactorial(int num){
       double result = 1;
       if (num<1)
           return 1;
       else
           for( int i =2 ; i<=num; i++){
               result *= i;
           }
       return result;
    }
}
