public class triangle {
    public static void drawTriangle(int n){
        int num = 1, end = n;
        while(num <= end){
            for(int i = 0; i < num; i++)
                System.out.print("*");
            System.out.println();
            num++;
        }
    }

    public static void main(String[] args) {
        drawTriangle(10);
    }       
}