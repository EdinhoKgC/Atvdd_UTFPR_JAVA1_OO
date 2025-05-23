package org.example.telas.carga.escolhas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaConDelTodosCarga {

    JFrame frameConsDelTodosCarga = new JFrame("Consultar/Deletar Todos os Veiculos");
    JPanel painelConsDelTodosCarga = new JPanel();
    JButton btnImprimirTodosCarga = new JButton("Imprimir Todos");
    JButton btnExcluirTodosCarga = new JButton("Excluir Todos");
    JButton btnVoltar = new JButton("Voltar");
    JTable tabelaVeicCarga;
    DefaultTableModel modeloTabelaCarga;
    JScrollPane scrollPaneCarga;

    int altura = 300,largura = 600;

    String[] colunasCarga = {
            "Tara",
            "Carga Máxima",
            "Placa",
            "Marca",
            "Modelo",
            "Cor",
            "Qtd Rodas",
            "Veloc Máxima (CM/H)",
            "Pistões",
            "Potência"
    };


    Object[][] dadosExemploCarga = {
            {"800", "3000", "JKL1234", "Mercedes", "Accelo", "Branco", "6", "90", "4", "2.2"},
            {"1200", "5000", "MNO5678", "Volvo", "VM", "Cinza", "8", "100", "6", "3.0"},
            {"1000", "4000", "PQR9012", "Scania", "P360", "Vermelho", "10", "95", "8", "4.5"},
            {"800", "3000", "JKL1234", "Mercedes", "Accelo", "Branco", "6", "90", "4", "2.2"},
            {"1200", "5000", "MNO5678", "Volvo", "VM", "Cinza", "8", "100", "6", "3.0"},
            {"1000", "4000", "PQR9012", "Scania", "P360", "Vermelho", "10", "95", "8", "4.5"},
            {"800", "3000", "JKL1234", "Mercedes", "Accelo", "Branco", "6", "90", "4", "2.2"},
            {"1200", "5000", "MNO5678", "Volvo", "VM", "Cinza", "8", "100", "6", "3.0"},
            {"1000", "4000", "PQR9012", "Scania", "P360", "Vermelho", "10", "95", "8", "4.5"},
            {"800", "3000", "JKL1234", "Mercedes", "Accelo", "Branco", "6", "90", "4", "2.2"},
            {"1200", "5000", "MNO5678", "Volvo", "VM", "Cinza", "8", "100", "6", "3.0"},
            {"1000", "4000", "PQR9012", "Scania", "P360", "Vermelho", "10", "95", "8", "4.5"},
            {"800", "3000", "JKL1234", "Mercedes", "Accelo", "Branco", "6", "90", "4", "2.2"},
            {"1200", "5000", "MNO5678", "Volvo", "VM", "Cinza", "8", "100", "6", "3.0"},
            {"1000", "4000", "PQR9012", "Scania", "P360", "Vermelho", "10", "95", "8", "4.5"},
            {"800", "3000", "JKL1234", "Mercedes", "Accelo", "Branco", "6", "90", "4", "2.2"},
            {"1200", "5000", "MNO5678", "Volvo", "VM", "Cinza", "8", "100", "6", "3.0"},
            {"1000", "4000", "PQR9012", "Scania", "P360", "Vermelho", "10", "95", "8", "4.5"},
            {"800", "3000", "JKL1234", "Mercedes", "Accelo", "Branco", "6", "90", "4", "2.2"},
            {"1200", "5000", "MNO5678", "Volvo", "VM", "Cinza", "8", "100", "6", "3.0"},
            {"1000", "4000", "PQR9012", "Scania", "P360", "Vermelho", "10", "95", "8", "4.5"},
            {"800", "3000", "JKL1234", "Mercedes", "Accelo", "Branco", "6", "90", "4", "2.2"},
            {"1200", "5000", "MNO5678", "Volvo", "VM", "Cinza", "8", "100", "6", "3.0"},
            {"1000", "4000", "PQR9012", "Scania", "P360", "Vermelho", "10", "95", "8", "4.5"}
    };



    public TelaConDelTodosCarga() {
        frameConsDelTodosCarga.setSize(largura, altura);
        frameConsDelTodosCarga.add(painelConsDelTodosCarga);

        painelConsDelTodosCarga.setLayout(new BorderLayout());

        JPanel painelTabelaCarga = new JPanel(new BorderLayout());
        modeloTabelaCarga = new DefaultTableModel(dadosExemploCarga, colunasCarga);
        tabelaVeicCarga = new JTable(modeloTabelaCarga);
        scrollPaneCarga = new JScrollPane(tabelaVeicCarga);
        scrollPaneCarga.setPreferredSize(new Dimension(largura, 200));
        painelTabelaCarga.add(scrollPaneCarga, BorderLayout.CENTER);

        JPanel painelBotoesCarga = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        painelBotoesCarga.add(btnVoltar);
        painelBotoesCarga.add(btnExcluirTodosCarga);
        painelBotoesCarga.add(btnImprimirTodosCarga);

        frameConsDelTodosCarga.add(painelTabelaCarga, BorderLayout.CENTER);
        frameConsDelTodosCarga.add(painelBotoesCarga, BorderLayout.SOUTH);

        frameConsDelTodosCarga.setLocationRelativeTo(null);
        frameConsDelTodosCarga.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frameConsDelTodosCarga.dispose();
            }
        });

    }

    public void mostrarTelaConDelTodosCarga(){
        frameConsDelTodosCarga.setVisible(true);
    }
}
