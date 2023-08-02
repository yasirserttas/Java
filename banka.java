import java.util.Scanner;

public class banka {
    public static void main(String[] args) {
        String kullaniciAdi, sifre;

        Scanner input = new Scanner(System.in);

        
        int bakiye = 1500, secim,hak = 3;
        

        while (hak > 0) {
            System.out.print("Kullanici adi: ");
            kullaniciAdi = input.nextLine();
            System.out.print("sifre: ");
            sifre = input.nextLine();

            if (kullaniciAdi.equals("yasir") && sifre.equals("2003Yasir")) {
                System.out.println("Merhaba, Serttas Bankasina Hosgeldiniz!");
                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para cekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-cikis Yap");
                    System.out.print("Lutfen yapmak istediginiz islemi tuslayin: ");
                    secim = input.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.print("Para miktari: ");

                            int miktar = input.nextInt();
                            bakiye += miktar;
                            break;

                        case 2:
                            System.out.print("Para miktari: ");
                            miktar = input.nextInt();
                            if (miktar > bakiye) {
                                System.out.println("Bakiye yetersiz.");



                            } else {
                                bakiye -= miktar;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + bakiye);
                            break;
                        case 4:
                            System.out.println("Yeniden Bekleriz.");

                            break;
                        default:
                            System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
                            break;
                    }

                } while (secim != 4);
                break;

            } else {

                hak--;
                System.out.println("hatali kullanici adi veya şifre. Tekrar deneyiniz.");
                if (hak == 0) {
                    System.out.println("Hesabiniz bloke olmuştur. Lütfen en yakin subemize gelin.");
                } else {
                    System.out.println("Kalan Hakkiniz: " + hak);
                }
            }
        }
    }
}
