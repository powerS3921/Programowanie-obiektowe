import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        studenci();
//        program();
//        parzyste();
//        random();
        palindrom();
    }
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
    public static String getString(){
        return new Scanner(System.in).nextLine();
    }
//    public static void studenci(){
//        System.out.println("Podaj z ilu studentów składa sie grupa");
//        int n = getInt();
//        int tab[] = new int[n];
//        int i = 0;
//        double suma=tab[0];
//        System.out.println("Podaj ile punktów uzyskał każdy ze studentów: ");
//        while(i<n){
//            tab[i] = getInt();
//            suma = suma + tab[i];
//            i++;
//        }
//        System.out.println("Średnia liczba punktów wynosi: "+(suma/n));
//    }
//    public static void program(){
//        int tab[] = new int[10];
//        int licznikU = 0, licznikD=0, sumaU = tab[0], sumaD = tab[0];
//        System.out.println("Podaj 10 liczb: ");
//        for(int i = 0; i<10; i++){
//            tab[i] = getInt();
//            if(tab[i]<0){
//                licznikU++;
//                sumaU = sumaU + tab[i];
//            }
//            else{
//                licznikD++;
//                sumaD = sumaD +tab[i];
//            }
//        }
//        System.out.println("Ilośc liczb ujemnych wynosi: "+licznikU);
//        System.out.println("Ilośc liczb dodatnich wynosi: "+licznikD);
//        System.out.println("Suma liczb ujemnych wynosi: "+sumaU);
//        System.out.println("Suma liczb dodatnich wynosi: "+sumaD);
//    }
//    public static void parzyste(){
//        System.out.println("Podaj z ilu liczb ma sie składać tablica: ");
//        int n = getInt();
//        int tab[] = new int[n];
//        int suma = 0;
//        for(int i = 0; i<n; i++){
//            tab[i] = getInt();
//            if(tab[i]%2==0){
//                suma = suma + tab[i];
//            }
//        }
//        System.out.println("Suma parzystych liczb w ciągu wynosi: "+suma);
//
//    }

//        public static void random(){
//        System.out.println("Podaj z ilu liczb ma sie składać tablica: ");
//        int n = getInt();
//        int tab[] = new int[n];
//        Random rand = new Random();
//        int suma = 0;
//        for(int i = 0; i<n; i++){
//            tab[i] = rand.nextInt(56)-10;
//            if(tab[i]%2==0){
//                suma = suma + tab[i];
//            }
//        }
//        System.out.println("Suma parzystych liczb w ciągu wynosi: "+suma);
//
//    }
        public static void palindrom(){
            System.out.println("Podaj słowo, a dowiesz sie czy jest ono palindromem: ");
            String slowo = getString();
            int sprawdz = 0;
            int dlugosc = slowo.length();
            for(int i = 0; i<dlugosc/2; i++){
                if(slowo.charAt(i) != slowo.charAt(dlugosc-1-i)){
                    sprawdz = 1;
                    break;
                }
            }
            if(sprawdz == 1){
                System.out.println("Słowo nie jest palindromem");
            }
            else{
                System.out.println("Słowo jest palindromem");
            }
        }
}