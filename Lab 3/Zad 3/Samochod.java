import java.util.Scanner;

public class Samochod {
    String marka, model, nadwozie, kolor;
    int rok;
    long przebieg;


    public void wypelnianie(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj marke: ");
        marka = scan.nextLine();
        System.out.println("Podaj model: ");
        model = scan.nextLine();
        System.out.println("Podaj nadwozie: ");
        nadwozie = scan.nextLine();
        System.out.println("Podaj kolor: ");
        kolor = scan.nextLine();
        System.out.println("Podaj rok (wiekszy od 0): ");
        rok = scan.nextInt();
        System.out.println("Podaj przebieg (większy od 0): ");
        przebieg = scan.nextLong();
    }

    public Samochod() {
    }

    public void Opisz() {
        System.out.println("Samochod{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", nadwozie='" + nadwozie + '\'' +
                ", kolor='" + kolor + '\'' +
                ", rok=" + rok +
                ", przebieg=" + przebieg +
                '}');
    }
}
