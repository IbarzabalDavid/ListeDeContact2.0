import java.util.Scanner;

/**
 * Created by ibada1731710 on 2018-02-26.
 */
public class Telephone {

    private String type;
    private String num;
    private Scanner sc=new Scanner(System.in);

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void ajoutelTel(){
        System.out.println("À quoi correspond le numéro de téléphone? (cellulaire, maison, travail, ...)");
        setType(sc.next());
        System.out.println("Quel est le numéro? ");
        setNum(sc.next());
    }
}
