import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Budynek {
    String nazwa;
    int liczba_pieter;
    //final int rok_obecny = 1999;
    LocalDate rok_budowy;

    public Budynek(String nazwa, int liczba_pieter, LocalDate rok_budowy) {
        this.nazwa = nazwa;
        this.liczba_pieter = liczba_pieter;
        this.rok_budowy = rok_budowy;
    }

    @Override
    public String toString() {
        return "Budynek{" +
                "nazwa='" + nazwa + '\'' +
                ", liczba_pieter=" + liczba_pieter +
                ", rok_budowy=" + rok_budowy +
                '}';
    }

    public long ile_lat(){
        LocalDate today = LocalDate.now();
        long ile_lat = ChronoUnit.YEARS.between(rok_budowy, today);
        return ile_lat;
    }
}
