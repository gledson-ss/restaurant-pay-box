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
    public void setId_comida(String id_comida){
        this.id_comida = id_comida;
    }
    public void setDescricao_comida(String descricao_comida){
        this.descricao_comida = descricao_comida;
    }
    public void setValor_comida(float valor_comida){
        this.valor_comida = valor_comida;
    }
    public String getId_comida(){
        return id_comida;
    }
    public String getDescricao_comida(){
        return descricao_comida;
    }
    public float getValor_comida(){
        return valor_comida;
    }

    
    

}
