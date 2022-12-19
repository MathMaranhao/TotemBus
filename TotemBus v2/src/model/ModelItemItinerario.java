package model;

public class ModelItemItinerario {

    private int id;
    private int idTipoItem;
    private String descricaoItem;
    private String descricaoTipoItem;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTipoItem() {
        return idTipoItem;
    }

    public void setIdTipoItem(int idTipoItem) {
        this.idTipoItem = idTipoItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public String getDescricaoTipoItem() {
        return descricaoTipoItem;
    }

    public void setDescricaoTipoItem(String descricaoTipoItem) {
        this.descricaoTipoItem = descricaoTipoItem;
    }

}
