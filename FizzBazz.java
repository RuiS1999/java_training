public class FizzBazz {
  public static void main (String []args) {
    String ans ="";
    Integer FizzBizzCount = 0;
    Integer FizzCount = 0;
    Integer BizzCount = 0;
    Integer OtherCount = 0;
    for ( int i = 1; i < 101; i++) {
      if ( i % 3 == 0 && i % 5 == 0 ) {
        ans = ans + "FizzBazz";
        FizzBizzCount = FizzBizzCount + 1;
      } else if ( i % 3 == 0 ) {
        ans = ans + "Fizz";
        FizzCount = FizzCount + 1;
      } else if ( i % 5 == 0 ) {
        ans = ans + "Bizz";
        BizzCount = BizzCount + 1;
      } else {
        ans = ans + i;
        OtherCount = OtherCount + 1;
      }
    }
    System.out.println( ans );
    System.out.println( "FizzBizzの数は" + FizzBizzCount + "個です。" );
    System.out.println( "Fizzの数は" + FizzCount + "個です。" );
    System.out.println( "Bizzの数は" + BizzCount + "個です。" );
    System.out.println( "その他の数は" + OtherCount + "個です。" );
  }
}