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

        honneur += 1;
        System.out.println(parler() + commercant.getNom() + " prend ces " + a_donner + " berrys.");

        commercant.recevoir(a_donner);

        
    }

    public void provoquer(Yakuza adversaire)
    {
        System.out.println(parler() + "Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
        if (honneur * 2 > adversaire.getReputation())
        {
            System.out.println(parler() + "Je t'ai eut petit yakuza !");
            gagnerArgent(adversaire.perdre());
            honneur += 1;
        }
        else
        {
            System.out.println(parler() + "J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
            int ar = getArgent();
            adversaire.gagner(ar);
            perdreArgent(ar);
            honneur -= 1;
        }
    }
}
