public class Afstand {
    public static void main(String[] args) {
        // Her angives koordinaterne, som skal bruges til udregningen.
        //En blank "Koordinater" giver så 0.0
        Koordinater k1 = new Koordinater();
        Koordinater k2 = new Koordinater(10,30.5);

        // Her udskrives den egentlige afstand, udregnet i klassen. 
        System.out.println(k1.afstand(k2));

    }
}
