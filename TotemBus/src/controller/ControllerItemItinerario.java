package controller;

import dao.DaoItemItinerario;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import model.ModelItemItinerario;

public class ControllerItemItinerario {

    DaoItemItinerario daoItemItinerario = new DaoItemItinerario();

    public boolean cadastrarItemItinerarioController(ModelItemItinerario itemItinerario) {

        if (this.verificaSeItemJaCadastradoController(itemItinerario) == false) {
            return this.daoItemItinerario.cadastrarItemItinerarioDao(itemItinerario);
        } else {
            return false;
        }
    }

    public boolean atualizarItemItinerarioController(int id, ModelItemItinerario itemItinerario) {

        if (this.verificaSeItemJaCadastradoController(itemItinerario) == false) {
            return this.daoItemItinerario.alterarItemItinerarioDao(id, itemItinerario);
        } else {
            return false;
        }
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

    public List<ModelItemItinerario> getListaItensItineraioComArgumentoController(String argumento) {
        return this.daoItemItinerario.getListaItensItinerarioComArgumentoDao(argumento);
    }

    public boolean verificaSeItemJaCadastradoController(ModelItemItinerario itemItinerario) {
        if (this.daoItemItinerario.verificaSeItemJaCadastradoDao(itemItinerario) == true) {
            JOptionPane.showMessageDialog(null, "Esse item já foi cadastrado anteriormente", "Erro", JOptionPane.ERROR_MESSAGE);
            return true;
        } else {
            return false;
        }
    }

}
