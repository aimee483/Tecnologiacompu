
public class Computadora extends tecnologia {
    
    private String procesador;
    private int RAM;
    
    public Computadora(){}
    
    public Computadora(String procesador, int RAM, String noSerie, String anio, String modelo){
    super (noSerie, anio, modelo);
    this.procesador=procesador;
    this.RAM=RAM;
    }
    
    public String getProcesador() {
   return this.procesador;
   }
   public void setProcesador(String procesador){
   this.procesador=procesador;
   }
   
   public int getRAM() {
   return this.RAM;
   }
   public void setRAM(int  RAM){
   this.RAM=RAM;
   }
    
}
