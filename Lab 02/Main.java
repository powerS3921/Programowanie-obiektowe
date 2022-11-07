import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        suma_srednia();
//        wypisz();
//          wielkielitery();
//        odwrocenie();
//        sortowanie();
//        silnia();
//        porownaj();

    }
//    public static void suma_srednia(){
//        int tab[] =new int[10];
//        for(int i=0; i<tab.length; i++){
//            tab[i] = losowanie();
//        }
//        int suma = 0;
//        double srednia = 0;
////        for (int i =0; i<tab.length; i++){
////            suma = suma + tab[i];
////        }
//        for (int x:tab) {
//            suma = suma + x;
//        }
//
//
//        srednia = suma/tab.length;
//        System.out.println("Suma tablicy: "+suma);
//        System.out.println("Srednia tablicy: "+srednia);
//
//
//    }
//    public static int losowanie(){
//        Random liczba = new Random();
//        int a = liczba.nextInt(50)-5;
//        return a;
//    }

//    public static void wypisz(){
//        int tab[] = new int[]{1,2,3,4,5,6,7,8,9,10};
//        int tab1[] = new int[]{1,2,3,4,5,6,7,8,9};
//        for(int i=0; i<tab.length;i=i+2){
//            System.out.print(tab[i]+" ");
//        }
//        System.out.println();
//        for(int i=0; i<tab1.length;i=i+2){
//            System.out.print(tab1[i]+" ");
//        }
//    }
//        public static void wielkielitery(){
//        String tab[] = new String[]{"ala","ma","kota","a", "kot", "ma","ale"};
//            for (String i:tab) {
//                System.out.print(i.toUpperCase()+" ");
//            }
//        }
//            public static String getString(){
//                return new Scanner(System.in).nextLine();
//            }
//            public static void odwrocenie(){
//                String tab[] = new String[5];
//                System.out.println("Podaj 5 słów: ");
//                for(int i=0; i<5; i++){
//                    System.out.println("Podaj "+(i+1)+" słowo: ");
//                    tab[i] = getString();
//                }
//                for(int i = tab.length-1; i>=0; i--){
//                    for(int j=tab[i].length()-1; j>=0;j--){
//                        System.out.print(tab[i].charAt(j));
//                    }
//                }
//            }
//            public static int getInt(){
//                return new Scanner(System.in).nextInt();
//            }
//            public static void sortowanie(){
//                System.out.println("Podaj 8 cyfr: ");
//                int tab[] = new int[8];
//                for(int i=0; i<tab.length;i++){
//                    tab[i] = getInt();
//                }
//                int pom, j;
//                for(int i = 1; i<tab.length; i++){
//                    pom = tab[i];
//                    j=i-1;
//                    while(j>=0 && tab[j]>pom){
//                        tab[j+1]=tab[j];
//                        --j;
//                    }
//                    tab[j+1]=pom;
//                }
//                System.out.println("Liczby po posortowaniu: ");
//                for (int i = 0; i<tab.length; i++){
//                    System.out.print(tab[i]+" ");
//                }
//        }
//            public static void silnia(){
//                System.out.println("Podaj 5 cyfr: ");
//                int tab[] = new int[5];
//                int silnia = 1, j=0;
//                for(int i = 0; i< tab.length;i++){
//                    tab[i] = getInt();
//                }
//                for(int i = 0; i<tab.length;i++){
//                    while(j<tab[i]){
//                        silnia = silnia * (j+1);
//                        j++;
//                    }
//                    System.out.println(silnia);
//                }
//            }


//            public static void porownaj(){
//                String tab[] = new String[]{"ala", "ma", "kota"};
//                String tab1[] = new String[]{"ala", "ma", "kota", "i","psa"};
//                boolean sprawdz=false;
//                if(tab.length == tab1.length){
//                    for(int i = 0; i<tab.length; i++){
//                       if((tab[i].equals(tab1[i]))){
//                           System.out.println("Tablice sa takie same");
//                           break;
//                       }
//                       else{
//                           System.out.println("Tablice nie są takie same");
//                           break;
//                       }
//                    }
//                    System.out.println("Tablice są takie same");
//                }
//                else{
//                    System.out.println("Tablice nie są takie same");
//                }
//
//            }


}