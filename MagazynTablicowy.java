package Lista11;

public class MagazynTablicowy {
    public static Kontener[] kontenery = new Kontener[5];

    public static void przyjmijKontener(Kontener kontener){
        int licznik = 0;
        while(licznik < kontenery.length){
            if(kontenery[kontenery.length-1-licznik] == null){
                kontenery[kontenery.length-1-licznik] = kontener;
                System.out.println("Kontener dodany");
                break;
            }
            else {
                licznik++;
            }
        }
        if(licznik >= kontenery.length){
            wydajKontener();
            przyjmijKontener(kontener);
        }
    }

    public static void wydajKontener(){
        int licznik = 0;
        while(licznik < kontenery.length){
            if(kontenery[licznik] != null){licznik++;}
        }
        kontenery[licznik-1] = null;
    }

}
