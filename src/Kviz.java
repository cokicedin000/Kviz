import java.util.Scanner;

public class Kviz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vase pitanje je:");
		int unos;
		int a = (int) (Math.random()*100);
		int b = (int) (Math.random()*100);
		int random = (int) ((Math.random() * 6) + 1);
		switch (random) {
		case 1:
			System.out.println(a + " + " + b + " = ");
			unos = input.nextInt();
			if (unos == sabiranje(a,b)) {
				System.out.println("tacno");
			} else {
				System.out.println("netacno");
			}
			break;
		case 2:
			System.out.println(a + " - " + b + " = ");
			unos = input.nextInt();
			if (unos == oduzimanje(a,b)) {
				System.out.println("tacno");
			} else {
				System.out.println("netacno");
			}
			break;
		case 3:
			System.out.println(a + " * " + b + " = ");
			unos = input.nextInt();
			if (unos == mnozenje(a,b)) {
				System.out.println("tacno");
			} else {
				System.out.println("netacno");
			}
			break;
		case 4:
			System.out.println(a + " / " + b + " = ");
			unos = input.nextInt();
			if (unos == dijeljenje(a,b)) {
				System.out.println("tacno");
			} else {
				System.out.println("netacno");
			}
			break;
		case 5:
			System.out.println(a + "^2"+ " = ");
			unos = input.nextInt();
			if (unos == kvadriranje(a)) {
				System.out.println("tacno");
			} else {
				System.out.println("netacno");
			}
			break;
		case 6:
			System.out.println("KOR iz: " + a);
			unos = input.nextInt();
			if (unos == korjenovanje(a)) {
				System.out.println("tacno");
			} else {
				System.out.println("netacno");
			}
			break;
		default:
			System.out.println("Pogresan unos");
			break;
		}
	}

	public static double sabiranje(double a, double b) {
		return a+b;
	}

	public static double oduzimanje(double a, double b) {
		return a-b;
	}

	public static double mnozenje(double a, double b) {
		return a*b;
	}

	public static double dijeljenje(double a, double b) {
		return a/b;
	}

	public static double korjenovanje(double a) {
		return Math.sqrt(a);

	}

	public static double kvadriranje(double a) {
		return Math.pow(a, 2);

	}
}