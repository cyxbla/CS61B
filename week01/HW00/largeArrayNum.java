public class largeArrayNum {
    public static int max(int[] m) {
        int maxNum = 0;
        for(int i = 0; i < m.length; i++){
            if(maxNum < m[i])
                maxNum = m[i];
        }
        return maxNum;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 22, 10, 6};
        System.out.println(max(numbers));
    }
    
}