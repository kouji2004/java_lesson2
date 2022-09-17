package fizbuzz;

class fizbuzz {
  public static void main(String[]ages){
    int i = 0;
    while(i<100){
      i++;
      if (i%15==0){
        System.out.println("fizzBuzz");
      }else if(i%5==0){
        System.out.println("Buzz");
      }else if(i%3==0){
      System.out.println("Fizz");
      }else{
        System.out.println(i);
      }
    }
    
  }  
}
