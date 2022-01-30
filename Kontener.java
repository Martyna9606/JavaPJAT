package Lista11;


public class Kontener {
    Ciastko ladunek;
    Kontener next;
    double masaLadunku;
  //  int dniPrzydatnosci;


    public Kontener(double masaLadunku, Ciastko ciastko){
        this.masaLadunku += masaLadunku;
        this.ladunek = ciastko;
        next = null;

    }
    public void zaladuj(Ciastko ciastko ){
        Kontener nowyKontener = new Kontener(this.masaLadunku, ciastko);

        Kontener pozycja = this;
        while(pozycja.next != null){
            pozycja = pozycja.next;
        }

        pozycja.next = nowyKontener;

    }

    public void show(){
        Kontener pozycja = this;
        while(pozycja.next!= null){
            pozycja.ladunek.show();
            pozycja = pozycja.next;
        }
        pozycja.ladunek.show();
    }
}
