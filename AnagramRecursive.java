import java.util.Scanner;

public class AnagramRecursive {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the world: ");
    String w = input.nextLine();

    System.out.print("Enter the number of anagrams: ");
    int n = input.nextInt();

    if (n > MathUtils.factorial(w.length())) {
      n = MathUtils.factorial(w.length());
    }
    String[] anagrams = new String[n];

    perm_avvio(w.toLowerCase(), anagrams);

  }

  public static void perm_avvio(String s, String[] anagrams) {

    String lavoro = s.replace(" ", "");
    System.out.println("Anagrams: ");
    permutazione(lavoro, lavoro, 0, anagrams);
  }

  private static void permutazione(String s, String lavoro, int p, String[] anagrams) {
    if (s.length() == 0) {
      found(anagrams, lavoro);
      if (!isNull(anagrams)) {

        for (int i = 0; i < anagrams.length; i++) {
          System.out.println("i = " + (i + 1) + "   " + anagrams[i].toUpperCase().charAt(0) + anagrams[i].toLowerCase().substring(1));
        }

        System.exit(0);
      }
    }

    for (int i = 0; i < s.length(); i++) {
      lavoro = lavoro.substring(0, p) + s.charAt(i) + lavoro.substring(p + 1);
      permutazione((s.substring(0, i) + s.substring(i + 1)), lavoro, p + 1, anagrams);
    }
  }

  public static void found(String[] arr, String lavoro) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == null) {
        arr[i] = lavoro;
        break;
      }
    }
  }

  public static boolean isNull(String[] arr) {
    for (String el : arr) {
      if (el == null) return true;
    }
    return false;
  }

}
