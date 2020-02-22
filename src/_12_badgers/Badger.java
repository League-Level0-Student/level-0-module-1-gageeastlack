package _12_badgers;

public class Badger {
	public static void main(String[] args) {
		for (int x = 0; x < 3; x++) {
			for (int i = 0; i < 10; i++) {
				System.out.println("Badger");

			}
			if (x < 2) {
				for (int i = 0; i < 2; i++) {
					System.out.println("Mushroom");
				}
			}
		}
		for (int i = 0; i < 4; i++) {
			System.out.println("It's a snake");
		}
	}
}
