package hw5Q2Constructor;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer = new Computer();

		Computer computer1 = new Computer("Apple", "MacBookAir", "MacOSMojave", 800, 'A', false);

		Computer computer2 = new Computer(12.000, "HP", "HPNotebook", "Windows", 'A', true);

	}

}
