
public class tietokoneolio {

	public static void main(String[] args) {
		
		// Muodostetaan tietokone-luokasta olio
		Tietokone tietokone1 = new Tietokone();
		tietokone1.kaynnisty();
		
	}

} // Main -luokan lopetus


// Tietokone-luokka
class Tietokone {
	
	// toiminnallisuudet
	public void kaynnisty() {
		System.out.println("Tietokone on käynnistetty");
	}

}