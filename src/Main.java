import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz");
        String password = scanner.next();
        double balance = 4000;
        int process = 0;
        if (password.equals("1234")) {
            while (process == 0) {
                System.out.println("Hoş geldiniz. Bakiyeniz : " + balance);
                System.out.println("Yapmak istenilen işlem, \n1.para çekme  \n2.Para yatırma.");
                int operation = scanner.nextInt();
                switch (operation) {
                    case 1:
                        System.out.println("Ne kadar para çekmek istiyorsunuz?");
                        double withdraw = scanner.nextDouble();
                        if (withdraw > balance) {
                            System.out.println("Hesabınızda yeterli miktarda para yok.");
                        } else {
                            balance -= withdraw;
                            System.out.println("İşlem tamamlandı. Toplam bakiye : " + balance);
                        }
                        break;
                    case 2:
                        System.out.println("Ne kadar para yatırmak istiyorsunuz?");
                        double deposit = scanner.nextDouble();
                        balance += deposit;
                        System.out.println("İşlem tamamlandı. Toplam bakiye : " + balance);
                        break;
                    default:
                        System.out.println("Yanlış bir seçim yaptınız");
                }
                System.out.println("Başka işlem Yapmak istiyor musunuz? Başka bir işlem yapmak için 0'a basabilirsiniz.");
                process = scanner.nextInt();
            }
            System.out.println("İyi günler");
        } else {
            System.out.println("Şifreyi yanlış girdiniz");
        }


    }
}
