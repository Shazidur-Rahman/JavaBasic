public class BitwiseOperator {
	public static void main(String[] args) {
		byte val1 = 12;          // 0000 1100
		byte val2 = 10;          // 0000 1010
		byte result;

		result = (byte) ~val1; // bitwise complement val1
		System.out.println("The result of bitwise complement: "+result);

		result = (byte) (val1 & val2); //AND
		System.out.println(" The result of AND operation: "+result);

		result = (byte) (val1 | val2); //OR
		System.out.println(" The result of OR operation: "+result);

		result = (byte) (val1 ^ val2); //XOR
		System.out.println(" The result of XOR operation: "+result);

		result = (byte) (val1 << 2); //Shift left
		System.out.println(" The result of 2 bits shift left: "+result);

		result = (byte) (val1 >> 2); //Shift Right
		System.out.println(" The result of 2 bits shift right: "+result);

	}
}
