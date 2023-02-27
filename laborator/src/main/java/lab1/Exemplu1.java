package src.main.java.lab1;

public class Exemplu1 {

    // single line comment

    /*
    multi line comment
     */

    /**
     * javadoc comment
     * @param args
     */


    // membrii unei clase: campuri si metode

    private int numarLaborator;

    public int getNumarLaborator() {
        return numarLaborator;
    }

    public void setNumarLaborator(int numarLaborator) {
        this.numarLaborator = numarLaborator;
    }

    // public -- cel mai permisiv
    // private -- cel mai restrictiv
    // protected -- vizibil in acelasi pachet si in alt pachet prin mostenire
    // default-package -- accesibil doar din acelasi pachet

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

}
