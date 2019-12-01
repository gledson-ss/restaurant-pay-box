public class Bebida implements Produto{


    // declarando os atributos
    private float valor_bebida;
    private String id_bebida;
    private String descricao_bebida;
    
    // criando o construtor da classe
    public Bebida(String id_bebida, String descricao_bebida, float valor_bebida) {
        this.id_bebida = id_bebida;
        this.descricao_bebida = descricao_bebida;
        this.valor_bebida = valor_bebida;
    }


    // getters and setters
    @Override
    public String getId_produto() {
        return id_bebida;
    }

    @Override
    public String getDescricao() {
        return descricao_bebida;
    }

    @Override
    public float getValor() {
        return valor_bebida;
    }

    @Override
    public void setId_produto(String id_bebida) {
        this.id_bebida = id_bebida;
    }

    @Override
    public void setDescricao(String descicao_bebida) {
        this.descricao_bebida = descicao_bebida;
    }

    @Override
    public void setValor(float valor_bebida) {
        this.valor_bebida = valor_bebida;

    }
}
