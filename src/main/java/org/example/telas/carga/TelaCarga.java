package org.example.telas.carga;

import org.example.telas.Carga.escolhas.TelaConsDelPlacaCarga;
import org.example.telas.carga.escolhas.TelaConDelTodosCarga;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCarga {

    JFrame frameVeicCarga = new JFrame("Veiculos de Carga");
    JPanel painelVeicCargaMain = new JPanel();
    JButton btnCadCarga = new JButton("Cadastrar Veiculo de Carga");
    JButton btnConsultaDeletaPlaca = new JButton("Consultar/Deletar Veiculo por Placa");
    JButton btnConsultaDeletaTodos = new JButton("Consultar/Deletar Todos os Veiculos");
    JButton btnVoltar = new JButton("Voltar");



    int altura = 250,largura = 300;

    public TelaCarga() {

        frameVeicCarga.setSize(largura, altura);
        frameVeicCarga.add(painelVeicCargaMain);

        painelVeicCargaMain.setLayout(new BoxLayout(painelVeicCargaMain, BoxLayout.Y_AXIS));

        JPanel painelCadVeicCarga = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painelCadVeicCarga.add(btnCadCarga);

        JPanel painelConsultaDeletaPlaca = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painelConsultaDeletaPlaca.add(btnConsultaDeletaPlaca);

        JPanel painelConsultaDeletaTodos = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painelConsultaDeletaTodos.add(btnConsultaDeletaTodos);

        JPanel painelVoltar = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painelVoltar.add(btnVoltar);

        painelVeicCargaMain.add(painelCadVeicCarga);
        painelVeicCargaMain.add(painelConsultaDeletaPlaca);
        painelVeicCargaMain.add(painelConsultaDeletaTodos);
        painelVeicCargaMain.add(painelVoltar);

        frameVeicCarga.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameVeicCarga.setLocationRelativeTo(null);

        btnCadCarga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                org.example.telas.Carga.escolhas.TelaCadVeicCarga telaCadVeicCarga = new org.example.telas.Carga.escolhas.TelaCadVeicCarga();
                telaCadVeicCarga.mostrarTelaCadastroCarga();
            }
        });

        btnConsultaDeletaPlaca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                TelaConsDelPlacaCarga telaConsDelPlacaCarga = new TelaConsDelPlacaCarga();
                telaConsDelPlacaCarga.mostrarTelaConsDelCadastroCarga();
            }
        });

        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frameVeicCarga.dispose();
            }
        });

        btnConsultaDeletaTodos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frameVeicCarga.dispose();
            }
        });

        btnConsultaDeletaTodos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                TelaConDelTodosCarga telaConDelTodosCarga = new TelaConDelTodosCarga();
                telaConDelTodosCarga.mostrarTelaConDelTodosCarga();
            }
        });
    }

    public void mostrarTelaCarga(){
        frameVeicCarga.setVisible(true);
    }

}
