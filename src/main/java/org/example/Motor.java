package org.example;

public class Motor {

    private int qtdPist;
    private int potencia;

    public Motor(){
        this.qtdPist = 0;
        this.potencia = 0;
    }

    public Motor(int qtdPist, int potencia){
        this.qtdPist = qtdPist;
        this.potencia = potencia;
    }

    public int getQtdPist() {
        return this.qtdPist;
    }

    public int getPotencia() {
        return this.potencia;
    }

<<<<<<< HEAD
    public final void setQtdPist(int qtdPist){
        this.qtdPist = qtdPist;
    }

    public final void setPotencia(int potencia){
=======
    public void setQtdPist(int qtdPist){
        this.qtdPist = qtdPist;
    }

    public void setPotencia(int potencia){
>>>>>>> bccbaaf1600313da78ee25e57020288ffe2a7c54
        this.potencia = potencia;
    }
}