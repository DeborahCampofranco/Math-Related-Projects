package RecursiveMethods;

public class Factorial {
    public void printFactorial(int number){
        System.out.println("\nThe factorial of " + number + " is " + factorialRecursive(number));
    }
    private long factorialRecursive(int number) {
        long n_fact;
        if(number==0 || number==1) return 1;
        else {
            n_fact=number*factorialRecursive(number-1);
        }
        return n_fact;
    }
}
