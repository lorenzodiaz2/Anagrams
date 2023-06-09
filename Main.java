import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the word: ");
    String word = input.next();

    if (args.length == 0) {
      StringUtils.printStringArray(Anagrammer.computeAllAnagrams(word));
    } else {
      int n = Integer.parseInt(args[0]);

      while (n < 0) {
        System.out.print("n must be non negative number. Reinsert it: ");
        n = input.nextInt();
      }

      if (n > MathUtils.factorial(word.length())) {
        n = MathUtils.factorial(word.length());
      }

      StringUtils.printStringArray(Anagrammer.computeAnagrams(word, n));
    }

  }
}