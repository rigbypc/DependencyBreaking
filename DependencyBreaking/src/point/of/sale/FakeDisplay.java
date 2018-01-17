package point.of.sale;

public class FakeDisplay implements Display {

	public FakeDisplay() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showLine(String line) {
		System.out.println(line);

	}

}
