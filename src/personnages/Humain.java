package personnages;

public class Humain {
	
	private String nom;
	private String boissonFav;
	private int argent;
	
	public Humain(String nom, String boissonFav, int argent)
	{
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.argent = argent;
	}
	
	public String parler()
	{
		return (this.nom + " : ");
	}
	
	public void boire()
	{
		System.out.println(parler() + "Mmmm, un bon verre de " + this.boissonFav + " ! GLOUPS !");
	}
	
	public void direBonjour()
	{
		System.out.println(parler() + "Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boissonFav + " !");
	}
	
	
	public void gagnerArgent(int gain)
	{
		this.argent += gain;
	}
	
	public void perdreArgent(int perte)
	{
		this.argent -= perte;
	}
	
	public void acheter(String bien, int prix)
	{
		System.out.println(parler() + "Bonjour ! J'aimerai acheté " + bien + ".");
		
		if (this.argent < prix)
		{
			System.out.println(parler() + "Je n'ai plus que " + this.argent + " berry(s) en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " berry(s).");
		}
		else
		{
			System.out.println(parler() + "J'ai " + this.argent + " berry(s) en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " berry(s).");
			perdreArgent(prix);
		}
	}

	public int getArgent()
	{
		return this.argent;
	}

	public String getNom()
	{
		return this.nom;
	}
}
