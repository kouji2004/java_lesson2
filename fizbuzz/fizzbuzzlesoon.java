package fizbuzz;

class fizzbuzzlesoon {
  public static void main(String[]ages){
    for(int i=0; i<=101; i++){
      if(i%3==0){
        System.out.println("fizz");
      }else if(i%5==0){
        System.out.println("buzz");
      }else{
        System.out.println(i);
      }
    }
  }
}
