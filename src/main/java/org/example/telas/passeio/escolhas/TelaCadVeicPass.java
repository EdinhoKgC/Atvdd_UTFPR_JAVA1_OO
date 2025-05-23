package org.example.telas.passeio.escolhas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.example.BD.BDVeiculos;
import org.example.Passeio;
import org.example.telas.passeio.TelaPasseio;


public class TelaCadVeicPass {

    JFrame frameCadVeicPasseio = new JFrame("Cadastro de Passeio");
    JPanel painelCadVeicPasseio = new JPanel();
    JLabel lblQtdPassageiros = new JLabel("Quantidade de Passageiros");
    JLabel lblPlaca = new JLabel("Placa");
    JLabel lblMarca = new JLabel("Marca");
    JLabel lblModelo = new JLabel("Modelo");
    JLabel lblCor = new JLabel("Cor");
    JLabel lblQtdRodas = new JLabel("Quantidade de Rodas");
    JLabel lblVelocMax = new JLabel("Velocidade Máxima");
    JLabel lblPistoes = new JLabel("Pistoes");
    JLabel lblPotencia = new JLabel("Potencia");
    JTextField txtQtdPassageiros = new JTextField(10);
    JTextField txtPlaca = new JTextField(10);
    JTextField txtMarca = new JTextField(10);
    JTextField txtModelo = new JTextField(10);
    JTextField txtCor = new JTextField(10);
    JTextField txtQtdRodas = new JTextField(10);
    JTextField txtVelocMax = new JTextField(10);
    JTextField txtPistoes = new JTextField(10);
    JTextField txtPotencia = new JTextField(10);
    JButton btnCadPasseio = new JButton("Cadastrar");
    JButton btnLimpar = new JButton("Limpar");
    JButton btnVoltar = new JButton("Voltar");


    int altura = 500,largura = 300;

    public TelaCadVeicPass(){

        frameCadVeicPasseio.setSize(largura,altura);
        frameCadVeicPasseio.add(painelCadVeicPasseio);

        painelCadVeicPasseio.setLayout(new BoxLayout(painelCadVeicPasseio, BoxLayout.Y_AXIS));

        JPanel qtdPassageiros = new JPanel(new FlowLayout(FlowLayout.LEFT));
        qtdPassageiros.add(lblQtdPassageiros);
        qtdPassageiros.add(txtQtdPassageiros);

        JPanel placa = new JPanel(new FlowLayout(FlowLayout.LEFT));
        placa.add(lblPlaca);
        placa.add(txtPlaca);

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
        botoes.add(btnCadPasseio);
        botoes.add(btnLimpar);
        botoes.add(btnVoltar);

        painelCadVeicPasseio.add(qtdPassageiros);
        painelCadVeicPasseio.add(placa);
        painelCadVeicPasseio.add(marca);
        painelCadVeicPasseio.add(modelo);
        painelCadVeicPasseio.add(cor);
        painelCadVeicPasseio.add(qtdRodas);
        painelCadVeicPasseio.add(velocMax);
        painelCadVeicPasseio.add(pistoes);
        painelCadVeicPasseio.add(potencia);
        painelCadVeicPasseio.add(botoes);

        frameCadVeicPasseio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameCadVeicPasseio.setLocationRelativeTo(null);

        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frameCadVeicPasseio.dispose();
                TelaPasseio veicPasseio = new TelaPasseio();
                veicPasseio.mostrarTelaPasseio();
            }
        });

        btnCadPasseio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cadastrarPasseio();
            }
        });

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                limparCampos();
            }
        });

    }

    public void mostrarTelaCadastroPasseio(){
        frameCadVeicPasseio.setVisible(true);
    }

    public void limparCampos(){
        txtQtdPassageiros.setText("");
        txtPlaca.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtCor.setText("");
        txtQtdRodas.setText("");
        txtVelocMax.setText("");
        txtPistoes.setText("");
        txtPotencia.setText("");
    }

    public void cadastrarPasseio(){

        try{
            BDVeiculos listaPasseio = BDVeiculos.getInstancia();
            Passeio p = new Passeio();
            p.setQtdPassageiros(Integer.parseInt(txtQtdPassageiros.getText()));
            p.setPlaca(txtPlaca.getText());
            p.setMarca(txtMarca.getText());
            p.setModelo(txtModelo.getText());
            p.setCor(txtCor.getText());
            p.setQtdRodas(Integer.parseInt(txtQtdRodas.getText()));
            p.setVelocMax(Float.parseFloat(txtVelocMax.getText()));
            p.getMotor().setPotencia(Integer.parseInt(txtPotencia.getText()));
            p.getMotor().setQtdPist(Integer.parseInt(txtPistoes.getText()));
            p.calcular();

            listaPasseio.cadastrarVeiculoPass(p);

            JOptionPane.showMessageDialog(null, "Veículo cadastrado com sucesso!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Passeio");
        }


    }

}

