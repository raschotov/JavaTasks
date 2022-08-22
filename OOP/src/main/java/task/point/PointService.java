package task.point;

public class PointService {

    public static double distance(Point point1, Point point2) {
        return Math.sqrt(Math.pow(point2.getCoordinateX() - point1.getCoordinateX(), 2) + Math.pow(point2.getCoordinateY() - point1.getCoordinateY(), 2));
    }

    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, -100);
        System.out.println(distance(point1, point2));
    }
}