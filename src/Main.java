import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//

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
            int  j;
            int sodu;

            for(j=0;j<=n;j++)
            {int tong = 0;
                sochuso = 0;
                int j1=j;
                int j2=j1;
                do {
                    j1 = j1 / 10;
                    sochuso++;
                } while (j1 >= 1);


                for (int i = 1; i <= sochuso; i++) {
                    sodu = j2 % 10;
                    j2 = j2 / 10;
                    tong = tong + tinhluythua(sodu, sochuso);
                }
//                System.out.printf("%d %d %d\n",sochuso,j,tong);
                if (tong == j)
                    System.out.printf("%d ", j);

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
