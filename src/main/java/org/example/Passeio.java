/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

/**
 *
 * @author edilson
 */
public final class Passeio extends Veiculo implements Calcular{
    
    int qtdPassageiros;
    
    public Passeio(){
        super();
        this.qtdPassageiros = 0;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public final void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }
    
    @Override
    public float calcVel(float velocMax){
        float x = (velocMax * 1000);
        return x;
 
    }
    
    @Override
    public String toString() {
    return super.toString() +
           "\nQuantidade de Passageiros: " + this.qtdPassageiros;
}

    @Override
    public int calcular() {
        int somaLetras = 0;
        
        somaLetras += getPlaca().length();
        somaLetras += getMarca().length();
        somaLetras += getModelo().length();
        somaLetras += getCor().length();
        
        return somaLetras;
    }

    @Override
    public Object[] toArray(){
        return new Object[]{getPlaca(), getMarca(), getModelo(), getCor(), getQtdPassageiros(), getQtdRodas(), calcVel(getVelocMax()), getMotor().getQtdPist(), getMotor().getPotencia(), calcular()};
    }

    
}