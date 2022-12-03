public class Main {
    public static void main(String[] args) {
        Punkt p1 = new Punkt (1, 2);
        p1.Opisz();
        p1.przesun(3, 4);
        p1.Opisz();
        p1.setX(10);
        p1.setY(15);
        p1.Opisz();
        Figura f1 = new Figura();
        Trojkat t1 = new Trojkat(15,15);
        Prostokat pr1 = new Prostokat(p1.x, p1.y);
//        System.out.println(f1.opis());
        System.out.println(pr1.getPowierzchnia());
        pr1.przesun(3,5);
        System.out.println(pr1.x +", "+pr1.y);
        Kwadrat k1 = new Kwadrat();
        k1.setWys(pr1.wys);
        k1.Opisz();

    }
}