package classes;

import java.math.BigInteger;

/**
 * Membuat BigNumber Class
 */
public class BigNumberApp {
    public static void main(String[] args) {
        
        BigInteger bigInteger = new BigInteger("1000000000000000000000000000000");
        BigInteger bigInteger2 = new BigInteger("3000000000000000000000000000000");

        BigInteger resultInBigInteger = bigInteger.add(bigInteger2);
        System.out.println(resultInBigInteger);

        BigInteger resultInBigInteger2 = bigInteger.subtract(bigInteger2);
        System.out.println(resultInBigInteger2);

        BigInteger resultInBigInteger3 = bigInteger.multiply(bigInteger2);
        System.out.println(resultInBigInteger3);

        BigInteger resultInBigInteger4 = bigInteger.divide(bigInteger2);
        System.out.println(resultInBigInteger4);

        BigInteger resultInBigInteger5 = bigInteger.mod(bigInteger2);
        System.out.println(resultInBigInteger5);
    }
}
