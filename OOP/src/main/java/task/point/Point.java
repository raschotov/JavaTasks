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

	public static double distance(Point point1, Point point2) {
		return Math.sqrt(Math.pow(point2.getCoordinateX() - point1.getCoordinateX(), 2) + Math.pow(point2.getCoordinateY() - point1.getCoordinateY(), 2));
	}
}
