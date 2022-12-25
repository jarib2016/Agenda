package ProjetFinal.Classes;

/**
 * The type Amis.
 */
public class Amis extends Personne{

    /**
     * The Ville.
     */
    protected String Ville;

    /**
     * Instantiates a new Amis.
     */
    public Amis() {
    }

    /**
     * Instantiates a new Amis.
     *
     * @param name    the name
     * @param contact the contact
     * @param ville   the ville
     */
    public Amis(String name, String contact, String ville) {
        super(name, contact);
        Ville = ville;
    }

    /**
     * Gets ville.
     *
     * @return the ville
     */
    public String getVille() {
        return Ville;
    }

    /**
     * Sets ville.
     *
     * @param ville the ville
     */
    public void setVille(String ville) {
        Ville = ville;
    }

    @Override
    public void envoiMessage(String nomSms) {

        if(getName().equalsIgnoreCase(nomSms)){
            System.out.println("bonjour frérot comment tu vas ? la forme jespère.... Joyeux Noel chef");
        }else{
            System.out.println("Nous n'avons pas trouver de correspondant");
        }

    }

    @Override
    public void recherche(String recherche) {
        if (getVille().equalsIgnoreCase(recherche)) {
            System.out.println(getName());
        }
    }
}
