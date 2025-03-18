package org.example;

public class Teste {
    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo();
        veiculo1.setPlaca("qgd-0242");
        veiculo1.setMarca("Yamaha");
        veiculo1.setModelo("Factor 150 ED 2016");
        veiculo1.setCor("Branca");
        veiculo1.setVelocMax(130f);
        veiculo1.setQtdRodas(2);
        veiculo1.getMotor().setPotencia(149);
        veiculo1.getMotor().setQtdPist(5);

        System.out.println("veículo 1");
        veiculo1.toString();

        Veiculo veiculo2 = new Veiculo("qgd-0141", "Honda", "Fan", "Preta", 120, 2);

        System.out.println("veiculo 2");
        System.out.println("A placa do veículo é: " + veiculo2.getPlaca());
        System.out.println("A marca do veículo é: " + veiculo2.getMarca());
        System.out.println("O modelo do veículo é: " + veiculo2.getModelo());
        System.out.println("A cor do veículo é: " + veiculo2.getCor());
        System.out.println("A velocidade máxima do veículo é: " + veiculo2.getVelocMax());
        System.out.println("A quantidade de rodas do veículo é: " + veiculo2.getQtdRodas());
        System.out.println("A quantidade de pistões do Motor é: " + veiculo2.getMotor().getQtdPist());
        System.out.println("A potêcia do motor é: " + veiculo2.getMotor().getPotencia());

        System.out.println("************************************************************");

        Veiculo veiculo3 = new Veiculo("qgd-0343","Shineray", "SH EFI 175CC", "Cinza", 135, 2, 6, 175);

        System.out.println("veiculo 3");
        System.out.println("A placa do veículo é: " + veiculo3.getPlaca());
        System.out.println("A marca do veículo é: " + veiculo3.getMarca());
        System.out.println("O modelo do veículo é: " + veiculo3.getModelo());
        System.out.println("A cor do veículo é: " + veiculo3.getCor());
        System.out.println("A velocidade máxima do veículo é: " + veiculo3.getVelocMax());
        System.out.println("A quantidade de rodas do veículo é: " + veiculo3.getQtdRodas());
        System.out.println("A quantidade de pistões do Motor é: " + veiculo3.getMotor().getQtdPist());
        System.out.println("A potêcia do motor é: " + veiculo3.getMotor().getPotencia());

        System.out.println("************************************************************");

        Veiculo veiculo4 = new Veiculo("abc-1234", "Honda", "CB 500X", "Vermelho", 180, 2, 2, 500);

        System.out.println("veiculo 4");
        System.out.println("A placa do veículo é: " + veiculo4.getPlaca());
        System.out.println("A marca do veículo é: " + veiculo4.getMarca());
        System.out.println("O modelo do veículo é: " + veiculo4.getModelo());
        System.out.println("A cor do veículo é: " + veiculo4.getCor());
        System.out.println("A velocidade máxima do veículo é: " + veiculo4.getVelocMax());
        System.out.println("A quantidade de rodas do veículo é: " + veiculo4.getQtdRodas());
        System.out.println("A quantidade de pistões do Motor é: " + veiculo4.getMotor().getQtdPist());
        System.out.println("A potêcia do motor é: " + veiculo4.getMotor().getPotencia());

        System.out.println("************************************************************");

        Veiculo veiculo5 = new Veiculo("xyz-5678", "Toyota", "Corolla", "Preto", 210, 4, 4, 200);

        System.out.println("veiculo 5");
        System.out.println("A placa do veículo é: " + veiculo5.getPlaca());
        System.out.println("A marca do veículo é: " + veiculo5.getMarca());
        System.out.println("O modelo do veículo é: " + veiculo5.getModelo());
        System.out.println("A cor do veículo é: " + veiculo5.getCor());
        System.out.println("A velocidade máxima do veículo é: " + veiculo5.getVelocMax());
        System.out.println("A quantidade de rodas do veículo é: " + veiculo5.getQtdRodas());
        System.out.println("A quantidade de pistões do Motor é: " + veiculo5.getMotor().getQtdPist());
        System.out.println("A potêcia do motor é: " + veiculo5.getMotor().getPotencia());
    }
}