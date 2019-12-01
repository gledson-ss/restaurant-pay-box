public class Comida implements Produto{


    // declarando os atributos
    private float valor_comida;
    private String id_comida;
    private String descricao_comida;
    
    // criando o construtor da classe
    public Comida(String id_comida, String descricao_comida, float valor_comida){
        this.id_comida = id_comida;
        this.descricao_comida = descricao_comida;
        this.valor_comida = valor_comida;
    }


    // getters and setters
    @Override
    public void setId_produto(String id_comida){
        this.id_comida = id_comida;
    }
    @Override
    public void setDescricao(String descricao_comida){
        this.descricao_comida = descricao_comida;
    }
    @Override
    public void setValor(float valor_comida){
        this.valor_comida = valor_comida;
    }
    @Override
    public String getId_produto(){
        return id_comida;
    }
    @Override
    public String getDescricao(){
        return descricao_comida;
    }
    @Override
    public float getValor(){
        return valor_comida;
    }
    


}
