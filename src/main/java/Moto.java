public class Moto {

    public String cor;
    public String placa;
    public Double cilindrada;
    public Double velocidadeMaxima;
    public Double combustivel;

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getPlaca(){
        return this.placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public Double getCilindrada(){
        return this.cilindrada;
    }

    public void setCilindrada(Double cilindrada){
        this.cilindrada = cilindrada;
    }

    public Double getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Double velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Double getCombustivel(){
        return this.combustivel;
    }

    public void setCombustivel(Double combustivel){
        this.combustivel = combustivel;
    }

    public Moto(String cor, String placa, Double cilindrada, Double velocidadeMaxima, Double combustivel){
        this.cor = cor;
        this.placa = placa;
        this.cilindrada = cilindrada;
        this.velocidadeMaxima = velocidadeMaxima;
        this.combustivel = combustivel;
    }

    public Boolean combustivelAcabando(){
        if (this.combustivel < 10.0){
            return true;
        } else {
            return false;
        }
    }

}