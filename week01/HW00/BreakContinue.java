// HW0, exercise 04
public class BreakContinue {
    public static void windowPosSum(int[] a, int n) {
      for(int i = 0; i < a.length-1; i++){
        if(a[i] < 0)
            continue;
        else{
            for(int k = i+1; k <= i+n ; k++){
                if(k >= a.length)
                    break;
                a[i] += a[k];
            }
        }   
        
      }
    }
  
    public static void main(String[] args) {
      int[] a = {1, 2, -3, 4, 5, 4};
      int n = 3;
      windowPosSum(a, n);
  
      // Should print 4, 8, -3, 13, 9, 4
      System.out.println(java.util.Arrays.toString(a));
    
      int[] b = {1, -1, -1, 10, 5, -1};
      n = 2;
      windowPosSum(b, n);
      
      // Should print -1, -1, -1, 14, 4, -1
      System.out.println(java.util.Arrays.toString(b));
    }
  }