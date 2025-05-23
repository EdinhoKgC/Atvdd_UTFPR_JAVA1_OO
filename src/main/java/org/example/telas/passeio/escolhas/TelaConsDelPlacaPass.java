package org.example.telas.passeio.escolhas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TelaConsDelPlacaPass {

    JFrame frameConsDelVeicPasseio = new JFrame("Consultar/Deletar Veiculo por Placa");
    JPanel painelConsDelVeicPasseio = new JPanel();

    JLabel lblInformePlaca = new JLabel("Informe a placa: ");
    JTextField txtInformePlaca = new JTextField(10);

    JLabel lblQtdPassageiros = new JLabel("Quantidade de Passageiros");
    JLabel lblMarca = new JLabel("Marca");
    JLabel lblModelo = new JLabel("Modelo");
    JLabel lblCor = new JLabel("Cor");
    JLabel lblQtdRodas = new JLabel("Quantidade de Rodas");
    JLabel lblVelocMax = new JLabel("Velocidade Máxima");
    JLabel lblPistoes = new JLabel("Pistoes");
    JLabel lblPotencia = new JLabel("Potencia");

    JTextField txtQtdPassageiros = new JTextField(10);

    JTextField txtMarca = new JTextField(10);
    JTextField txtModelo = new JTextField(10);
    JTextField txtCor = new JTextField(10);
    JTextField txtQtdRodas = new JTextField(10);
    JTextField txtVelocMax = new JTextField(10);
    JTextField txtPistoes = new JTextField(10);
    JTextField txtPotencia = new JTextField(10);

    JButton btnConsultaPass = new JButton("Consultar");
    JButton btnDeletaPass = new JButton("Excluir");
    JButton btnVoltar = new JButton("Voltar");


    int altura = 500,largura = 300;

    public TelaConsDelPlacaPass(){

        frameConsDelVeicPasseio.setSize(largura,altura);
        frameConsDelVeicPasseio.add(painelConsDelVeicPasseio);

        painelConsDelVeicPasseio.setLayout(new BoxLayout(painelConsDelVeicPasseio, BoxLayout.Y_AXIS));

        JPanel placa = new JPanel(new FlowLayout(FlowLayout.LEFT));
        placa.add(lblInformePlaca);
        placa.add(txtInformePlaca);

        JPanel qtdPassageiros = new JPanel(new FlowLayout(FlowLayout.LEFT));
        qtdPassageiros.add(lblQtdPassageiros);
        qtdPassageiros.add(txtQtdPassageiros);

        JPanel marca = new JPanel(new FlowLayout(FlowLayout.LEFT));
        marca.add(lblMarca);
        marca.add(txtMarca);

        JPanel modelo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        modelo.add(lblModelo);
        modelo.add(txtModelo);

        JPanel cor = new JPanel(new FlowLayout(FlowLayout.LEFT));
        cor.add(lblCor);
        cor.add(txtCor);

        JPanel qtdRodas = new JPanel(new FlowLayout(FlowLayout.LEFT));
        qtdRodas.add(lblQtdRodas);
        qtdRodas.add(txtQtdRodas);

        JPanel velocMax = new JPanel(new FlowLayout(FlowLayout.LEFT));
        velocMax.add(lblVelocMax);
        velocMax.add(txtVelocMax);

        JPanel pistoes = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pistoes.add(lblPistoes);
        pistoes.add(txtPistoes);

        JPanel potencia = new JPanel(new FlowLayout(FlowLayout.LEFT));
        potencia.add(lblPotencia);
        potencia.add(txtPotencia);

        JPanel botoes = new JPanel(new FlowLayout(FlowLayout.LEFT));
        botoes.add(btnConsultaPass);
        botoes.add(btnDeletaPass);
        botoes.add(btnVoltar);

        painelConsDelVeicPasseio.add(placa);
        painelConsDelVeicPasseio.add(qtdPassageiros);
        painelConsDelVeicPasseio.add(marca);
        painelConsDelVeicPasseio.add(modelo);
        painelConsDelVeicPasseio.add(cor);
        painelConsDelVeicPasseio.add(qtdRodas);
        painelConsDelVeicPasseio.add(velocMax);
        painelConsDelVeicPasseio.add(pistoes);
        painelConsDelVeicPasseio.add(potencia);
        painelConsDelVeicPasseio.add(botoes);

        frameConsDelVeicPasseio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameConsDelVeicPasseio.setLocationRelativeTo(null);

        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frameConsDelVeicPasseio.dispose();
            }
        });

    }

    public void mostrarTelaConsDelCadastroPasseio(){
        frameConsDelVeicPasseio.setVisible(true);
    }

}

