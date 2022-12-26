package controller;

import dao.DaoItemItinerario;
import java.sql.ResultSet;
import java.util.List;
import model.ModelItemItinerario;

public class ControllerItemItinerario {

    DaoItemItinerario daoItemItinerario = new DaoItemItinerario();

    public boolean cadastrarItemItinerarioController(ModelItemItinerario itemItinerario) {
        return this.daoItemItinerario.cadastrarItemItinerarioDao(itemItinerario);
    }

    public boolean atualizarItemItinerarioController(int id, ModelItemItinerario itemItinerario){
        return this.daoItemItinerario.alterarItemItinerarioDao(id, itemItinerario);
    }
    
    public boolean excluirItemItinerarioController(int id) {
        return this.daoItemItinerario.excluirItemItinerarioDao(id);
    }

    //Retorna a tabela de tipo item do itinerario para ser incluso na comboBox
    public ResultSet listarDescricaoTipoItemItinerarioController() {
        return this.daoItemItinerario.listarDescricaoTipoItemItinerarioDao();
    }
    
    //Retorna uma lista para ser incluso na tabela
    public List<ModelItemItinerario> getListaItensItineraioController() {
        return this.daoItemItinerario.getListaItensItineraioDao();
    }

    public List<ModelItemItinerario> getListaItensItineraioComArgumentoController(String argumento){
        return this.daoItemItinerario.getListaItensItinerarioComArgumentoDao(argumento);
    }
    
    public boolean verificaSeItemJaCadastradoController(ModelItemItinerario itemItinerario){
        return this.daoItemItinerario.verificaSeItemJaCadastradoDao(itemItinerario);
    }
    
    
}
