package dao;

import conexaoBd.ConexaoMySql;
import model.ModelItemItinerario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DaoItemItinerario {

    Connection conexao;
    PreparedStatement pst;
    ResultSet rs;

    public boolean cadastrarItemItinerario(ModelItemItinerario itemDeItinerario) {

        try {
            conexao = ConexaoMySql.conectar();
            String sql = "INSERT INTO item_de_itinerario (fk_idtipo,nome) VALUES (?,?)";
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, itemDeItinerario.getIdTipoItem());
            pst.setString(2, itemDeItinerario.getDescricaoItem());
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        } finally {
            ConexaoMySql.desconectar(conexao);
        }

    }

    public boolean excluirItemItinerario(int id) {

        try {
            conexao = ConexaoMySql.conectar();
            String sql = "DELETE FROM item_de_itinerario WHERE item_de_itinerario.iditem = ?;";
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Não foi possivel realizar a exclusão do item de intinerario na tabela: item_de_itinerario" + e);
            return false;
        } finally {
            ConexaoMySql.desconectar(conexao);
        }
    }

    public boolean alterarItemItinerario(int id, ModelItemItinerario itemItinerario) {

        try {
            conexao = ConexaoMySql.conectar();
            String sql = "UPDATE item_de_Itinerario SET item_de_Itinerario.fk_idtipo = ?, item_de_Itinerario.nome = ? WHERE item_de_Itinerario.iditem = ?;";
            pst = conexao.prepareStatement(sql);

            pst.setInt(1, itemItinerario.getIdTipoItem());
            pst.setString(2, itemItinerario.getDescricaoItem());
            pst.setInt(3, id);
            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        } finally {
            ConexaoMySql.desconectar(conexao);
        }

    }

    public List<ModelItemItinerario> getListaItensItineraioDao() {

        List<ModelItemItinerario> listaItensItnerario = new ArrayList<>();

        ModelItemItinerario modelItemItinerario = new ModelItemItinerario();

        try {
            conexao = ConexaoMySql.conectar();
            String sql = "SELECT iditem, descricao, nome FROM item_de_itinerario, tipo_item_itinerario WHERE item_de_itinerario.fk_idtipo = tipo_item_itinerario.idtipo ORDER BY item_de_itinerario.iditem;";
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                modelItemItinerario = new ModelItemItinerario();

                modelItemItinerario.setId(rs.getInt("iditem"));
                modelItemItinerario.setDescricaoTipoItem(rs.getString("descricao"));
                modelItemItinerario.setDescricaoItem(rs.getString("nome"));

                listaItensItnerario.add(modelItemItinerario);
            }

        } catch (Exception e) {
            System.out.println("Não foi possivel listar os itens cadastrados na tabela de: item_de_itinerario " + e);
        }

        return listaItensItnerario;

    }

    public List<ModelItemItinerario> getListaItensItinerarioComArgumentoDao(String argumento){
        
        List<ModelItemItinerario> listaItensItnerario = new ArrayList<>();

        ModelItemItinerario modelItemItinerario = new ModelItemItinerario();
        
        try {
            conexao = ConexaoMySql.conectar();
            String sql = "SELECT iditem, descricao, nome FROM item_de_itinerario, tipo_item_itinerario WHERE item_de_itinerario.fk_idtipo = tipo_item_itinerario.idtipo AND nome LIKE '%" + argumento + "%' ORDER BY item_de_itinerario.iditem;";
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
        while (rs.next()) {
                modelItemItinerario = new ModelItemItinerario();

                modelItemItinerario.setId(rs.getInt("iditem"));
                modelItemItinerario.setDescricaoTipoItem(rs.getString("descricao"));
                modelItemItinerario.setDescricaoItem(rs.getString("nome"));

                listaItensItnerario.add(modelItemItinerario);
            }

        } catch (Exception e) {
            System.out.println("Não foi possivel listar os itens cadastrados na tabela de: item_de_itinerario " + e);
        }

        return listaItensItnerario;
        
    }
    
    public ResultSet listarDescricaoTipoItemItinerario() {

        try {
            conexao = ConexaoMySql.conectar();
            String sql = "SELECT * FROM tipo_item_itinerario ORDER BY idtipo";
            pst = conexao.prepareStatement(sql);
            return pst.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

}
