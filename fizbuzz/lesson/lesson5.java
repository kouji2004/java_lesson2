package fizbuzz.lesson;

public class lesson5 {
  public static void main(String[] ages) {
   int all = 0;
   for(int i=0; i<=20; i++){
    all = i+all;
   }
   System.out.println("総数は"+all);
  }
}