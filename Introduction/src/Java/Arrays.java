package Java;

public class Arrays {
	static int a[] = { 14, 12, 37, 14, 95, 6 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// adding the numbers of an array

		int sum = 0;
		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];
		}
		// System.out.println(sum);
		// findIndex(6);
		// PrintTillRequiredNum(11);
		PrintFromRequiredNum(12);

	}

	// Finding the index of a number in an array
	public static void findIndex(int Num) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] == Num) {
				System.out.println(i + " is the index");
				break;
			}
		}

	}

	public static void PrintTillRequiredNum(int Num) {

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
			if (a[i] == Num) {

				break;
			}
		}

	}

	public static void PrintFromRequiredNum(int Num) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] == Num) {

				for (int j = i; j < a.length; j++) {
					System.out.println(a[j]);
				}
			}

		}

	}

}
