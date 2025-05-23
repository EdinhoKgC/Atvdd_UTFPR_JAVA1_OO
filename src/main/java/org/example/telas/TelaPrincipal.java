package org.example.telas;
import org.example.telas.carga.TelaCarga;
import org.example.telas.passeio.TelaPasseio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TelaPrincipal {

    JFrame framePrincipal = new JFrame("Gestão de Veiculos");
    JPanel painelMain = new JPanel();
    JLabel lblPasseio = new JLabel("Passeio");
    JLabel lblCarga = new JLabel("Carga");
    JButton btnPasseio = new JButton("Gerenciar Veiculos de Passeio");
    JButton btnCarga = new JButton("Gerenciar Veiculos de Carga");

    int altura = 250,largura = 300;

    public TelaPrincipal() {

        framePrincipal.setSize(largura, altura);
        framePrincipal.add(painelMain);

        painelMain.setLayout(new BoxLayout(painelMain, BoxLayout.Y_AXIS));

        JPanel linha1Passeio = new JPanel(new FlowLayout(FlowLayout.LEFT));
        linha1Passeio.add(lblPasseio);
        linha1Passeio.add(btnPasseio);

        JPanel linha2Carga = new JPanel(new FlowLayout(FlowLayout.LEFT));
        linha2Carga.add(lblCarga);
        linha2Carga.add(btnCarga);

        painelMain.add(linha1Passeio);
        painelMain.add(linha2Carga);

        framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePrincipal.setLocationRelativeTo(null);

        btnPasseio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                TelaPasseio veicPasseio = new TelaPasseio();
                veicPasseio.mostrarTelaPasseio();
                framePrincipal.dispose();
            }
        });

        btnCarga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                TelaCarga veicCarga = new TelaCarga();
                veicCarga.mostrarTelaCarga();
                framePrincipal.dispose();
            }
        });

    }

    public void mostrarTelaPrincipal(){
        framePrincipal.setVisible(true);
    }

}
