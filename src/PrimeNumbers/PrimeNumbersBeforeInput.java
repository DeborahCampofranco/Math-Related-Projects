package PrimeNumbers;

public class PrimeNumbersBeforeInput {
    private boolean isPrime(int number) {
        if(number<0) throw new RuntimeException("The number is negative");
        if(number==0 || number == 1) return false;
        else {
            for(int i = 2; i <= Math.sqrt(number); i++){
                if(number % i == 0) return false;
            }
        }
        return true;
    }

    // TODO: a method to skip the multiples in the for
    private int skipMultiples(int i){
        int nextSmallestNonMultiple = i+1;
        while(true){
            for(int j = i; j>=2; j--){
                if(nextSmallestNonMultiple % j == 0){
                    nextSmallestNonMultiple++;
                    break;
                }
            }
            return 0;
        }
    }
}
