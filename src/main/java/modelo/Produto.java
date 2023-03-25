package modelo;

public class Produto {
    // Atributos com get/set
    // Atributos / Campos / Variáveis
    private int codigo;
    private String descricao;
    private int quantidade;
    private float valorUnitario;
    private String dataUltimaCompra;
    
    // Atributos com apenas get
    private float valorTotal;
    private float valorVendasUnitario;
    private float valorVendasTotal;
    private float margem;

    public Produto() {
    }
    public Produto(int codigo, String descricao, int quantidade, float valorUnitario, String dataUltimaCompra) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.dataUltimaCompra = dataUltimaCompra;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public float getValorUnitario() {
        return valorUnitario;
    }
    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
public String getDataUltimaCompra() {
        return dataUltimaCompra;
    }
    public void setDataUltimaCompra(String dataUltimaCompra) {
        this.dataUltimaCompra = dataUltimaCompra;
    }
    public float getValorTotal() {
        return valorTotal;
    }
    public float getValorVendasUnitario() {
        return valorVendasUnitario;
    }
    public float getValorVendasTotal() {
        return valorVendasTotal;
    }
    public void margem(){
        
    }
    
    public void calcular() {
        this.valorTotal = this.valorUnitario * this.quantidade;
        this.valorVendasUnitario = this.valorUnitario + (this.valorUnitario / 100 * this.margem);
        this.valorVendasTotal = this.valorVendasUnitario * this.quantidade;
    }
}

