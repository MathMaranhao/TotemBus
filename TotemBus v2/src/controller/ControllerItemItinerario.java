package controller;

import dao.DaoItemItinerario;
import java.sql.ResultSet;
import java.util.List;
import model.ModelItemItinerario;

public class ControllerItemItinerario {

    DaoItemItinerario daoItemItinerario = new DaoItemItinerario();

    public boolean cadastrarItemItinerario(ModelItemItinerario itemItinerario) {
        return this.daoItemItinerario.cadastrarItemItinerario(itemItinerario);
    }

    public boolean atualizarItemItinerario(int id, ModelItemItinerario itemItinerario){
        return this.daoItemItinerario.alterarItemItinerario(id, itemItinerario);
    }
    
    public boolean excluirItemItinerarioController(int id) {
        return this.daoItemItinerario.excluirItemItinerario(id);
    }

    //Retorna a tabela de tipo item do itinerario para ser incluso na comboBox
    public ResultSet listarDescricaoTipoItemItinerario() {
        return this.daoItemItinerario.listarDescricaoTipoItemItinerario();
    }
    
    //Retorna uma lista para ser incluso na tabela
    public List<ModelItemItinerario> getListaItensItineraioController() {
        return this.daoItemItinerario.getListaItensItineraioDao();
    }

}
