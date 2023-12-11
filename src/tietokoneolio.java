
public class tietokoneolio {

	public static void main(String[] args) {
		
		// Muodostetaan tietokone-luokasta olio
		Tietokone tietokone1 = new Tietokone(8); //muisti määritetty heti luonnin yhteydessä
		tietokone1.kaynnisty();
		tietokone1.sammu();
		tietokone1.tulostaTiedot(); 
	}

} // Main -luokan lopetus


// Tietokone-luokka
class Tietokone {
	
	// ominaisuudet
	private boolean kaynnissa;
	private int muisti;
	
	// konstruktori
	public Tietokone(int alkuMuisti) {
		this.kaynnissa = false;
		this.muisti = alkuMuisti;
	}
	
	// toiminnallisuudet
	public void kaynnisty() {
		this.kaynnissa = true;
		System.out.println("Tietokone on nyt käynnistetty");
	}
	
	public void sammu() {
		this.kaynnissa = false;
		System.out.println("Tietokone sammutetaan");
	}
	
	// getter muistille
	public int getMuisti() {
		return muisti;
	}
	 public void tulostaTiedot() {
	        System.out.println("Tietokoneen tiedot:");
	        System.out.println("Käynnissä: " + kaynnissa);
	        System.out.println("Muistin määärä: " + muisti + " gigatavua");
	       
	 }

}
