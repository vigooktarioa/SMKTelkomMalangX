package sk;
import java.util.Scanner;

public class Test {
    private static Scanner scan = new Scanner(System.in);
    public static void balokTestDrive()
    {
        int p,l,t;
        Balok B = new Balok();
        System.out.println("Bangun Balok");
        System.out.println("Masukkan panjang balok :");
        p = scan.nextInt();
        System.out.println("Masukkan lebar balok :");
        l = scan.nextInt();
        System.out.println("Masukkan tinggi balok :");
        t = scan.nextInt();
        B.setPanjang(p);
        B.setLebar(l);
        B.setTinggi(t);
        B.setVolume();
        B.setLuasPermukaan();
        System.out.println("Panjang balok = "+ B.getPanjang());
        System.out.println("Lebar balok = "+ B.getLebar());
        System.out.println("Tinggi balok = "+ B.getTinggi());
        System.out.println("Volume balok = "+ B.getVolume());
        System.out.println("Luas permukaan balok = "+ B.getLuasPermukaan());
    }
        public static void tabungTestDrive()
        {
            Tabung T = new Tabung();
            int jarijari, t;
            System.out.println("Bangun Tabung");
            System.out.println("Masukkan panjang jari-jari = ");
            jarijari = scan.nextInt();
            System.out.println("Masukkan tinggi = ");
            t = scan.nextInt();
            T.setJariJari(jarijari);
            T.setTinggi(t);
            T.setVolume();
            T.setLuasPermukaan();
            System.out.println("Jari-jari tabung = "+ T.getJariJari());
            System.out.println("Tinggi tabung = "+T.getTinggi());
            System.out.println("Luas permukaan tabung = "+ T.df.format(T.getLuasPermukaan()));         
        }
        
        public static void kubusTestDrive()
        {
            Kubus K = new Kubus();
            int sisi;
            System.out.println("Bangun kubus");
            System.out.println("Masukkan panjang sisi = ");
            sisi = scan.nextInt();
            K.setSisi(sisi);
            K.setVolume();
            K.setLuasPermukaan();
            System.out.println("Panjang sisi kubus = "+ K.getSisi());
            System.out.println("Volume kubus = "+ K.getVolume());
            System.out.println("Luas permukaan kubus = "+ K.getLuasPermukaan());
        
    }
    
}

