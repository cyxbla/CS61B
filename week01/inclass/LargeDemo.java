public class LargeDemo {
    public static int larger(int x, int y) {
        if(x > y)
            return x;
        return y;
    }
    public static double larger(double x, double y) {
        if(x > y)
            return x;
        return y;
    }
    public static void main(String[] args){
        System.out.println(larger(-8, -10));
        System.out.println(larger(-3.5, -10));
    }
}

/* class note
1. Functions must be declared as part of a class in Java.
   A function that is part of a class is called a "method".
   So in Java, all functions are methods.
2. To define a function in Java, we use "public static".
   We will see alternate ways of defining functions later.
3. All parameters of a function must have a declared type,
   and the return value of the function must have a declared type.
   Functions in Java return only one value!
*/