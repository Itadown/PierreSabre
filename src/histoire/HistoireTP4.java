package histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;
import personnages.Samourai;

public class HistoireTP4 {
	
	
	
	public static void main(String[] args)
	{
		// Humain zoro = new Humain("Zoro", "du saké", 54);
		// zoro.direBonjour();
		// zoro.acheter("du saké", 12);
		// zoro.boire();
		// zoro.acheter("un jeu", 2);
		// zoro.acheter("un kimono", 50);

		// System.out.println("\n");

		// Commercant nami = new Commercant("Nami", 500000);
		// nami.direBonjour();


		// System.out.println("\n");

		// Yakuza kaido = new Yakuza("Kaido", "du saké", 125, "Equipage des 100 bêtes");
		// kaido.direBonjour();
		// kaido.extorquer(nami);


		// Ronin sanji = new Ronin("Sanji", "du sang", 60);

		// sanji.direBonjour();
		// sanji.donner(nami);
		
		// sanji.provoquer(kaido);

		// Commercant marco = new Commercant("Marco", 20);
		// Commercant chonin = new Commercant("Chonin", 40);
		// Commercant kumi = new Commercant("Kumi", 10);
		// Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		// Ronin roro = new Ronin("Roro", "shochu", 60);

		// marco.faireConnaissanceAvec(roro);
		// marco.faireConnaissanceAvec(yaku);
		// marco.faireConnaissanceAvec(chonin);
		// marco.faireConnaissanceAvec(kumi);

		// marco.listerConnaissance();
		// roro.listerConnaissance();
		// yaku.listerConnaissance();

		// yaku.direBonjour();

		Commercant marco = new Commercant("Marco", 20);
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
		
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listerConnaissance();
		akimoto.boire("du thé");
		


	}
}
