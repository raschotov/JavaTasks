package task.point;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

	@Test
	public void distance() {
		Point point1 = new Point(15,16);
		Point point2 = new Point(23, 42);
		double result = point1.distance(point2);

		//'assertEquals(double, double)' is deprecated, "fuzz factor" value needed
		Assert.assertEquals(27.202941017470888, result, 0.001);
	}
}