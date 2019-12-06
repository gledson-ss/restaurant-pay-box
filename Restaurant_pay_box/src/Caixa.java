import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Caixa {

    float montante;
    Instant agora = Instant.now();
    Map<String,Float> registro = new HashMap<String,Float>();
    ArrayList<Instant> horarios = new ArrayList<Instant>();
    int i;


    public Caixa(float montante){
        this.montante = montante;
    }

    public float getMontante() {
        return montante;
    }

    public void setMontante(float montante) {
        this.montante = montante;
    }
    public void setNovoMontante(float novo_montante) {
        this.montante = montante+novo_montante;
    }
    public void novoRegistro(String conta, float valor){
        registro.put(conta, valor);
        horarios.add(agora);
    }
    public void registroMomento(){
        i = 0;
        registro.entrySet().forEach(entry->{
            System.out.println("Conta: "+entry.getKey());
            System.out.println("Valor: "+entry.getValue());
            System.out.println("Momento da operacao: "+horarios.get(i)+"\n");
            i++;
         });
         System.out.println("Valor no caixa: "+ getMontante());
    }

    
}
