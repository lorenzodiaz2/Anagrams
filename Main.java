import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n;

    if (args.length == 0) {
      System.out.print("No argument for n, insert it : ");
      n = input.nextInt();
    } else {
      n = Integer.parseInt(args[0]);
    }
    while (n < 0) {
      System.out.print("n must be non negative number. Reinsert it: ");
      n = input.nextInt();
    }

    System.out.print("Enter the word: ");
    String word = input.next();

    if (n > MathUtils.factorial(word.length())) {
      n = MathUtils.factorial(word.length());
    }

    int decision;
    System.out.print("If you want to compute all anagrams press 0 : ");
    decision = input.nextInt();

    if(decision == 0){
      StringUtils.printStringArray(Anagrammer.computeAllAnagrams(word));
    }
    else{
      StringUtils.printStringArray(Anagrammer.computeAnagrams(word, n));
    }

  }
}
