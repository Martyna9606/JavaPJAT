package Lista11;

public class FabrykaCiastek  {
    public static Ciastko[] przygotowaneCiastka = new Ciastko[0];

    public static Ciastko przygotuj(String rodzajCiastka, double waga){
        boolean czyPrzygotowane = false;
        int indeks = 0;
        int licznik=0;
        for (Ciastko val: przygotowaneCiastka){
            if(val.smak == rodzajCiastka){
                czyPrzygotowane = true;
                indeks = licznik;
            }
            licznik++;
        }
        if(!czyPrzygotowane) {
            Ciastko noweCiastko = new Ciastko(rodzajCiastka, waga);
            Ciastko[] przygotowaneNowe = new Ciastko[przygotowaneCiastka.length+1];
            for(int i = 0; i< przygotowaneCiastka.length; i++){ przygotowaneNowe[i] = przygotowaneCiastka[i]; }
            przygotowaneNowe[przygotowaneNowe.length-1] = noweCiastko;
            przygotowaneCiastka = przygotowaneNowe;
            przygotowaneNowe = null;
            return noweCiastko;
        }
        else{
            return przygotowaneCiastka[indeks];
        }

    }

}
