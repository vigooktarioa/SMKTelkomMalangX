package sk;
public class Test {
    
    public static void main(String[] abc) {
        KeretaApi keretaA = new KeretaApi(35);
        
        keretaA.addNamaPenumpang('2');
        keretaA.addHargaTiket(40000);
        keretaA.cetakPenumpang();
        
        keretaA.addPenumpang(25);
        keretaA.cetakPenumpang();
        
        keretaA.addPenumpang(5);
        keretaA.cetakPenumpang();
        
        keretaA.addPenumpangBaru(5);
        keretaA.cetakPenumpang();
        keretaA.getPenumpangBaru();
                
        keretaA.addPembayaran(35);
        keretaA.cetak();
    }
    
}
