import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        double A=2.14,E=3.67,D=1.11,M=0.95,P=5;
        double Af,Ef,Df,Mf,Pf,Toplam;

        System.out.print("Armut Kaç Kilo: ");
        Af= inp.nextDouble();
        System.out.print("Elma Kaç Kilo: ");
        Ef= inp.nextDouble();
        System.out.print("Domates Kaç Kilo: ");
        Df= inp.nextDouble();
        System.out.print("Muz Kaç Kilo: ");
        Mf= inp.nextDouble();
        System.out.print("Patlıcan Kaç Kilo: ");
        Pf= inp.nextDouble();

        Toplam=((A*Af)+(E*Ef)+(D*Df)+(M*Mf)+(P*Pf));
        System.out.print("Toplam Fiyat: "+Toplam+ "Tl");

    }
}
