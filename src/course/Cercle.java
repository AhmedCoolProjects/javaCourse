package course;

public class Cercle {
	private Point o;

	public Point getO() {
		return o;
	}

	public void setO(Point o) {
		this.o = o;
	}

	public double getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}

	private double r;

	public Cercle(Point o, double d) {
		super();
		this.o = o;
		this.r = d;
	}

}
