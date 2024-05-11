public class Produto {
    private String nome;
    private String descricao;
    private Double precoUnitario;
    private Integer quantidade;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getPrecoUnitario() {
        return precoUnitario;
    }
    public void setPrecoUnitario(Double precoUnitario) {
        if(precoUnitario > 5000) return;//era pra vir null
        this.precoUnitario = precoUnitario;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        if(quantidade > 5000) return;
        this.quantidade = quantidade;
    }

    

    @Override
    public String toString() {
        return "Produto{" +
        "nome = '" + nome + '\''+
        ", preço unitário = " + precoUnitario +
        ", quantidade = " + quantidade +
     
     '}';
    }

}
