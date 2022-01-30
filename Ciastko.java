package Lista11;

public class Ciastko {
    String smak;
    double waga;

    public Ciastko(String smak, double waga){
        this.smak = smak;
        this.waga = waga;
    }

    public void show(){
        System.out.println(this.smak + " " + this.waga);
    }


}
