package NesneYönelimli.obs.fabrika;

public class maasHesabi {
    public static void main(String[] args) {
        double toplam;
        employee em= new employee("yasir", 2000.0, 50, 2005);
        toplam=em.maas+em.calismaSene()+em.vergi()+em.bonus();
        System.out.println("ismi:   "+em.isim);
        System.out.println("maas:   "+em.maas);
        System.out.println("baslama yili:   "+em.basyili);
        System.out.println("ismi:   "+em.isim);
        System.out.println("calisma saati:  "+em.csaat);
        System.out.println("vergi:  "+em.vergi());
        System.out.println("bonus:  "+em.bonus());
        System.out.println("kidem primi:    "+em.calismaSene());
        System.out.println("brut maas:  "+toplam);
        System.out.println("net maas:  "+(toplam-(em.vergi())));


        

    }
    


}
