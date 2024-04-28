
package Week6_Recursion;

/**
 * @author chris-pastorius
 */
public class FibonacciR {

    public static void main(String[] args) {
        System.out.println(fib(45));
    }
    
    public static long fib(int n) {
        
        if(n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
        
    }

}
