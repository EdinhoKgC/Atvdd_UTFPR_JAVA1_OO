package org.example.telas.passeio;

import org.example.telas.TelaPrincipal;
import org.example.telas.passeio.escolhas.TelaCadVeicPass;
import org.example.telas.passeio.escolhas.TelaConDelTodosPass;
import org.example.telas.passeio.escolhas.TelaConsDelPlacaPass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPasseio {

    JFrame frameVeicPasseio = new JFrame("Veiculos de Passeio");
    JPanel painelVeicPassMain = new JPanel();
    JButton btnCadPasseio = new JButton("Cadastrar Veiculo de Passeio");
    JButton btnConsultaDeletaPlaca = new JButton("Consultar/Deletar Veiculo por Placa");
    JButton btnConsultaDeletaTodos = new JButton("Consultar/Deletar Todos os Veiculos");
    JButton btnVoltar = new JButton("Voltar");



    int altura = 250,largura = 300;

    public TelaPasseio() {

        frameVeicPasseio.setSize(largura, altura);
        frameVeicPasseio.add(painelVeicPassMain);

        painelVeicPassMain.setLayout(new BoxLayout(painelVeicPassMain, BoxLayout.Y_AXIS));

        JPanel painelCadVeicPass = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painelCadVeicPass.add(btnCadPasseio);

        JPanel painelConsultaDeletaPlaca = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painelConsultaDeletaPlaca.add(btnConsultaDeletaPlaca);

        JPanel painelConsultaDeletaTodos = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painelConsultaDeletaTodos.add(btnConsultaDeletaTodos);

        JPanel painelVoltar = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painelVoltar.add(btnVoltar);

        painelVeicPassMain.add(painelCadVeicPass);
        painelVeicPassMain.add(painelConsultaDeletaPlaca);
        painelVeicPassMain.add(painelConsultaDeletaTodos);
        painelVeicPassMain.add(painelVoltar);

        frameVeicPasseio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameVeicPasseio.setLocationRelativeTo(null);

        btnCadPasseio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                TelaCadVeicPass telaCadVeicPass = new TelaCadVeicPass();
                telaCadVeicPass.mostrarTelaCadastroPasseio();
                frameVeicPasseio.dispose();
            }
        });

        btnConsultaDeletaPlaca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                TelaConsDelPlacaPass telaConsDelPlacaPass = new TelaConsDelPlacaPass();
                telaConsDelPlacaPass.mostrarTelaConsDelCadastroPasseio();
            }
        });

        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frameVeicPasseio.dispose();
                TelaPrincipal telaPrincipal = new TelaPrincipal();
                telaPrincipal.mostrarTelaPrincipal();
            }
        });

        btnConsultaDeletaTodos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                TelaConDelTodosPass telaConDelTodosPass = new TelaConDelTodosPass();
                telaConDelTodosPass.mostrarTelaConsultaTodosPass();
                frameVeicPasseio.dispose();
            }
        });
    }

    public void mostrarTelaPasseio(){
        frameVeicPasseio.setVisible(true);
    }



}
