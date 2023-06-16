import PerfectNumbersBeforeInput.PerfectNumbersBeforeInput;
import PrimeNumbers.PrimeNumbersBeforeInput;
import RecursiveMethods.Factorial;
import RecursiveMethods.HarmonicSum;

public class Main {
    public static void main(String[] args) {
        PrimeNumbersBeforeInput primeNumbersBeforeInput = new PrimeNumbersBeforeInput();
        primeNumbersBeforeInput.printPrimeNumbersBefore(34);

        PerfectNumbersBeforeInput perfectNumbersBeforeInput = new PerfectNumbersBeforeInput();
        perfectNumbersBeforeInput.printPerfectNumbersBefore(34);

        Factorial fact = new Factorial();
        fact.printFactorial(5);

        HarmonicSum harmonicSum = new HarmonicSum();
        harmonicSum.printHarmonicSum(5);
    }
}