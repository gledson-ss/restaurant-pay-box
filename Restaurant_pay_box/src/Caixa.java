public class Caixa {

    float montante;


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

    
}
