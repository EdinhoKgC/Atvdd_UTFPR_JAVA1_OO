package org.example.telas.passeio.escolhas;

import org.example.BD.BDVeiculos;
import org.example.Passeio;
import org.example.telas.passeio.TelaPasseio;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaConDelTodosPass {

    JFrame frameConsDelTodosPass = new JFrame("Consultar/Deletar Todos os Veiculos");
    JPanel painelConsDelTodosPass = new JPanel();
    JButton btnImprimirTodosPass = new JButton("Imprimir Todos");
    JButton btnExcluirTodosPass = new JButton("Excluir Todos");
    JButton btnVoltar = new JButton("Voltar");
    JTable tabelaVeicPass;
    DefaultTableModel modeloTabelaPass;
    JScrollPane scrollPanePass;

    int altura = 300,largura = 600;

    String[] colunasPass = {
            "Placa",
            "Marca",
            "Modelo",
            "Cor",
            "Qtd Passageiros",
            "Qtd Rodas",
            "Veloc Máxima (M/H)",
            "Pistões",
            "Potência",
            "Qtd Letras"
    };

    BDVeiculos bdVeiculos = BDVeiculos.getInstancia();

    public List<Passeio> imprimirTodos(){

        List<Passeio> passeio = bdVeiculos.getListaPasseio();

        if(passeio.isEmpty()){
            JOptionPane.showMessageDialog(null, "Não existem veículos de PASSEIO cadastrados");
            return null;
        }
        else{
            for(Passeio p : passeio){
                String[] dadosPass = {
                        p.getPlaca(),
                        p.getMarca(),
                        p.getModelo(),
                        p.getCor(),
                        String.valueOf(p.getQtdPassageiros()),
                        String.valueOf(p.getQtdRodas()),
                        String.valueOf(p.getVelocMax()),
                        String.valueOf(p.getMotor().getQtdPist()),
                        String.valueOf(p.getMotor().getPotencia()),
                        String.valueOf(p.calcular())
                };
                modeloTabelaPass.addRow(dadosPass);

            }
        }
        return passeio;
    }



    public TelaConDelTodosPass() {
        frameConsDelTodosPass.setSize(largura, altura);
        frameConsDelTodosPass.add(painelConsDelTodosPass);

        painelConsDelTodosPass.setLayout(new BorderLayout());

        JPanel painelTabelaPass = new JPanel(new BorderLayout());
        modeloTabelaPass = new DefaultTableModel(colunasPass, 0);
        tabelaVeicPass = new JTable(modeloTabelaPass);
        scrollPanePass = new JScrollPane(tabelaVeicPass);
        scrollPanePass.setPreferredSize(new Dimension(largura, 200));
        painelTabelaPass.add(scrollPanePass, BorderLayout.CENTER);

        JPanel painelBotoesPass = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        painelBotoesPass.add(btnVoltar);
        painelBotoesPass.add(btnExcluirTodosPass);
        painelBotoesPass.add(btnImprimirTodosPass);

        frameConsDelTodosPass.add(painelTabelaPass, BorderLayout.CENTER);
        frameConsDelTodosPass.add(painelBotoesPass, BorderLayout.SOUTH);

        frameConsDelTodosPass.setLocationRelativeTo(null);
        frameConsDelTodosPass.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frameConsDelTodosPass.dispose();
                TelaPasseio veicPasseio = new TelaPasseio();
                veicPasseio.mostrarTelaPasseio();
            }
        });

        btnImprimirTodosPass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                imprimirTodos();
            }
        });

    }

    public void mostrarTelaConsultaTodosPass(){
        frameConsDelTodosPass.setVisible(true);
    }
}
