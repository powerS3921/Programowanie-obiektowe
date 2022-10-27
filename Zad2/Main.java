import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//          rownanie();
//          funkcje();
//          porzadkowanie(10,9,8);
//          czyPada();
//          premia();
        kalkulator();
    }
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
    public static String getString(){
        return new Scanner(System.in).nextLine();
    }
//    public static void rownanie(){
//        System.out.println("Podaj 3 liczby do równania kwadratowego: ");
//        int a=getInt();
//        int b=getInt();
//        int c=getInt();
//        System.out.println("Liczby delte: ");
//        System.out.println("b^2-4*a*c = "+((b*b)-(4*a*c)));
//        int delta = (b*b)-(4*a*c);
//        if(delta > 0){
//            System.out.println("Będziemy mieli dwa rozwiązania: ");
//            System.out.println("x1 = "+((-b-Math.sqrt(delta))/(2*a)));
//            System.out.println("x2 = "+((-b+Math.sqrt(delta))/(2*a)));
//        }
//        else if(delta==0){
//            System.out.println("Będziemy mieli jedno rozwiązanie: ");
//            System.out.println("x0 = "+((-b)/(2*a)));
//        }
//        else{
//            System.out.println("Brak rozwiązań tego równania");
//        }
//    }
//    public static void funkcje(){
//        System.out.println("Podaj x: ");
//        int x = getInt();
//        System.out.println("Liczymy a(x): ");
//        if(x>0){
//            System.out.println("x = "+(2*x));
//        }
//        else if(x==0){
//            System.out.println("x = 0");
//        }
//        else{
//            System.out.println("x = "+(-3*x));
//        }
//        System.out.println("Liczymy b(x): ");
//        if(x>=1){
//            System.out.println("x = "+(x*x));
//        }
//        else {
//            System.out.println("x = "+x);
//        }
//        System.out.println("Liczymy c(x): ");
//        if(x>2){
//            System.out.println("x = "+(2+x));
//        }
//        else if(x==2){
//            System.out.println("x = 8");
//        }
//        else{
//            System.out.println("x = "+(x-4));
//        }
//    }
//    public static void porzadkowanie(int a, int b, int c){
//        if(a>b&&a>c&&b>c){
//            System.out.println(c+", "+b+", "+a);
//        }
//        else if(a>b&&a>c&&c>b){
//            System.out.println(b+", "+c+", "+a);
//        }
//        else if(b>a&&b>c&&a>c){
//            System.out.println(c+", "+a+", "+b);
//        }
//        else if(b>a&&b>c&&c>a){
//            System.out.println(a+", "+c+", "+b);
//        }
//        else if(c>a&&c>b&&a>b){
//            System.out.println(b+", "+a+", "+c);
//        }
//        else{
//            System.out.println(a+", "+b+", "+c);
//        }
//    }
//    public static void czyPada(){
//        System.out.println("W zależności od tego czy pada napisz tak lub nie: ");
//        String deszcz = getString();
//        System.out.println("W zależności od tego czy jest autobus napisz tak lub nie: ");
//        String autobus = getString();
//        if(!(deszcz.equals("nie"))  && !(autobus.equals("nie"))){
//            System.out.println("Weź parasol, dostaniesz sie na uczelnie");
//        }
//        else if(!(deszcz.equals("nie")) && !(autobus.equals("tak"))){
//            System.out.println("Nie dostaniesz sie na uczelnie");
//        }
//        else if (!(deszcz.equals("tak")) && !(autobus.equals("nie"))){
//            System.out.println("Dostaniesz sie na uczelnie, miłego dnia i pięknej pogody!");
//        }
//    }
//    public static void premia(){
//        System.out.println("W zależności, czy masz zniżke na samochód napisz tak lub nie: ");
//        String znizka = getString();
//        System.out.println("W zależności, czy otrzymałeś premię napisz tak lub nie: ");
//        String premia = getString();
//        if(!(znizka.equals("tak")) || !(premia.equals("nie"))){
//            System.out.println("Możesz kupić samochód, zniżki na samochód nie ma!");
//        }
//        else if(!(znizka.equals("tak")) || !(premia.equals("tak"))){
//            System.out.println("Zakup samochodu trzeba odłożyć na później, zniżki na samochód nie ma");
//        }
//        else if(!(znizka.equals("nie")) || !(premia.equals("nie"))){
//            System.out.println("Możesz kupic samochód!");
//        }
//    }

     public static void kalkulator(){
         System.out.println("Wybierz co chcesz zrobic: ");
         System.out.println("1. Dodawanie");
         System.out.println("2. Odejmowanie");
         System.out.println("3. Iloczyn");
         System.out.println("4. Iloraz");
         System.out.println("5. Reszta z dzielenia");
         int a = getInt();
         System.out.println("Podaj dwie liczby, na których chcesz wykonać operacje: ");
         int x = getInt();
         int y = getInt();
             switch(a){
                 case 1:
                     System.out.println("Wynik dodawnia "+x+" + "+y+" to: "+(x+y));
                     break;
                 case 2:
                     System.out.println("Wynik odejmowania "+x+" - "+y+" to: "+(x-y));
                     break;
                 case 3:
                     System.out.println("Wynik mnożenia "+x+" * "+y+" to: "+(x*y));
                     break;
                 case 4:
                     if(y==0){
                         System.out.println("Nie dzielimy przez 0!!!");
                     }
                     else{
                         System.out.println("Wynik dzielenia "+x+" / "+y+" to: "+(x/y));
                         break;
                     }
                 case 5:
                     System.out.println("Reszta z dzielenia "+x+" / "+y+" to: "+(x%y));
                     break;

             }
         }
     }


