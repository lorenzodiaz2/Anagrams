import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = 20;
    /*
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
    */
    System.out.print("Enter the word: ");
    String word = input.nextLine();

    if (n > MathUtils.factorial(word.length())) {
      n = MathUtils.factorial(word.length());
    }

    //StringUtils.printStringArray(Anagrammer.computeAnagrams(word, n));

    StringUtils.printStringArray(Anagrammer.computeAllAnagrams(word));
  }
}
