
package controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.ModelItemItinerario;
import org.junit.Test;
import static org.junit.Assert.*;


public class ControllerItemItinerarioTest {
    
    public ControllerItemItinerarioTest() {
    }

    @Test
    public void testCadastrarItemItinerarioRepetido() {
        
        System.out.println("cadastrarItemItinerarioController");
        ControllerItemItinerario controller = new ControllerItemItinerario();
        List<ModelItemItinerario> listaItensCadastrados = new ArrayList<>();
        listaItensCadastrados = controller.getListaItensItineraioController();
        
        ModelItemItinerario itemItinerario = listaItensCadastrados.get(1);
        
        assertEquals(false, controller.cadastrarItemItinerarioController(itemItinerario));
        
    }

    
    
}
