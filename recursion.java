public class recursion {
    public static void main(String[] args) {
        recursiveFunction(3);

        //Test inputs factorial
        System.out.println("Factorial of 3 is: " + factorial(3));
        System.out.println("Factorial of 5 is: " + factorial(5));
        System.out.println("Factorial of 7 is: " + factorial(7));
    }
    public static void recursiveFunction(int x) {
        if(x <= 1) {
            System.out.println("Base Case!");
        } else {
            System.out.println("Starting value:" + x );
            recursiveFunction(x - 1);
            System.out.println("Done with value:" + x );
        }
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } //recursive case: n! = n * (n - 1)!
        else {
            return n * factorial(n - 1);
        }
    }
}
