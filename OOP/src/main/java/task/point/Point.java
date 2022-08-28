package task.point;

public class Point {
	private int coordinateX;
	private int coordinateY;

	public Point (int x, int y) {
		coordinateX = x;
		coordinateY = y;
	}

	public int getCoordinateX(){
		return this.coordinateX;
	}

	public int getCoordinateY(){
		return this.coordinateY;
	}

	public double distance(Point second) {
		return Math.sqrt(Math.pow(second.getCoordinateX() - this.getCoordinateX(), 2) + Math.pow(second.getCoordinateY() - this.getCoordinateY(), 2));
	}
}
