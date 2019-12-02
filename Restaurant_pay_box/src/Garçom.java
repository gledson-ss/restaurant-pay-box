import java.util.Scanner;

public class Garçom {

    private String codigo;
    private String nome;

    // construtor da classe
    public Garçom(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    //getters and setters
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

    public Garçom cadastraGarcon(){
        Scanner entrada = new Scanner(System.in);
        String nome, codigo;
        System.out.print("Informe o nome do garcom: ");
        nome = entrada.nextLine();
        setNome(nome);
        System.out.print("Informe o codigo do garcom: ");
        codigo = entrada.nextLine();
        setCodigo(codigo);
        Garçom g = new Garçom(codigo, nome);
        System.out.println("O garcom "+nome+" foi cadastrado com sucesso!");
        return g;
    }

}
