class Anagrammer {
  public static String[] computeAnagrams(String string, int n) {

    String[] anagrams = new String[n];
    int[] factorials = new int[string.length()];

    for (int i = 0; i < string.length(); i++) {
      factorials[i] = MathUtils.factorial(i);
    }

    for (int i = 0; i < n; i++) {
      String oneAnagram = "";
      String temporary = string;
      int position = i;
      for (int j = string.length(); j > 0; j--) {
        int selected = position / factorials[j - 1];
        oneAnagram += temporary.charAt(selected);
        position %= factorials[j - 1];
        temporary = temporary.substring(0, selected) + temporary.substring(selected + 1);
      }
      anagrams[i] = oneAnagram;
    }
    return anagrams;
  }

  public static String[] computeAllAnagrams(String string) {
    return computeAnagrams(string, MathUtils.factorial(string.length()));
  }
}