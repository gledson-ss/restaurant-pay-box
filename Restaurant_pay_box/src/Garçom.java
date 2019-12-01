public class Garçom {

    private String codigo;
    private String nome;


    public Garçom(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getNome(){
        return nome;
    }
    public String getCodigo(){
        return codigo;
    }

}
