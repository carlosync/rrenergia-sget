package br.com.rrenergia.sget.model;

public enum TipoGerente {

    GERENTE("Gerente"),
    SUPERVISOR("Supervisor");

    private String descricao;

    TipoGerente(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
