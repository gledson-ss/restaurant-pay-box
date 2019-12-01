public class Bebida implements Produto{


    // declarando os atributos
    private float valor_bebida;
    private String id_bebida;
    private String descricao_bebida;
    
    // criando o construtor da classe
    public bebida(String id_bebida, String descricao_bebida, float valor_bebida){
        this.id_bebida = id_bebida;
        this.descricao_bebida = descricao_bebida;
        this.valor_bebida = valor_bebida;
    }


    // getters and setters
    public void setId_bebida(String id_bebida){
        this.id_bebida = id_bebida;
    }
    public void setDescricao_bebida(String descricao_bebida){
        this.descricao_bebida = descricao_bebida;
    }
    public void setValor_bebida(float valor_bebida){
        this.valor_bebida = valor_bebida;
    }
    public String getId_bebida(){
        return id_bebida;
    }
    public String getDescricao_bebida(){
        return descricao_bebida;
    }
    public float getValor_bebida(){
        return valor_bebida;
    }
}
