
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String choice = "1";
//
        while (choice.equals("1")) {
            System.out.println("Nhập vào số N");
            int n;

            Scanner sc = new Scanner(System.in);
            n = Integer.parseInt(sc.nextLine());

            while (n < 0) {
                System.out.println("Số nhập vào không hợp lệ!\n");
                System.out.println("Nhập lại N: ");
                n = Integer.parseInt(sc.nextLine());

            }

            int sochuso = 0;
            int n1 = n, n2 = n;
            do {
                n = n / 10;
                sochuso++;
            } while (n >= 1);

            int sodu;
            int tong = 0;
            for (int i = 1; i <= sochuso; i++) {
                sodu = n1 % 10;
                n1 = n1 / 10;
                tong = tong + tinhluythua(sodu, sochuso);
            }
            if (tong == n2)
                System.out.printf("Số %d là số amstrong", n2);
            else
                System.out.printf("Số %d không là số amstrong\n", n2);
            System.out.println("\nBạn có muốn nhập lại không? ");
            System.out.println("nếu có ấn phím 1, nếu không ấn bất kì để thoát! ");
            choice = sc.nextLine();
        }
    }

    public static int tinhluythua(int so,int luythua)
    {

        int tich=1;
        for(int i=1;i<=luythua;i++){
            tich = tich*so;
        }
        return tich;
    }
}
