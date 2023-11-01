import java.util.Scanner;
public class Main {

    static void dengele(int n1) {
  int temp = n1;
        while (n1 >= 0) {
            System.out.print(n1 + " " );
            n1 -= 5;
            if (n1 < 0) {
                break;
            }
        }
        n1 = 0;
        while (n1 < temp ) {
            n1 += 5;
            System.out.print(n1  + " ");
        }

    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int n1 = inp.nextInt();
        dengele(n1);




    }
}