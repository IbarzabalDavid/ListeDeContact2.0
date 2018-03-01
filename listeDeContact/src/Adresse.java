import java.util.Scanner;

/**
 * Created by ibada1731710 on 2018-02-26.
 */
public class Adresse {
    private String numPorte;
    private String rue;
    private String ville;
    private String appart;
    private String province;
    private String pays;

    private Scanner sc=new Scanner(System.in);

    public String getNumPorte() {
        return numPorte;
    }

    public void setNumPorte(String numPorte) {
        this.numPorte = numPorte;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAppart() {
        return appart;
    }

    public void setAppart(String appart) {
        this.appart = appart;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
    public void ajouterAdresse(){
        String input;
        System.out.println("Adresse :");
        System.out.println("  Numéro de porte");
        setNumPorte(sc.next());
        System.out.println("  Rue :");
        setRue(sc.next());
        System.out.println("  Appartement :");
        input=sc.nextLine().trim();
        input=sc.nextLine().trim();
        if (input.equals("")){
           setAppart("");
        }
        else {
            setAppart(sc.next());
        }
        System.out.println("  Ville :");
        setVille(sc.next());
        System.out.println("  Province :");
        setProvince(sc.next());
        System.out.println("  Pays :");
        setPays(sc.next());
    }
}
