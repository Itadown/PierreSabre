package histoire;
import personnages.Humain;
import personnages.Commercant;

public class HistoireTP4 {
	
	
	
	public static void main(String[] args)
	{
		Humain zoro = new Humain("Zoro", "du saké", 54);
		zoro.direBonjour();
		zoro.acheter("du saké", 12);
		zoro.boire();
		zoro.acheter("un jeu", 2);
		zoro.acheter("un kimono", 50);

		System.out.println("\n");

		Commercant nami = new Commercant("Nami", 500000);
		nami.direBonjour();
		nami.seFaireExtorquer();
		nami.recevoir(15000000);
		nami.boire();

		System.out.println("\n");

		Yakuza kaido = new Yakuza("Kaido", "du saké", 125, "Equipage des 100 bêtes");
		 
	}
}
