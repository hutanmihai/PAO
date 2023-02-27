package src.main.java.lab1;

public class Exemplu3 {

    /*
    byte
    short
    int
    long
    char
    boolean
    float
    double
     */

    byte a;
    short b;
    int c;
    long d;
    char e;
    boolean f;
    float g;
    double h;

    public static void main(String[] args) {
        Exemplu3 obiect3 = new Exemplu3();
        System.out.println(obiect3.a);
        System.out.println(obiect3.b);
        System.out.println(obiect3.c);
        System.out.println(obiect3.d);
        System.out.println(obiect3.e);
        System.out.println(obiect3.f);
        System.out.println(obiect3.g);
        System.out.println(obiect3.h);

        System.out.println("\n--------\n");

        System.out.println("byte: " + Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " " + Long.MAX_VALUE);
        System.out.println("char: " + Character.MIN_VALUE + " " + Character.MAX_VALUE);
        System.out.println("boolean: " + Boolean.FALSE + " " + Boolean.TRUE);
        System.out.println("float: " + Float.MIN_VALUE + " " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MIN_VALUE + " " + Double.MAX_VALUE);
    }
}
