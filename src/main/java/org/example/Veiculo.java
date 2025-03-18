package org.example;

public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private float velocMax;
    private int qtdRodas;
    private Motor motor;

    public Veiculo(){
        this.placa = " ";
        this.marca = " ";
        this.modelo = " ";
        this.cor = " ";
        this.velocMax = 0f;
        this.qtdRodas = 0;
        motor = new Motor();
    }
    
    public Veiculo(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocMax = velocMax;
        this.qtdRodas = qtdRodas;
        motor = new Motor();
    }
    
    public Veiculo(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, int qtdPist, int potencia){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocMax = velocMax;
        this.qtdRodas = qtdRodas;
        this.motor = new Motor(qtdPist, potencia);

    }

    public String getPlaca(){
        return this.placa;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getCor(){
        return this.cor;
    }

    public float getVelocMax(){
        return this.velocMax;
    }

    public int getQtdRodas(){
        return this.qtdRodas;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setVelocMax(float velocMax){
        this.velocMax = velocMax;
    }

    public void setQtdRodas(int qtdRodas){
        this.qtdRodas = qtdRodas;
    }

    public void setMotor(Motor motor){
        this.motor = motor;
    }

    @Override
    public String toString(){

        System.out.println("A placa do veículo é: " + this.placa);
        System.out.println("A marca do veículo é: " + this.marca);
        System.out.println("O modelo do veículo é: " + this.modelo);
        System.out.println("A cor do veículo é: " + this.cor);
        System.out.println("A velocidade máxima do veículo é: " + this.velocMax);
        System.out.println("A quantidade de rodas do veículo é: " + this.qtdRodas);
        System.out.println("A quantidade de pistões do Motor é: " + this.motor.getQtdPist());
        System.out.println("A potêcia do motor é: " + this.motor.getPotencia());

        System.out.println("************************************************************");
        return null;
    }
}