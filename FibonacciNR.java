
package Week6_Recursion;

/**
 * @author chris-pastorius
 */
public class FibonacciNR {

    public static void main(String[] args) {
       
        long n = fib(5);
        System.out.println(n);
        
    }
    
    public static long fib(int n) {
        
        long f, prev1, prev2;
        prev1 = 0;
        f = prev2 = 1;
        
        for (int i = 0; i < n; i++) {
            
            if(i < 2) {
                // Do nothing
            } else {
                prev1 = f;
                System.out.println("Previous 1: " + prev1);
                f = prev1 + prev2;
                System.out.println("F: " + f);
                prev2 = prev1;
                System.out.println("Previous 2: " + prev2);
            }  
        }
       return f; 
    }
}
