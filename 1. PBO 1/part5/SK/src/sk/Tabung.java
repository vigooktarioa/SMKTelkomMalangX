package sk;
import java.text.DecimalFormat;
public class Tabung {
    DecimalFormat df = new DecimalFormat("#.##");
    private int tinggi, jarijari;
    private double volume, luasPermukaan;
    public void setTinggi(int t){
        tinggi = t;
    }
    public void setJariJari(int r){
        jarijari = r;
    }
    public void setVolume(){
        volume = Math.PI*jarijari*(jarijari+tinggi);
    }
    public void setLuasPermukaan(){
        luasPermukaan = 2*Math.PI*jarijari*(jarijari+tinggi);
    }
    public int getJariJari(){
        return jarijari;
    }
    public int getTinggi(){
        return tinggi;
    }
    public double getLuasPermukaan(){
        return luasPermukaan;
    }
}
