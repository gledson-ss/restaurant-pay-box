public class Comanda {

    String codigo_Conta;
    String codigo_Garcon;

    public Comanda(String codigo_Conta, String codigo_Garcon){
        this.codigo_Conta = codigo_Conta;
        this.codigo_Garcon = codigo_Garcon;
    }

    public String getCodigo_Garcon(){
        return codigo_Garcon;
    }
    public String getCodigo_Conta(){
        return codigo_Conta;
    }

}
