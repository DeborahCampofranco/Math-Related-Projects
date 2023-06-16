import PerfectNumbersBeforeInput.PerfectNumbersBeforeInput;
import PrimeNumbers.PrimeNumbersBeforeInput;

public class Main {
    public static void main(String[] args) {
        PrimeNumbersBeforeInput primeNumbersBeforeInput = new PrimeNumbersBeforeInput();
        primeNumbersBeforeInput.printPrimeNumbersBefore(34);

        PerfectNumbersBeforeInput perfectNumbersBeforeInput = new PerfectNumbersBeforeInput();
        perfectNumbersBeforeInput.printPerfectNumbersBefore(34);
    }
}