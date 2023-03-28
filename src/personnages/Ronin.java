package personnages;

public class Ronin extends Humain {

    private int honneur = 1;

    public Ronin(String nom, String boissonFav, int argent)
    {
        super(nom, boissonFav, argent);
    }
    
    public void donner(Commercant commercant)
    {
        int argent = getArgent();
        int a_donner = argent / 10;

        perdreArgent(a_donner);
        commercant.recevoir(a_donner);
    }
}
