package src.main.java.lab1;

public class Exemplu2 {
    public static void main(String[] args) {
        Exemplu1.main(null);
        Exemplu1 obiect1 = new Exemplu1();
        Exemplu1 obiect2 = new Exemplu1();
        obiect1.setNumarLaborator(1);
        System.out.println(obiect1.getNumarLaborator());
    }
}
