class StringUtils {
  public static void printStringArray(String[] arr) {
    for (String s : arr) {
      System.out.println(capitalizedLetter(s));
    }
  }

  public static String capitalizedLetter(String w) {
    if (w.length() != 0) {
      return (w.toUpperCase()).charAt(0) + (w.toLowerCase()).substring(1);
    } else {
      return w;
    }
  }
}
