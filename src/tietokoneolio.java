
public class tietokoneolio {

	public static void main(String[] args) {
		
		// Muodostetaan tietokone-luokasta olio
		Tietokone tietokone1 = new Tietokone();
		tietokone1.kaynnisty();
		tietokone1.sammu();
		
	}

} // Main -luokan lopetus


// Tietokone-luokka
class Tietokone {
	
	// toiminnallisuudet
	public void kaynnisty() {
		System.out.println("Tietokone on käynnistetty");
	}
	
	public void sammu() {
		System.out.println("Tietokone sammutetaan");
	}

}