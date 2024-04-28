
package Week6_Recursion;

/**
 * @author chris-pastorius
 */
public class FibonacciMemoizationAll {
    
    static long[] fibonacciCache;

    public static void main(String[] args) {  
        int n = 92;
        fibonacciCache = new long[n + 1];
        
        for (int i = 0; i < n; i++) {
            System.out.println(fib(i));
        }
        
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
