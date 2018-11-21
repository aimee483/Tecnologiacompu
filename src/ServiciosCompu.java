import java.util.*;

public class ServiciosCompu implements iCRUD{
    
    LinkedList<Computadora> listaDeCompus = new LinkedList();
    @Override
    public boolean agregar(Computadora compu) {
        return listaDeCompus.add(compu);
    }
    public LinkedList leer(){
    return listaDeCompus;
    }
    
    
}
