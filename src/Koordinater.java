/* 
Lavet af Mikkel Sørensen Datamatiker Uddanelsen 1. Semester EASJ Næstved 
*/


public class Koordinater {
    double x;
    double y;

    public Koordinater(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Sætter 0,0
    public Koordinater(){
        this(0,0);
    }

    public double x(){
        return x;
    }

    // Her kan jeg sætte X.
    public void setX(double x) {
        this.x = x;
    }

    public double y(){
        return y;
    }
    // Her kan jeg sætte Y
    public void setY(double y) {
        this.y = y;
    }
    // For at udregne distance (og bruge en formel til det) har jeg læst lidt på udregningen på
    // https://www.mathsisfun.com/algebra/distance-2-points.html

    // Her udregnes afstanden mellem de to angivne koordinater.
    public double afstand(double x, double y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    // Her angives afstanden
    public double afstand (Koordinater koordinat){
        return afstand(koordinat.x, koordinat.y);
    }




}
