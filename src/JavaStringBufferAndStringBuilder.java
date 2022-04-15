

public class JavaStringBufferAndStringBuilder {
	public static void main(String[] args) {
        StringBuffer sBuffer = new StringBuffer();
		System.out.println("Capacity of Buffer " +sBuffer.capacity());

		sBuffer = new StringBuffer(50);
		System.out.println("Capacity of Buffer " +sBuffer.capacity());

		sBuffer = new StringBuffer("My StringBuffer");
		System.out.println("Capacity of Buffer " +sBuffer.capacity());

		System.out.println("String in sBuffer: " +sBuffer);

		StringBuilder sBuilder = new StringBuilder("My StringBuilder");
		System.out.println("String in sBuilder:" +sBuilder);

		sBuffer.append(" Appended with StringBuffer.");
		sBuilder.append(" Appended with StringBuilder.");
		System.out.println("String in sBuffer: " +sBuffer);
		System.out.println("String in sBuilder:" +sBuilder);

		sBuffer = new StringBuffer("AABCABBC");
		//System.out.println("Capacity of Buffer " +sBuffer.capacity());
		//System.out.println("String in sBuffer: " +sBuffer);
		sBuilder = new StringBuilder("abaabcabac");
		System.out.println("String in sBuffer: " +sBuffer);
		System.out.println("String in sBuilder:" +sBuilder);

		System.out.println("Reversed StringerBuffer: "+sBuffer.reverse());
		System.out.println("Reversed StringerBuilder: "+sBuilder.reverse());
	}
}
