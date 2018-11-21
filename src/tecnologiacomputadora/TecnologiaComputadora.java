
package tecnologiacomputadora;
import java.util.*;


public class TecnologiaComputadora {
    
private static Scanner scanint = new Scanner(System.in);
private static Scanner scanline = new Scanner(System.in);  


   public static void main(String[] args)
   {
     menu();
   }

    private static void menu() 
    {
        boolean bandera = true;
        //ServiciosCompu servicios = new ServiciosCompu();
        
        System.out.println("----------- Bienvenido a Tecnologia "
                + "Integradora----------------");
        do
        {
            System.out.println("Ingresa la opción deseada"
                    + "\n   1) Añadir computadora"
                    + "\n   2) Revisar la lista"
                    + "\n   3) Modificar en la lista"
                    + "\n   4) Eliminar"
                    + "\n   5) SALIR");
            int opcion = scanint.nextInt();
            switch(opcion)
            {
                case 1:
                   Computadora compu = pedirDatosAUsuario();
                    boolean exito = servicios.agregar(compu);
                    if(exito)
                        System.out.println("Se agregó con éxito");
                    else
                        System.out.println("NEL MORRO NO SE HACE");
                    break;
                case 2:
                     LinkedList listaDeCompus = servicios.leer();
                    imprimir(listaDeCompus); 
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Usted ha Salido del Programa");
                    bandera = !bandera;
                    break;
            }
        }
        while(bandera);
    }
  private static void pedirDatosAUsuario() {
        System.out.println("Ingrese el No. serie");
        String noSerie = scanline.nextLine();
        System.out.println("Ingrese el aÃ±o de la computadora");
        String anio = scanline.nextLine();
        System.out.println("Ingrese el modelo");
        String modelo = scanline.nextLine();
        System.out.println("Ingrese el procesador");
        String procesador = scanline.nextLine();
        System.out.println("Ingrese RAM");
        int ram = scanint.nextInt();
        Computadora compu = new Computadora(noSerie, anio, modelo, procesador, ram);
  }
     private static void imprimir(LinkedList<Computadora> listaDeCompus) {
        for(Computadora compu : listaDeCompus){
            System.out.println(compu);}}
    
}