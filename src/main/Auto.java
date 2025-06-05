
package main;


public class Auto {

  private String Redszam;
  private String Datum;
  private String Fiz_mod;
  private double Tav;
  private int Osszeg;
  private int Borravalo;
  private boolean Dohanyzo;
    public Auto(String Rendszam, String Datum, String Fiz_mod, int Tav, int Osszeg, int Borravalo, boolean Dohanyzo){
    this.Redszam = Rendszam;
    this.Datum = Datum;
    this.Fiz_mod = Fiz_mod;
    this.Tav = Tav;
    this.Osszeg = Osszeg;
    this.Borravalo = Borravalo;
    this.Dohanyzo = Dohanyzo;
            
}
    public Auto(String sor){
        String[] adatok = sor.split(";");
        this.Redszam = adatok[0];
        this.Datum = adatok[1];
        this.Fiz_mod = adatok[2];
        this.Tav = Double.parseDouble(adatok[3]);
        this.Osszeg =  Integer.parseInt(adatok[4]);
        this.Borravalo =  Integer.parseInt(adatok[5]);
        this.Dohanyzo = adatok[6].equals("igen");
        
    }
    
    public String getRednszam(){
        return Redszam;
    }
    
    public String getDatum(){
        return Datum;
    }
    
    public String getFiz_Mod(){
        return Fiz_mod;
    }
    
    public double getTav(){
        return Tav;
    }
    
    public int getOsszeg(){
        return Osszeg;
    }
    
    public int getBorravalo(){
        return Borravalo;
    }
    
    public boolean getDohanyzo(){
        return Dohanyzo;
    }
    
    @Override
    public String toString() 
    {
        return "AutoModell{" + "Rendszám=" + Redszam + ", Dátum=" + Datum + ", Fizetési Mód=" + Fiz_mod + ", Táv=" + Tav + ", Összeg=" + Osszeg + ", Borravaló=" + Borravalo + ", Dohányzó=" + Dohanyzo + '}';
    }
}
