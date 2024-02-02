package entitites;

public abstract class Carro {

    private String cor;
    private Integer anoCarro;
    private Integer potencia;

    public Carro(){
    }

    public Carro(String cor, Integer anoCarro, Integer potencia) {
        this.cor = cor;
        this.anoCarro = anoCarro;
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAnoCarro() {
        return anoCarro;
    }

    public void setAnoCarro(Integer anoCarro) {
        this.anoCarro = anoCarro;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }
}
