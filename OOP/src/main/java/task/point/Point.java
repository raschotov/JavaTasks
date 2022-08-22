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
}
