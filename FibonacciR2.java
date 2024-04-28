
package Week6_Recursion;

/**
 * @author chris-pastorius
 */
public class FibonacciR2 {

    public static void main(String[] args) {
        System.out.println(fib(6));
    }
    
    public static long fib(int n) {
        
        if(n < 2) {
            return n;
        } else {
            long f1 = fib(n - 1);
            long f2 = fib(n - 2);
            long f = f1 + f2;
            System.out.println("F1 = " + f1 + " | F2 = " + f2 + " | F = " + f);
            return f;
        }
        
    }

}
