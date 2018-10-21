import java.util.StringJoiner;

public class TestStringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner sj = new StringJoiner("], [", "[", "]");
		sj.add("Myat").add("Thwin").add("Maung");
		String result = sj.toString();
		System.out.println(result);
		System.out.println("haha");
	}

}
