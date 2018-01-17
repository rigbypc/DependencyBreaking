package point.of.sale;

public class Sale {

	//PostgresCalls postgres;
	Display display;
	
	public Sale(Display display) { 
	//, PostgresCalls postgres) {
		this.display = display;
		//this.postgres = postgres;
	}
	
	public void scan(String barcode) {
		//display the barcode
		display.showLine(barcode);
		
		//lookup barcode in postgres and get item
		//artR56.showLine(postgres.barcode(barcode));
		
	}

}
