class StringUtils {
  public static void printStringArray(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println((i + 1) + "  " + capitalizedLetter(arr[i]));
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