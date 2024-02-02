package entitites;

public class CarroFox extends Carro{

    private String carro;

    public CarroFox(){
        super();
    }

    public CarroFox(String cor, Integer anoCarro, Integer potencia, String carro) {
        super(cor, anoCarro, potencia);
        this.carro = carro;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    @Override
    public String toString() {
        return getCarro()
                + ", cor: "
                + getCor()
                + ", ano do carro: "
                + getAnoCarro()
                + ", potencia: "
                + getPotencia();
    }
}
