public class Gatunek {
    String nazwa_rodz, nazwa_gat, opis;
    int chrom2n, x;

    public String pelna_nazwa(){
        return nazwa_rodz + " "+ nazwa_gat;
    }

    public int haploidalnaLiczba(){
        return chrom2n/2;
    }

    @Override
    public String toString() {
        return "Gatunek{" +
                "nazwa_rodz='" + nazwa_rodz + '\'' +
                ", nazwa_gat='" + nazwa_gat + '\'' +
                ", opis='" + opis + '\'' +
                ", chrom2n=" + chrom2n +
                ", x=" + x +
                '}';
    }

    public Gatunek klon(){
        Gatunek klonuj = new Gatunek();
        klonuj.nazwa_rodz = nazwa_rodz;
        klonuj.nazwa_gat = nazwa_gat;
        klonuj.chrom2n = chrom2n;
        klonuj.x = x;
        klonuj.opis = opis;
        return klonuj;
    }
}
