import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        System.out.println("Type something for palindrome test");
        Scanner input = new Scanner(System.in);
        String word1 = "";
        String wordInput = input.nextLine();
        for (int counter = 0; counter < wordInput.length(); counter++){
            word1 = wordInput.charAt(counter) + word1;

        }
        System.out.println(word1);
        if(word1.equals(wordInput)) {
            System.out.printf("%s is a palindrome",wordInput);
        }
        else{
            System.out.printf("%s is a palindrome",wordInput);
        }
    }
}
