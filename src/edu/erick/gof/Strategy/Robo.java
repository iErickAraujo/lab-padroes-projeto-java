package edu.erick.gof.Strategy;

public class Robo {
    //strategy=comportamento
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }
}
