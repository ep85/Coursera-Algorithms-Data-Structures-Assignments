import java.math.BigInteger;

//Can be seen on https://repl.it/@EricPalumbo/Week-1-Assignment-1-Karatsuba-algorithm-1
class Main {
  public static void main(String[] args) {
    String intsOne="3141592653589793238462643383279502884197169399375105820974944592";
    String intsTwo="2718281828459045235360287471352662497757247093699959574966967627";

    //first string parts
    BigInteger s1a = new BigInteger(intsOne.substring(0, (intsOne.length()/2)));
    BigInteger s1b = new BigInteger(intsOne.substring(intsOne.length()/2));
    //second string parts
    BigInteger s2a = new BigInteger(intsTwo.substring(0, (intsTwo.length()/2)));
    BigInteger s2b = new BigInteger(intsTwo.substring(intsTwo.length()/2));

    //System.out.println(bd.multiply(new BigInteger("15")));
    //System.out.println(bd);


    //part 1 & 2
    BigInteger partOne=s1a.multiply(s2a);
    BigInteger partTwo=s1b.multiply(s2b);
    //part 3
    BigInteger part3One=s1a.add(s1b);
    BigInteger part3Two=s1a.add(s1b);
    BigInteger part3Sum=part3One.multiply(part3Two);
    //part 4 
    BigInteger part4One=part3Sum.subtract(partTwo);
    BigInteger part4Two=part4One.subtract(partOne);

    //step 5
    BigInteger part5One=partOne.multiply(new BigInteger("10000"));
    BigInteger part5Two=part4Two.multiply(new BigInteger("100"));
    BigInteger sum=(part5One.add(part4Two)).add(part5Two);

    System.out.println(sum);
  }
}