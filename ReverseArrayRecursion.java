
package Week6_Recursion;

import java.util.Arrays;

/**
 * @author chris-pastorius
 */
public class ReverseArrayRecursion {

    public static void main(String[] args) {
       
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        
        int[] rev = reverse(array, 0);
        System.out.println(Arrays.toString(rev));
    }
    
    public static int[] reverse(int[] arr, int i) {
        
        if(i == arr.length / 2) {
            return arr;
        }
        
        int temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
        i++;
        return reverse(arr, i);
    }
}
