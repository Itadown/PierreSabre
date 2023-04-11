package personnages;



public class Yakuza extends Humain {

    private String clan;
    private int reputation = 0;

    public Yakuza(String nom, String boissonFav, int argent, String clan)
    {
        super(nom, boissonFav, argent);
        this.clan = clan;
    }

    @Override
    public void direBonjour()
    {
        super.direBonjour();
        System.out.println(parler() + "Mon clan est celui de " + clan + ".");
    }


    public void extorquer(Commercant commercant)
    {
        System.out.println(parler() + "Tiens, tiens, ne serai-ce pas un faible marchand qui passe par là ?");
        System.out.println(parler() + commercant.getNom() + ", si tu tiens à la vie, donne moi toute ta bourse !");
        int benef = commercant.seFaireExtorquer();
        gagnerArgent(benef);
        this.reputation += 1;
        System.out.println(parler() + "J'ai piqué les " + benef + " berry(s) de " + commercant.getNom() + ", ce qui me fait " + getArgent() + " berry(s) dans ma poche.");
    }

    public int perdre()
    {
        reputation -= 1;
        int ar = getArgent();
        System.out.println(parler() + "J'ai perdu mon duel et mes " + ar + " berry(s), j'ai désonoré le clan de " + clan);
        perdreArgent(ar);
        return ar;
    }

    public void gagner(int gain)
    {
        reputation += 1;
        gagnerArgent(gain);
        System.out.println(parler() + "Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ? Je l'ai dépouillé de ses " + gain + " berry(s).");
    }

    public int getReputation()
    {
        return reputation;
    }
}
