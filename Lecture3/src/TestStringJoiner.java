import java.util.StringJoiner;

public class TestStringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testStringJoiner();
		testWithSetEmptyValue();
		testBothEmptyAndAdd();
	}

	private static void testStringJoiner() {
		StringJoiner sj = new StringJoiner("], [", "[", "]");
		sj.add("Myat").add("Thwin").add("Maung");
		String result = sj.toString();
		System.out.println(result);
	}

	private static void testWithSetEmptyValue() {
		StringJoiner sj = new StringJoiner(", ", "{", "}");
		sj.setEmptyValue("Empty String");
		sj.toString();
		System.out.println(sj);
	}

	private static void testBothEmptyAndAdd() {
		StringJoiner sj = new StringJoiner(",", "[", "]");
		sj.setEmptyValue("Empty String");
		sj.add("");
		sj.toString();
		System.out.println(sj);
	}
}
