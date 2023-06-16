package RecursiveMethods;

public class HarmonicSum {
    public void printHarmonicSum(int number){
        System.out.println("The harmonic sum of "+ number +" is "+harmonicSum(number));
    }
    private static double harmonicSum(int number) {
        double har_n=0;
        if(number==0){
            return 0;
        } else {
            har_n+=1./number + harmonicSum(number-1);
            return har_n;
        }
    }
}
