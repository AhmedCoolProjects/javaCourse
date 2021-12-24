package course;

public class Point {
	private int x, y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void changerCord(int x, int y) {
		setX(x);
		setY(y);
	}
}
