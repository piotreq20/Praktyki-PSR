package Ćwiczenia6;

public class main {
    public static void main(String[] args) {

        //Math.random() losuje wartość od 0 do 1,0
        //mamy więc 50% szansy że wylosowany zostanie orzeł lub reszka
        if (Math.random() < 0.5) System.out.println("Orzeł");
        else                     System.out.println("Reszka");
    }
}