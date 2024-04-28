
package Week6_Recursion;

/**
 * @author chris-pastorius
 */
public class FibonacciMemoization {
    
    static long[] fibonacciCache;

    public static void main(String[] args) {  
        int n = 92;
        fibonacciCache = new long[n + 1];
        System.out.println(fib(n));
    }
    public static long fib(int n) {
        if(n < 2) {
            return n;
        }
        if(fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }
        
        long nthFibNumber = fib(n - 1) + fib(n - 2);
        
        fibonacciCache[n] = nthFibNumber;
        return nthFibNumber; 
    }
}
