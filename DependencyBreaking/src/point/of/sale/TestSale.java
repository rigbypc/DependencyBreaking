package point.of.sale;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSale {

	@Test
	public void test() {
		FakeDisplay fakeDisplay = new FakeDisplay();
		Sale sale = new Sale(fakeDisplay);
		sale.scan("123");
		assertEquals("123", fakeDisplay.getLastLine());
		
	}

}
