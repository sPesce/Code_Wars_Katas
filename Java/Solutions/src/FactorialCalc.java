public class FactorialCalc {
  public static String Factorial(int n) {
    String num = "1";
    for(int i = 1; i <= n; i++)
    {
      num = multiply(i,num);
    }
    return num;
  }
  private static String multiply(int x, String num)
  {      
    int overflow = 0;
    char[] digits = num.toCharArray();
    StringBuilder sb = new StringBuilder();
    for(int j = digits.length - 1; j >= 0; j --)
    {
      final int mult = Character.getNumericValue(digits[j]) * x + overflow;
      sb.append( Character.forDigit(mult % 10,10) );
      overflow = mult / 10;
    }  
      
    //overflow added to the front if it exists
    return (overflow == 0 ? "" : Integer.toString(overflow)) + sb.reverse().toString();
  }
}
