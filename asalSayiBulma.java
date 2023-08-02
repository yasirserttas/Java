public class asalSayiBulma {
    public static void main(String[] args) {
        System.out.println("1 ile 100 arasindaki asal sayilar:");

        int altSinir = 2;
        int ustSinir = 100;
        int sayi,i;

        for ( sayi = altSinir; sayi <= ustSinir; sayi++) {
            boolean asalMi = true;

            for ( i = 2; i <= sayi / 2; i++) {
                if (sayi % i == 0) {
                    asalMi = false;
                    break;
                }
            }

            if (asalMi) {
                System.out.print(sayi + " ");
            }
        }
    }
}
