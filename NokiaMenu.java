import java.util.Scanner;

public class NokiaMenu {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

		String display = """
\t\t___Menu___
1 => Phone Book\t\t\t7 =>
2 => Message\t\t\t8 =>
3 => Chat\t\t\t9 =>
4 => Call Register\t\t10 =>
5 => Tones\t\t\t11 =>
6 => Settings\t\t\t12 =>


""";

    System.out.println(display);



	}
}
