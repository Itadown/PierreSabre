package personnages;

public class Humain {
	
	private String nom;
	private String boissonFav;
	private int argent;

	protected int nbConnaissance = 0;
	protected Humain[] memoire = new Humain[30];
	

	public Humain(String nom, String boissonFav, int argent)
	{
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.argent = argent;
	}
	


	public void faireConnaissanceAvec(Humain humain)
	{
		direBonjour();
		memoriser(humain);
		humain.repondre(this);
	}

	private void memoriser(Humain humain)
	{
		memoire[ (nbConnaissance%30) ] = humain;
		nbConnaissance += 1;
	}

	private void repondre(Humain humain)
	{
		direBonjour();
		memoriser(humain);
	}


	public void listerConnaissance()
	{
		String liste = "";
		int lim;
		if (nbConnaissance > 30)
		{
			lim = 30;
		}
		else
		{
			lim = nbConnaissance;
		}
		for (int i = 0; i < lim; i++)
		{
			if (i == 0)
			{
				liste += memoire[i].getNom();
			}
			else
			{
				liste += ", " + memoire[i].getNom();
			}
			
		}
		System.out.println(parler() + "Je connais beaucoup de monde dont : " + liste + ".");
	}









	protected String parler()
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
	
	
	protected void gagnerArgent(int gain)
	{
		this.argent += gain;
	}
	
	protected void perdreArgent(int perte)
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
