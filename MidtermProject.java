import java.util.Scanner;
import java.util.Arrays;

public class MidtermProject {

    //Palindrome - This function tells you if a word is the same spelled foward as it is spelled backwards
    //The input for this function is a word (string) and returns a boolean (true/false)
    public static boolean palindrome(String word){
        word = word.toLowerCase();
        word = word.replaceAll(" ", "");
        for( int i = 0; i < word.length(); i++) {
            char ch1 = word.charAt(i);
            int wordLength = word.length();
            char ch2 = word.charAt(wordLength - 1 - i);

            if(ch1 != ch2) {
               return false;
            }
        }
        return true;
    }

    //Anagrams - This function tells you if two words that are inputted have the same letters
    //The input is two words (strings) and returns a boolean (true/false)
    public static boolean anagram(String word1, String word2){
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            return true;
        } else {
            return false;
        }
    }

    //Prime Number - This function tells you if the number you input is prime (true) or not prime (false)
    //The input is a number (integer) and returns a boolean (true/false)
    public static boolean primeNum(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        } return true;
    }

    //Fibonacci Number - This function will take in a number and return the corresponding fibonacci number.
    //This function takes in a number (integer) and returns a number (integer)
    public static int fibNum(int num){
        int f0 = 0;
        int f1 = 1;
        if(num == f0){
            return 0;
        } else if(num == f1){
            return 1;
        }
        for(int i = 2; i<=num; i++){
            int newFib = f1 + f0;
            f0 = f1;
            f1 = newFib;
            } return f1;
        }


    public static void main(String[] args) {
        System.out.println("Welcome to my program. I have 4 functions for you to call upon. These functions are:");
        System.out.println("A- (Palindrome) Enter a word and I will tell you if it is a palindrome.");
        System.out.println("B- (Anagram) Enter two words and I will tell you if they are anagrams.");
        System.out.println("C- (Prime Number) Enter an integer and I will tell you if it is a prime number.");
        System.out.println("D- (Fibonacci Number) Enter an integer and I will tell you the corresponding Fibonacci number.");
        System.out.println("Please choose your function by entering a letter A-D.");
        Scanner scanner = new Scanner(System.in);
        String callFunc = scanner.nextLine();
        callFunc = callFunc.toLowerCase();

        if(callFunc.equals("a")){
            System.out.println("Please provide me a word");
            String palInput = scanner.nextLine();
            System.out.println(palindrome(palInput));
        } else if(callFunc.equals("b")){
            System.out.println("Please provide me one word");
            String anInput1 = scanner.nextLine();
            System.out.println("Please provide me another word");
            String anInput2 = scanner.nextLine();
            System.out.println(anagram(anInput1, anInput2));
        } else if(callFunc.equals("c")){
            System.out.println("Please provide me an integer");
            int primeInput = scanner.nextInt();
            System.out.println(primeNum(primeInput));
        } else if(callFunc.equals("d")){
            System.out.println("Please provide me an integer");
            int fibInput = scanner.nextInt();
            System.out.println(fibNum(fibInput));
        } else{
            System.out.println("The input you provided is not in my parameters. Please try again");
        }
    }

}