package PrimeNumbers;

public class PrimeNumbersBeforeInput {
    public void printPrimeNumbersBefore(int number){
        System.out.println("\nThe prime numbers up to " + number + " are: ");
        for(int i=2;i<number;i++){
            if(isPrime(i)) System.out.print( i+ " ");
        }
    }

    private boolean isPrime(int number) {
        if(number<0) throw new RuntimeException("The number is negative");
        if(number==0 || number == 1) return false;
        else {
            for(int i = 2; i <= Math.sqrt(number); i= nextNonMultiple(i)){
                if(number % i == 0) return false;
            }
        }
        return true;
    }

    private int nextNonMultiple(int i){
        int nextSmallestNonMultiple = i+1;
        for(int j=i;j>=2;j--){
            if(nextSmallestNonMultiple % j == 0){
                nextSmallestNonMultiple++;
                j=i;
            }
        }
        return nextSmallestNonMultiple;
    }
}
