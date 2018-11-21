
public abstract class  tecnologia {
    
    private String noSerie;
    private String anio;
    private String modelo;
    
    
    public tecnologia(){}
    
    public tecnologia(String noSerie, String anio, String modelo){
    this.noSerie=noSerie;
    this.anio=anio;
    this.modelo=modelo;  
    }
    
    
   public String getNoSerie() {
   return this.noSerie;
   }
   public void setNoSerie(String noSerie){
   this.noSerie=noSerie;
   }
   
   public String getAnio() {
   return this.anio;
   }
   public void setAnio(String anio){
   this.anio=anio;
   }
    
   public String getModelo() {
   return this.modelo;
   }
   public void setModelo(String modelo){
   this.modelo=modelo;
   }
}
