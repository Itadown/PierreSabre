package histoire;
import personnages.Humain;

public class HistoireTP4 {
	
	
	
	public static void main(String[] args)
	{
		Humain zoro = new Humain("Zoro", "du saké", 54);
		zoro.direBonjour();
		zoro.acheter("du saké", 12);
		zoro.boire();
		zoro.acheter("un jeu", 2);
		zoro.acheter("un kimono", 50);
	}
}
