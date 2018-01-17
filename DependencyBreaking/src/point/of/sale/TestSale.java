package point.of.sale;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSale {

	@Test
	public void test() {
		Display display = new FakeDisplay();
		Sale sale = new Sale(display);
		sale.scan("123");
		fail("Not yet implemented");
	}

}
