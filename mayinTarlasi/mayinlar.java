package mayinTarlasi;

import java.util.Random;
import java.util.Scanner;

class MayinTarlasiOyunu {
     int satirSayisi;
     int sutunSayisi;
     int mayinSayisi;
     char[][] oyunTahtasi;
     boolean[][] mayinlar;

    public MayinTarlasiOyunu(int satirSayisi, int sutunSayisi, int mayinSayisi) {
        this.satirSayisi = satirSayisi;
        this.sutunSayisi = sutunSayisi;
        this.mayinSayisi = mayinSayisi;
        this.oyunTahtasi = new char[satirSayisi][sutunSayisi];
        this.mayinlar = new boolean[satirSayisi][sutunSayisi];
        initTahta();
        yerlestirMayinlar();
    }

     void initTahta() {
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                oyunTahtasi[i][j] = '-';
            }
        }
    }

     void yerlestirMayinlar() {
        Random random = new Random();
        int mayinKoyulan = 0;
        
        while (mayinKoyulan < mayinSayisi) {
            int row = random.nextInt(satirSayisi);
            int col = random.nextInt(sutunSayisi);
            
            if (!mayinlar[row][col]) {
                mayinlar[row][col] = true;
                mayinKoyulan++;
            }
        }
    }

     int sayiKomsular(int row, int col) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < satirSayisi && j >= 0 && j < sutunSayisi && mayinlar[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public void oyunTahtasiniGoster(boolean gosterMayinlar) {
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                if (gosterMayinlar && mayinlar[i][j]) {
                    System.out.print("* ");
                } else {
                    System.out.print(oyunTahtasi[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public void oyunuBaslat() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            oyunTahtasiniGoster(false);
            System.out.print("Satır giriniz: ");
            int row = scanner.nextInt();
            System.out.print("Sütun giriniz: ");
            int col = scanner.nextInt();
            
            if (row < 0 || row >= satirSayisi || col < 0 || col >= sutunSayisi) {
                System.out.println("Geçersiz bir hamle yaptınız.");
                continue;
            }
            
            if (mayinlar[row][col]) {
                System.out.println("Mayına bastınız! Oyun bitti.");
                oyunTahtasiniGoster(true);
                break;
            }
            
            int komsuMayinSayisi = sayiKomsular(row, col);
            oyunTahtasi[row][col] = (char) ('0' + komsuMayinSayisi);
        }
    }

    
}
