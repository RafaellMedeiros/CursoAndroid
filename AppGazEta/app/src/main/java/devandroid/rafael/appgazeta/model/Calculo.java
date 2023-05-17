package devandroid.rafael.appgazeta.model;

public class Calculo {
    private double gasolina;

    public Calculo(double gasolina, double etanol) {
        this.gasolina = gasolina;
        this.etanol = etanol;
    }

    private double etanol;

    public double getGasolina() {
        return gasolina;
    }

    public double getEtanol() {
        return etanol;
    }

}
