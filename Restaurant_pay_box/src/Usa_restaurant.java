import java.util.Scanner;

public class Usa_restaurant {
    public static void main(String []args){
        menuGarcon();
    }

    public static void menuGarcon(){
        int acao;
        Scanner entrada = new Scanner(System.in);
        while(true){
            System.out.println("\n--- Menu Garcons ---");
            System.out.println("\ninforme o numero da acao desejada: \n");
            System.out.println("1 - Cadastrar garcom\n2 - Consultar garcons\n3 - Voltar para o menu principal");
            acao = entrada.nextInt();
            if(acao == 1){}
            else if(acao == 2){}
            else if(acao ==3){}
            break;
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

    public static void menuAberturaCaixa(){
        int acao;
        Scanner entrada = new Scanner(System.in);
        while(true){
            System.out.println("\n--- Menu Abertura do caixa ---");
            System.out.println("\ninforme o numero da acao desejada: \n");
            System.out.println("1 - Informar montante inicial\n2 - Voltar para o menu principal");
            acao = entrada.nextInt();
            if(acao == 1){}
            else if(acao == 2){}
            break;
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

