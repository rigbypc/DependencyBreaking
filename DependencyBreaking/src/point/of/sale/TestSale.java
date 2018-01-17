package point.of.sale;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSale {

	@Test
	public void test() {
		Display display = new FakeDisplay();
		Sale sale = new Sale(display);
		fail("Not yet implemented");
	}

}
