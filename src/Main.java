public class Main {


    public static void sum (int a, int b) {
        System.out.println(a+b);
    }

    public static void prod (int a, int b) {
        System.out.println(a*b);
    }


    public static Double factorial(Integer a) {

        double fact = 1;
        for (int i = 1; i <= a; i++) {

            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        sum(10,20);
        prod(10,20);

        System.out.println(factorial(5));

    }
}
