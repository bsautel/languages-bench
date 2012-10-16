public class Bench {
	public static void main(String[] args) {
		compute(1000000000);
	}

	private static void compute(int number) {
		int i = 0;
		while (i < number) {
			if (i % 123 == 0) {
				i = i + 10;
			} else {
				i = i + 1;
			}
		}
		System.out.println("result is " + i);
	}
}
