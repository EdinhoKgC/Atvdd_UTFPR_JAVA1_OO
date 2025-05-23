/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

/**
 *
 * @author edilson
 */
public final class Carga extends Veiculo implements Calcular {
    int cargaMax;
    int tara;
    
    public Carga(){
    
        super();
        this.cargaMax = 0;
        this.tara = 0;
        
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public final void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getTara() {
        return tara;
    }

    public final void setTara(int tara) {
        this.tara = tara;
    }
    
    @Override
    public float calcVel(float velocMax){
        float x = (velocMax*100000);
        return x;
 
    }
    

    @Override
    public int calcular() {
        int somaNum = 0;
        
        somaNum += getMotor().getQtdPist();
        somaNum += getMotor().getPotencia();
        somaNum += getQtdRodas();
        somaNum += getVelocMax();
        somaNum += getTara();
        somaNum += getCargaMax();
        
        return somaNum;
    }

    @Override
    public Object[] toArray(){
        return new Object[] {getPlaca(), getMarca(), getModelo(), getCor(), getVelocMax(), getQtdRodas(), getMotor().getQtdPist(), getMotor().getPotencia(), getTara(), getCargaMax()};
    }

    
}
