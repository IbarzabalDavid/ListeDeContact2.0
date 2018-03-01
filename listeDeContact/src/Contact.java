import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ibada1731710 on 2018-02-26.
 */
public class Contact {
    private String nom;
    private String nomFamille;
    private Adresse add;
    private ArrayList<Telephone> liste = new ArrayList<>();
    private Occupation occ;
    private Scanner sc=new Scanner(System.in);


    public String getNom() {
        return nom;
    }

    public String getNomFamille() {
        return nomFamille;
    }

    public Adresse getAdd() {
        return add;
    }

    public Occupation getOcc() {
        return occ;
    }

    public ArrayList<Telephone> getListe() {return liste;}

    public void setListe(ArrayList<Telephone> liste) {this.liste = liste;}

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNomFamille(String nomFamille) {
        this.nomFamille = nomFamille;
    }

    public void setAdd(Adresse add) {
        this.add = add;
    }


    public void setOcc(Occupation occ) {
        this.occ = occ;
    }


    public void ajouterContact(){
        System.out.println("---------------------------------");
        System.out.println("Veuillez entrer les informations suivantes :"+System.lineSeparator());
        System.out.println("Prénom :");
        setNom(sc.next());
        System.out.println("Nom :");
        setNomFamille(sc.next());
        Adresse adresse=new Adresse();
        adresse.ajouterAdresse();
        setAdd(adresse);
        Occupation occupation =new Occupation();
        occupation.ajouterOccupation();
        setOcc(occupation);

        Telephone telephone=new Telephone();
        telephone.ajoutelTel();
        //Criss un boucle qqpart icitte
        liste.add(telephone);


    }
}
