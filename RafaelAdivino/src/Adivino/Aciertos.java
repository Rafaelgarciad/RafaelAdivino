package Adivino;
import java.util.Scanner;

public class Aciertos {

    public static void main(String[] args) {
        int n = 0,cont = 0;
        int x = (int) (Math.random()*50+10);
        
        //System.out.print(x);
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("\nIntroduce un valor entre 10 y 50: ");
            n = sc.nextInt();
            
            if (n < 10) {
                System.out.print("Valor minimo 10");
            } else if (n > 50){
                System.out.print("Valor maximo 50");
            }
            
            if (n > x && n <= 50) {
                System.out.print("Te pasaste Amigo");
            } else if (n < x && n >= 10){
                System.out.print("Casi cerca ...");
            }
            
            cont++;
        } while (n != x);
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
        sc.close();
    }
}
