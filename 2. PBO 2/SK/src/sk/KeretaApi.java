package sk;
public class KeretaApi {
private int penumpang;
private double maxPenumpang;
private double penumpangBaru;
private double counter;
private double hargaTiket;
private char namaPenumpang;
private double pembayaran;
private double totalPembayaran;

public KeretaApi(double maxPenumpang){
    this.maxPenumpang = maxPenumpang;
    penumpang = 0;
}

public void addPenumpang(int penumpang){
    double sem;
    sem = this.penumpang + penumpang;
    if(sem > maxPenumpang){
        System.out.println("Penumpang melebihi kuota");
    }
    else{
        this.penumpang=(int) sem;
        counter++;
    }
}
public String getPenumpang(int penumpang){
    return "Note! bla" + "total penumpang sekarang = "+this.penumpang;
}
public void addPenumpangBaru(double penumpangBaru){
    if ((penumpangBaru+penumpang)>maxPenumpang){
        System.out.println("Kuota Penuh!");
    }
    else{
        penumpang += penumpangBaru;
        this.penumpangBaru = penumpangBaru;
    }
}

public String getPenumpangBaru(){
    return penumpangBaru + "Ikut kedalam kelompok penumpang"
            + " berinisial " + namaPenumpang;
}
public void addNamaPenumpang(char namaPenumpang){
    this.namaPenumpang = namaPenumpang;
}
public void addHargaTiket(double hargaTiket){
    this.hargaTiket = hargaTiket;
}
public double getHargaTiket(){
    return hargaTiket;
}
public void addPembayaran(double pembayaran){
    this.pembayaran =pembayaran;
}
public double getTotalPembayaran(){
    totalPembayaran = pembayaran * hargaTiket;
    return totalPembayaran;
}
public double getAverage(){
    return penumpang / counter;
}
public void cetakPenumpang(){
    System.out.println("Penumpang Kereta = " + penumpang);
    System.out.println("Jumlah Maksimum Penumpang = "+ maxPenumpang);
}
public void cetak(){
    System.out.println("Rata-rata : " + getAverage());
    System.out.println("Mendapat pembayaran = " + getTotalPembayaran()/hargaTiket
    + " dengan pembayar sebanyak " + totalPembayaran/hargaTiket);
    System.out.println("Harga tiket " + getHargaTiket());
}
}
