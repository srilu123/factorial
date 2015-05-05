package com.parsa.app;

;

	/**
	 * This class calculates factorial of a number.
	 * 
	 * @author ramesh
	 *
	 */
	public class Factorial {

		/**
		 * This method returns factorial of provided number.
		 * 
		 * @param n - num
		 * @return int - factorial
		 */
		int getFactorial(int n) {

			int output;

			if (n == 0)
				return 1;

			if (n == 1)
				return 1;

			else

				output = getFactorial(n - 1) * n;

			return output;
		}

	}


