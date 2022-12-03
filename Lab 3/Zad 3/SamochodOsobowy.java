import java.util.Scanner;

public class SamochodOsobowy extends Samochod{
    double waga, pojemnosc;
    int iloscOsob;

    public void wypelnianie(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wagę (od 2t do 4,5t): ");
        waga = scan.nextDouble();
        System.out.println("Podaj pojemność (od 0,8 do 3,0): ");
        pojemnosc = scan.nextDouble();
        System.out.println("Podaj liczbe osob: ");
        iloscOsob = scan.nextInt();
    }


    public void Opisz(){
        super.Opisz();
        System.out.println("SamochodOsobowy{" +
                "waga=" + waga +
                ", pojemnosc=" + pojemnosc +
                ", iloscOsob=" + iloscOsob +
                '}');
    }

}
