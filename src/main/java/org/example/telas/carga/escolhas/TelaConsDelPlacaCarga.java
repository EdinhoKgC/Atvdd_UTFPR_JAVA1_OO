package org.example.telas.Carga.escolhas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TelaConsDelPlacaCarga {

    JFrame frameConsDelVeicCarga = new JFrame("Consultar/Deletar Veiculo por Placa");
    JPanel painelConsDelVeicCarga = new JPanel();

    JLabel lblInformePlaca = new JLabel("Informe a placa: ");
    JTextField txtInformePlaca = new JTextField(10);

    JLabel lblTara = new JLabel("Tara");
    JLabel lblCargaMax = new JLabel("Carga Máxima");
    JLabel lblMarca = new JLabel("Marca");
    JLabel lblModelo = new JLabel("Modelo");
    JLabel lblCor = new JLabel("Cor");
    JLabel lblQtdRodas = new JLabel("Quantidade de Rodas");
    JLabel lblVelocMax = new JLabel("Velocidade Máxima");
    JLabel lblPistoes = new JLabel("Pistoes");
    JLabel lblPotencia = new JLabel("Potencia");

    JTextField txtTara = new JTextField(10);
    JTextField txtCargaMax = new JTextField(10);
    JTextField txtMarca = new JTextField(10);
    JTextField txtModelo = new JTextField(10);
    JTextField txtCor = new JTextField(10);
    JTextField txtQtdRodas = new JTextField(10);
    JTextField txtVelocMax = new JTextField(10);
    JTextField txtPistoes = new JTextField(10);
    JTextField txtPotencia = new JTextField(10);

    JButton btnConsultaCarga = new JButton("Consultar");
    JButton btnDeletaCarga = new JButton("Excluir");
    JButton btnVoltar = new JButton("Voltar");


    int altura = 500,largura = 300;

    public TelaConsDelPlacaCarga(){

        frameConsDelVeicCarga.setSize(largura,altura);
        frameConsDelVeicCarga.add(painelConsDelVeicCarga);

        painelConsDelVeicCarga.setLayout(new BoxLayout(painelConsDelVeicCarga, BoxLayout.Y_AXIS));

        JPanel placa = new JPanel(new FlowLayout(FlowLayout.LEFT));
        placa.add(lblInformePlaca);
        placa.add(txtInformePlaca);

        JPanel tara = new JPanel(new FlowLayout(FlowLayout.LEFT));
        tara.add(lblTara);
        tara.add(txtTara);

        JPanel cargaMax = new JPanel(new FlowLayout(FlowLayout.LEFT));
        cargaMax.add(lblCargaMax);
        cargaMax.add(txtCargaMax);

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
        botoes.add(btnConsultaCarga);
        botoes.add(btnDeletaCarga);
        botoes.add(btnVoltar);

        painelConsDelVeicCarga.add(placa);
        painelConsDelVeicCarga.add(tara);
        painelConsDelVeicCarga.add(cargaMax);
        painelConsDelVeicCarga.add(marca);
        painelConsDelVeicCarga.add(modelo);
        painelConsDelVeicCarga.add(cor);
        painelConsDelVeicCarga.add(qtdRodas);
        painelConsDelVeicCarga.add(velocMax);
        painelConsDelVeicCarga.add(pistoes);
        painelConsDelVeicCarga.add(potencia);
        painelConsDelVeicCarga.add(botoes);

        frameConsDelVeicCarga.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameConsDelVeicCarga.setLocationRelativeTo(null);

        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frameConsDelVeicCarga.dispose();
            }
        });

    }

    public void mostrarTelaConsDelCadastroCarga(){
        frameConsDelVeicCarga.setVisible(true);
    }

}

