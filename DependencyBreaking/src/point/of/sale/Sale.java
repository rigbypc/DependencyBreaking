package point.of.sale;

public class Sale {

	PostgresCalls postgres;
	ArtR56 artR56;
	
	public Sale(ArtR56 artR56, PostgresCalls postgres) {
		this.artR56 = artR56;
		this.postgres = postgres;
	}
	
	public void scan(String barcode) {
		//display the barcode
		artR56.showLine(barcode);
		
		//lookup barcode in postgres and get item
		artR56.showLine(postgres.barcode(barcode));
		
	}

}
