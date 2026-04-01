import java.math.BigInteger;

public class Factorial {
	public static BigInteger recFactorial(int number) {
		BigInteger result = BigInteger.valueOf(number);
		if (number <= 1) {
			return BigInteger.ONE; // base case
		}
		else {
			result = result.multiply(recFactorial(number - 1)); // recursive case
			return result;
		}
	}

	public static BigInteger itrFactorial(int number) {
		BigInteger result = BigInteger.ONE;
		for(int i = 2; i <= number; ++i) {
			result = result.multiply(BigInteger.valueOf(i));
		}

		return result;
	}
	}
}
