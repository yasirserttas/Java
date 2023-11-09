import java.util.Scanner;


public class game {

    private Scanner input = new Scanner(System.in);

    

    public void start(){



        System.out.println("Macera oyununa hoşgeldiniz!!");
        System.out.print("lütfen isminizi giriniz: ");
        String playerName= input.nextLine();
        player player = new player(playerName);

        System.out.println("Sayın "+player.getName()+" bu karanlık ve sisli ortama Hoşgeldiniz!!");
        System.out.println("Bura Hakkında duyduklarının hepsi gerçek...");
        System.out.println("Lütfen bir karakter seçin.");
        player.selectChar();
        Location location = null;

        while(true){
        
            
        System.out.println("----------------------------------------------------");
        System.out.println("#########Bölgeler#########");
        System.out.println("1- Güvenli ev -->burası sizin için güvenli bir ev");
        System.out.println("2- Mağaza --> buradan silah ve zırh alabilirsiniz");
        System.out.println("3- Mağara --> Burada zombiler olabilir dikkat et!");
        System.out.println("4- Orman --> Burada vampirler olabilir dikkatli ol!");
        System.out.println("5- Nehir --> Burada ayı olabilir dikkatli ol!");
        System.out.println("6- Maden --> Burada yılanlar olabilir dikkatli ol!");
        System.out.println("0- Oyunu sonlandır");
        System.out.println("Lütfen gitmek istediğiniz bölgeyi seçiniz: ");
        System.out.println("----------------------------------------------------");
        int selectLoc = input.nextInt();

        switch (selectLoc) {
            case 0: 
            location=null;
                break;
            case 1:
            if(player.getInventory().getFood().isAward() && player.getInventory().getFirewood().isAward() && player.getInventory().getWater().isAward()){
                System.out.println("Tüm Ödülleri kazandınız ");
                System.out.println("bu sisli ve karanlık adaya aydınlığı  getirdin!");
                System.out.println("Sana minnettarız!");
                
                break;
            }

            location = new SafeHouse(player);
                break;
            case 2: 
            location = new ToolsStore(player);
                break;
            case 3:
            
            location = new cave(player);
            break;
            case 4:
            location = new forest(player);
            break;
            case 5:
            location = new river(player);
            break;
            case 6:
            location = new mine(player);
            break;
            default:
            location = new SafeHouse(player);
                break;
        }

        if(location== null){
            System.out.println("bu karanlık ve sisli adadan çabuk vazgeçtin");
            break;
        }

        if(!location.onLocation())
        {
            System.out.println("GAME OVER");
            break;

        }
        

        }
        if (location != null && location.onLocation()) {
    System.out.println("Tebrikler! Oyunu kazandınız!");
        }
        





    }
    
}
