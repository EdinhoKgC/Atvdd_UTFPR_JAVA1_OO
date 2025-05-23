package org.example.telas.Carga.escolhas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TelaCadVeicCarga {

    JFrame frameCadVeicCarga = new JFrame("Cadastro de Carga");

    JPanel painelCadVeicCarga = new JPanel();
    JLabel lblPlaca = new JLabel("Placa");
    JLabel lblTara = new JLabel("Tara");
    JLabel lblCargaMax = new JLabel("Carga Máxima");
    JLabel lblMarca = new JLabel("Marca");
    JLabel lblModelo = new JLabel("Modelo");
    JLabel lblCor = new JLabel("Cor");
    JLabel lblQtdRodas = new JLabel("Quantidade de Rodas");
    JLabel lblVelocMax = new JLabel("Velocidade Máxima");
    JLabel lblPistoes = new JLabel("Pistoes");
    JLabel lblPotencia = new JLabel("Potencia");

    JTextField txtPlaca = new JTextField(10);
    JTextField txtTara = new JTextField(10);
    JTextField txtCargaMax = new JTextField(10);
    JTextField txtMarca = new JTextField(10);
    JTextField txtModelo = new JTextField(10);
    JTextField txtCor = new JTextField(10);
    JTextField txtQtdRodas = new JTextField(10);
    JTextField txtVelocMax = new JTextField(10);
    JTextField txtPistoes = new JTextField(10);
    JTextField txtPotencia = new JTextField(10);

    JButton btnCadCarga = new JButton("Cadastrar");
    JButton btnLimpar = new JButton("Limpar");
    JButton btnVoltar = new JButton("Voltar");


    int altura = 500,largura = 300;

    public TelaCadVeicCarga(){

        frameCadVeicCarga.setSize(largura,altura);
        frameCadVeicCarga.add(painelCadVeicCarga);

        painelCadVeicCarga.setLayout(new BoxLayout(painelCadVeicCarga, BoxLayout.Y_AXIS));

        JPanel placa = new JPanel(new FlowLayout(FlowLayout.LEFT));
        placa.add(lblPlaca);
        placa.add(txtPlaca);

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
        botoes.add(btnCadCarga);
        botoes.add(btnLimpar);
        botoes.add(btnVoltar);

        painelCadVeicCarga.add(placa);
        painelCadVeicCarga.add(tara);
        painelCadVeicCarga.add(cargaMax);
        painelCadVeicCarga.add(marca);
        painelCadVeicCarga.add(modelo);
        painelCadVeicCarga.add(cor);
        painelCadVeicCarga.add(qtdRodas);
        painelCadVeicCarga.add(velocMax);
        painelCadVeicCarga.add(pistoes);
        painelCadVeicCarga.add(potencia);
        painelCadVeicCarga.add(botoes);

        frameCadVeicCarga.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameCadVeicCarga.setLocationRelativeTo(null);

        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frameCadVeicCarga.dispose();
            }
        });

    }

    public void mostrarTelaCadastroCarga(){
        frameCadVeicCarga.setVisible(true);
    }

}

