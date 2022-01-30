package Lista11;

public class Qman11 {

    public static void main(String[] args){
        FabrykaCiastek.przygotuj("Truskawka", 300);
        FabrykaCiastek.przygotuj("Jagoda", 300);
       // System.out.println(FabrykaCiastek.przygotowaneCiastka[0].smak);
       // System.out.println(FabrykaCiastek.przygotowaneCiastka[1].smak);
        Ciastko ciastko = new Ciastko("Wanilia", 400);
        Ciastko ciastko1 = new Ciastko("Malina", 900);
        Ciastko ciastko2 = new Ciastko("Truskawka", 600);
        Kontener kontener = new Kontener(800, ciastko);
        Kontener kontener1 = new Kontener(400, ciastko);

        kontener.zaladuj(ciastko1);
        kontener.zaladuj(ciastko2);
        kontener1.zaladuj(ciastko2);
        kontener1.zaladuj(ciastko2);
        kontener1.zaladuj(ciastko2);


        MagazynTablicowy.przyjmijKontener(kontener);
        MagazynTablicowy.przyjmijKontener(kontener1);

        MagazynTablicowy.kontenery[4].show();
        MagazynTablicowy.kontenery[3].show();







    }
}
