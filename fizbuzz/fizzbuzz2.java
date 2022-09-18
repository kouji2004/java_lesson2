package fizbuzz;

class fizzbuzz2 {
  public static void main(String[] ages) {
    for (int i = 0; i <= 101; i++) {
      String str = "";
      if (i % 3 == 0) {
        str = str + "Fizz";
      }
      if (i % 5 == 0) {
        str = str + "buzz";
      }
      if (str.equals("")) {
        Integer i2 = i;
        str = i2.toString();
      }
      System.out.println(str);
    }
  }
}
