package branchoperators.movie;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieAccessServiceTest {

	@Test
	public void accessMovie() {
		int[] ages = {5, 18, 22, 30, -1};
		String ratingR = "Rating R. Access is allowed.";
		String ratingF = "Rating F. Access is allowed.";
		String denied = "Access is denied";
		String incorrectAge = "Incorrect age, please check user with current age";

		Assert.assertEquals(denied, MovieAccessService.accessMovie(ages[0]));
		Assert.assertEquals(ratingR, MovieAccessService.accessMovie(ages[1]));
		Assert.assertEquals(ratingF, MovieAccessService.accessMovie(ages[2]));
		Assert.assertEquals(ratingF, MovieAccessService.accessMovie(ages[3]));
		Assert.assertEquals(incorrectAge, MovieAccessService.accessMovie(ages[4]));
	}
}