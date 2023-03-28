package personnages;



public class Yakuza extends Humain {

    private String clan;
    private int reputation = 0;

    public Yakuza(String nom, String boissonFav, int argent, String clan)
    {
        super(nom, boissonFav, argent);
        this.clan = clan;
    }

    public void extorquer(Commercant commercant)
    {
        System.out.println(parler() + "Tiens, tiens, ne serai-ce pas un faible marchand qui passe par là ?");
        System.out.println(commercant.getNom() + ", si tu tiens à la vie, donne moi toute ta bourse !");
        int benef = commercant.seFaireExtorquer();
        gagnerArgent(benef);
        this.reputation += 1;
        System.out.println("J'ai piqué les " + benef + " berry(s) de " + commercant.getNom() + ", ce qui me fait " + getArgent() + " dans ma poche.");
    }

}
