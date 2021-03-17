/**
 * @author iohan
 */
public class Equipamentos {
    
    //Configura o tipo da data =================================================
    
    
    // Variáveis ===============================================================
    private String nome, numeroSerie, fabricante, dataFabricacao;
    private float preco;

    // Construtor ==============================================================
    public Equipamentos(String nome, String numeroSerie, String fabricante, float preco, String dataFabricacao) {
        this.nome = nome;
        this.numeroSerie = numeroSerie;
        this.fabricante = fabricante;
        this.preco = preco;
        this.dataFabricacao = dataFabricacao;
    }
    
    // Getters e Setters =======================================================


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroDeSerie) {
        this.numeroSerie = numeroDeSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    
    // Override ================================================================
    
    @Override
    public String toString(){
        
        return "Nome: " + nome + " | Número de série: " + numeroSerie + " | Fabricante: " + fabricante;
    }
    
}
