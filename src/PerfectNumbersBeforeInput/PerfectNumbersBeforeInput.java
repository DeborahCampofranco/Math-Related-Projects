package PerfectNumbersBeforeInput;

public class PerfectNumbersBeforeInput {
    public void printPerfectNumbersBefore(int number){
        System.out.println("\nThe perfect numbers up to " + number + " are: ");
        for(int n=2; n<=number; n++){
            int dividers_sum=1;
            for(int m=2; m<n; m++){
                if( n%m == 0 ) dividers_sum += m;
            }
            if( dividers_sum == n ){
                System.out.print( n + " " );
            }
        }
    }

}
