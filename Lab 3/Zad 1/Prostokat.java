public class Prostokat {

    double szer=2.5, wys=4.5;

    public Prostokat(double szer, double wys) {
        this.szer = szer;
        this.wys = wys;
    }
    public double Pole(){
        return wys*szer;
    }
    public double Obwod(){
        return 2*wys+2*szer;
    }
    public double Przekatna(){
        return Math.sqrt(Math.pow(wys,2)+(Math.pow(szer,2)));
    }
    public void Opis(){
        System.out.println("Prostokąt o boku a: "+wys+" i boku b: "+szer);
        System.out.println("Pole prostokata: "+ Pole());
        System.out.println("Obwód prostokata: "+ Obwod());
        System.out.println("Przekątna prostokata: "+ Przekatna());
    }
}
