import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Usa_restaurant {
    public static void main(String []args){
        menuGarcon();
        menuAberturaCaixa();
    }

    public static void menuGarcon(){
        // inicializando variavel para armazenar acao do usuario
        int acao;
        // inicializando scanner para ler do teclado
        Scanner entrada = new Scanner(System.in);
        // inicializando lista de garcons registrados no sistema
        ArrayList<Garçom> gList = new ArrayList<Garçom>();
        while(true){
            // menu interativo
            System.out.println("\n--- Menu Garcons ---");
            System.out.println("\ninforme o numero da acao desejada: \n");
            System.out.println("1 - Cadastrar garcom\n2 - Consultar garcons\n3 - Voltar para o menu principal");
            acao = entrada.nextInt();
            // acao de cadastro de garcom no sistema
            if(acao == 1){
                Garçom g = new Garçom("default", "default");
                gList.add(g.cadastraGarcon());
                continue;
            }
            // acao para listar garcons cadastrados
            else if(acao == 2){
                for(int i=0;i<gList.size();i++){ 
                    System.out.println("Garcom "+(i+1));
                    System.out.print("Nome: ");
                    System.out.println(gList.get(i).getNome());
                    System.out.print("Codigo: ");
                    System.out.println(gList.get(i).getCodigo()+"\n");
                    continue;  
                }
            }
            // acao para caso o usuario decida voltar par ao menu principal
            else if(acao == 3){return;}
        }
    }
    public static void menuProduto(){
        int acao;
        Scanner entrada = new Scanner(System.in);
        while(true){
            System.out.println("\n--- Menu Produtos ---");
            System.out.println("\ninforme o numero da acao desejada: \n");
            System.out.println("1 - Cadastrar Produtos\n2 - Consultar Produtos\n3 - Voltar para o menu principal");
            acao = entrada.nextInt();
            if(acao == 1){}
            else if(acao == 2){}
            else if(acao ==3){}
            break;
        }
    }

    public static Caixa menuAberturaCaixa(){
        int acao;
        Scanner entrada = new Scanner(System.in);
        Caixa c = new Caixa(0);
        while(true){
            System.out.println("\n--- Menu Abertura do caixa ---");
            System.out.println("\ninforme o numero da acao desejada: \n");
            System.out.println("1 - Informar montante inicial\n2 - Voltar para o menu principal");
            acao = entrada.nextInt();
            if(acao == 1){
                System.out.print("Informe o montante inicial: ");
                c.setMontante(entrada.nextFloat());
            }
            else if(acao == 2){
                return c;
            }
        }
    }
    public static void menuMovimentar(){
        int acao;
        Scanner entrada = new Scanner(System.in);
        while(true){
            int conta;
            String garcon;
            System.out.println("\n--- Menu Movimentar ---");
            System.out.print("\ninforme o numero da conta: ");
            conta = entrada.nextInt();
            System.out.print("\ninforme o codigo do garcon: ");
            garcon = entrada.nextLine();
            System.out.println("\ninforme o numero da acao desejada: \n");
            System.out.println("1 - Adicionar item consumido\n2 - Alterar garcon\n3 - Voltar para o menu principal");
            acao = entrada.nextInt();
            if(acao == 1){}
            else if(acao == 2){}
            else if(acao ==3){}
            break;
        }
    }
    public static void menuBalanco(){
        int acao;
        Scanner entrada = new Scanner(System.in);
        while(true){
            System.out.println("\n--- Menu Balanco do caixa ---");
            System.out.println("\ninforme o numero da acao desejada: \n");
            System.out.println("1 - Informar movimentacao atual\n2 - Voltar para o menu principal");
            acao = entrada.nextInt();
            if(acao == 1){}
            else if(acao == 2){}
            break;
        }
    }

}

