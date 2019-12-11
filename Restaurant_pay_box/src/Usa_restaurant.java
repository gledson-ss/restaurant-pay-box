import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Usa_restaurant {
    // menu principal
    public static void main(String []args){

        // definicao padrao de valores e estruturas
        int acao;
        Scanner entrada = new Scanner(System.in);
        ArrayList<Garçom> gList = new ArrayList<Garçom>();
        ArrayList<Produto> pList = new ArrayList<Produto>();
        Caixa c = new Caixa(0);
        DecimalFormat df = new DecimalFormat("#.00");


        // realiza o cadastro inicial dos garcons e produtos
        gList = menuGarcon();
        pList = menuProduto();
        // inicializa o caixa            
        c = menuAberturaCaixa();

        // inicia menu principal
        while(true){
            String conta;
            String garcon;
            String codigo;
            clearScreen();
            System.out.println("\n--- Menu Movimentar ---");
            System.out.println("\ninforme o numero da acao desejada: \n");
            System.out.println("1 - Nova conta\n2 - Cadastrar novo garcon\n3 - Cadastrar novo produto\n4 - Fornecer balanco\n5 - Sair do programa");
            acao = entrada.nextInt();
            if(acao==1){
                clearScreen();
                // nova conta
                float total=0;
                float percentualGarcon=0;
                while(acao==1){
                    System.out.println("informe o numero da conta: ");
                    conta = entrada.next();
                    System.out.println("\ninforme o codigo do garcon: ");
                    garcon = entrada.next();
                    while(true){
                        System.out.println("\ninforme o numero da acao desejada: \n");
                        Comanda co = new Comanda(conta,garcon);
                        clearScreen();
                        System.out.println("1 - Adicionar item consumido\n2 - Subtotal da conta\n3 - Cancelar e criar nova conta");
                        acao = entrada.nextInt();
                        if(acao == 1){
                            clearScreen();
                            System.out.println("informe o codigo do item consumido: ");
                            codigo = entrada.next();
                            for(int i = 0; i<pList.size(); i++){
                                if(pList.get(i).getId_produto().equals(codigo)){
                                    total += pList.get(i).getValor();
                                    System.out.println(pList.get(i).getDescricao()+" foi adicionado!");
                                }
                            }
                            continue;
                        }
                        else if(acao == 2){
                            clearScreen();
                            float valor_pago;
                            float troco;
                            System.out.println("O subtotal consumido foi de "+(df.format(total)));
                            System.out.println("O valor dos 10% do garconfoi de: "+df.format((total*10)/100));
                            System.out.println("O total consumido com os 10% foi de "+((df.format(total*1.1))));
                            total = total + ((total*10)/100);
                            c.setNovoMontante(total);
                            System.out.print("Informe o valor pago pelo cliente: ");
                            valor_pago = entrada.nextFloat();
                            troco = valor_pago - total;
                            if(troco<0){
                                System.out.println("informe um troco valido");
                            }
                            else{
                                System.out.println("O troco vai ser de: "+troco);
                            }
                            c.novoRegistro(conta, total);
                            espera();
                            clearScreen();
                            break;

                        }
                        else if(acao == 3){break;}
                        else{
                            continue;
                        }
                    }
                }
                
            }
            else if(acao==2){
                menuGarcon();
            }
            else if(acao==3){
                menuProduto();
            }
            else if(acao==4){
                menuBalanco(c);
            }
            else if(acao==5){
                break;
            }
        }
    }

    // menu de cadastro, returna uma lista de garcons
    public static ArrayList<Garçom> menuGarcon(){
        // inicializando variavel para armazenar acao do usuario
        int acao;
        // inicializando scanner para ler do teclado
        Scanner entrada = new Scanner(System.in);
        // inicializando lista de garcons registrados no sistema
        ArrayList<Garçom> gList = new ArrayList<Garçom>();
        while(true){
            // menu interativo
            clearScreen();
            System.out.println("\n--- Menu Garcons ---");
            System.out.println("\ninforme o numero da acao desejada: \n");
            System.out.println("1 - Cadastrar garcom\n2 - Consultar garcons\n3 - Finalizar");
            acao = entrada.nextInt();
            // acao de cadastro de garcom no sistema
            if(acao == 1){
                clearScreen();
                Garçom g = new Garçom("default", "default");
                gList.add(g.cadastraGarcon());
                espera();
                continue;
            }
            // acao para listar garcons cadastrados
            else if(acao == 2){
                clearScreen();
                for(int i=0;i<gList.size();i++){ 
                    System.out.println("Garcom "+(i+1));
                    System.out.print("Nome: ");
                    System.out.println(gList.get(i).getNome());
                    System.out.print("Codigo: ");
                    System.out.println(gList.get(i).getCodigo()+"\n");
                    continue;  
                }
                espera();
            }
            // acao para caso o usuario decida voltar par ao menu principal
            else if(acao == 3){
                clearScreen();
                return gList;
            }
        }
    }
    //deve retornar ArrayList de produtos
    public static ArrayList<Produto> menuProduto(){
        ArrayList<Produto> pList = new ArrayList<Produto>(); 
        int acao;
        Scanner entrada = new Scanner(System.in);
        while(true){
            clearScreen();
            System.out.println("\n--- Menu Produtos ---");
            System.out.println("\ninforme o numero da acao desejada: \n");
            System.out.println("1 - Cadastrar Produtos\n2 - Consultar Produtos\n3 - Finalizar");
            acao = entrada.nextInt();
            if(acao == 1){
                clearScreen();
                System.out.println("\ninforme o numero da acao desejada: \n");
                System.out.println("Qual o tipo do produto?\n1 - Bebida\n2 - Comida");
                acao = entrada.nextInt();
                if(acao==1){
                    clearScreen();
                    Bebida b = new Bebida("default","default",0);
                    pList.add(b.cadastraBebida());
                }
                else if(acao==2){
                    clearScreen();
                    Comida c = new Comida("default","default",0);
                    pList.add(c.cadastraComida());
                }
                continue;
            }
            else if(acao == 2){
                clearScreen();
                for(int i=0;i<pList.size();i++){ 
                    System.out.println("Produto "+(i+1));
                    System.out.print("id: ");
                    System.out.println(pList.get(i).getId_produto());
                    System.out.print("descricao: ");
                    System.out.println(pList.get(i).getDescricao());
                    System.out.print("valor: ");
                    System.out.println(pList.get(i).getValor());
                }
                int sair = 0;
                espera();
            }
            else if(acao ==3){
                return pList;
            }
        }
    }
    // menu para abertura inicial do caixa
    public static Caixa menuAberturaCaixa(){
        clearScreen();
        int acao;
        Scanner entrada = new Scanner(System.in);
        Caixa c = new Caixa(0);
        while(true){
            System.out.println("\n--- Menu Abertura do caixa ---");
            System.out.println("\ninforme o numero da acao desejada: \n");
            System.out.println("1 - Informar montante inicial\n2 - Finalizar");
            acao = entrada.nextInt();
            if(acao == 1){
                clearScreen();
                System.out.print("Informe o montante inicial: ");
                c.setMontante(entrada.nextFloat());
            }
            else if(acao == 2){
                clearScreen();
                return c;
            }
        }
    }
    //menu para informar coisas do caixa
    public static void menuBalanco(Caixa c){
        int acao;
        Scanner entrada = new Scanner(System.in);
        while(true){
            clearScreen();
            System.out.println("\n--- Menu Balanco do caixa ---");
            System.out.println("\ninforme o numero da acao desejada: \n");
            System.out.println("1 - Informar movimentacao atual\n2 - Voltar para o menu principal");
            acao = entrada.nextInt();
            if(acao == 1){
                c.registroMomento();
                espera();
            }
            else if(acao == 2){
                break;
            }
        }
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
    public static void espera() {
        Scanner entrada = new Scanner(System.in);
        int sair = 0;
        while(sair!=1){
            System.out.println("Digite 1 para voltar");
            sair = entrada.nextInt();
        }
    }

}

