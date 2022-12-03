
class Prostokat extends Punkt  {

    double wys = x, szer = y;

    public Prostokat() {

    }

    Prostokat(double wys, double szer){
        this.wys= wys;
        this.szer = szer;

    }

    double getPowierzchnia() {
        return (wys* szer);
    }

    public void przesun (double x, double y)
    {
        this.x+=x;
        this.y+=y;
    }


}