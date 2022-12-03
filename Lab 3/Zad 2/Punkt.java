public class Punkt {
    public double x,y;

    public Punkt() {
        this.x = x;
        this.y=y;
    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void zeruj(){
        this.x=0;
        this.y=0;
    }

    public void Opisz() {
        System.out.println("Punkt{" +
                "x=" + x +
                ", y=" + y +
                '}');
    }

    public void przesun(double x, double y){
        this.x+=x;
        this.y+=y;
    }
}
