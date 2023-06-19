package RecursiveMethods;

public class PalindromeWords {
    public void printIfTheWordIsPalindrome(String s){
        if(isPalindrome(s)) System.out.println("\n" + s + " is palindrome");
        else System.out.println("\n" + s + " isn't palindrome");
    }

    private boolean isPalindrome(String s) {
        if(s.length()==0 || s.length()==1) return true;
        else {
            if(s.charAt(0) == s.charAt(s.length()-1)){
                s = s.substring(1,s.length()-1);
                return isPalindrome(s);
            } else return false;
        }
    }
}
