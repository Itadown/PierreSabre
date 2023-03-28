package personnages;


public class Commercant extends Humain {
    
    public Commercant(String nom, int argent)
    {
        super(nom, "du thé", argent);
    }

    public int seFaireExtorquer()
    {
        int argent = this.getArgent();
        this.perdreArgent(argent);
        System.out.println(parler() + "J'ai tout perdu ! Le monde est trop injuste...");
        return argent;
    }

    public void recevoir(int argent)
    {
        this.gagnerArgent(argent);
        System.out.println(parler() + argent + " berrys(s) ! Je te remercie généreux donateur !");
    }
}
