package figure;

public abstract class GeometryShape {
	public class Shape2d extends GeometryShape{
		public class Parallelogram extends Shape2d{}
		public class Ellipse extends Shape2d{}
	}
	public class Shape3d extends GeometryShape{
		public class Parallelepiped extends Shape3d{}
		public class Cylinder extends Shape3d{}
	}
}
