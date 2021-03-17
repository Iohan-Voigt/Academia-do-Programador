/**
 * @author iohan
 */

public class Chamados {
    
    //Configura o tipo da data =================================================
    

    // Variáveis ===============================================================
    private String tituloChamado, descricao, equipamento, dataAbertura;
    
    // Construtor ==============================================================

    public Chamados(String tituloChamado, String descricao, String equipamento,String dataAbertura) {
        this.tituloChamado = tituloChamado;
        this.descricao = descricao;
        this.equipamento = equipamento;
        this.dataAbertura = dataAbertura;
    }
    
    // Getters e Setters =======================================================

    public String getTituloChamado() {
        return tituloChamado;
    }

    public void setTituloChamado(String tituloChamado) {
        this.tituloChamado = tituloChamado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    
    // Override ================================================================
    
    @Override
    public String toString(){
        return "Título: " + tituloChamado + " | Descrição: " + descricao + " | Equipamento: " + equipamento + " | Data da abertura: " + dataAbertura;
    }
    
}
