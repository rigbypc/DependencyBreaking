package point.of.sale;

public class Sale {

	ArtR56 artR56;
	public Sale(ArtR56 artR56) {
		this.artR56 = artR56;
	}
	
	public void scan(String barcode) {
		artR56.display(barcode);
	}

}
