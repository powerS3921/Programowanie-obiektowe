public class Okrag {
    Punkt srodek;
    double promien;
    public double getPowierzchnia(){
        return Math.PI * Math.pow(promien,2);
    }
    public double getSrednica(){
        return 2*promien;
    }

    public void setPromien(double r){
        this.promien = r;
    }

    public double getPromien() {
        return promien;
    }

    public void wSrodku(Punkt punkt){
        if((Math.pow(srodek.x - punkt.x,2)+Math.pow(srodek.y-punkt.y,2))<=Math.pow(promien,2)){
            System.out.println("Punkt lezy w srodku okregu");
        }
        else{
            System.out.println("Punkt lezy poza okręgiem");
        }
    }

    public Okrag() {
        this.srodek.x = 0;
        this.srodek.y = 0;
        this.promien = 0;
    }

    public Okrag(Punkt srodek, double promien) {
        this.srodek.x = srodek.x;
        this.srodek.y = srodek.y;
        this.promien = promien;
    }
}
