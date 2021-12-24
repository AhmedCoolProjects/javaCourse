package course;

public class Main {

	public static void main(String[] args) {
		Point o = new Point(7, 12);
		Cercle c = new Cercle(o, 8.50);
		System.out.print(
				"the x of the center is: " + c.getO().getX() + " , and the y of the center is: " + c.getO().getY());
	}
}
