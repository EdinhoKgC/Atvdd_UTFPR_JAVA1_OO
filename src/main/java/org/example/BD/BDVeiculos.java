/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.BD;

import java.util.ArrayList;
import java.util.List;
import org.example.Carga;
import org.example.Passeio;
import org.example.Leitura;
import org.example.exceptions.VeicExistException;

/**
 *
 * @author edilson
 */



public class BDVeiculos {
    
    private List<Passeio> listaPasseio = new ArrayList<>();
    private List<Carga> listaCarga = new ArrayList<>();
    private final Leitura l = new Leitura();

    public List<Passeio> getListaPasseio() {
        return listaPasseio;
    }

    public void setListaPasseio(List<Passeio> listaPasseio) {
        this.listaPasseio = listaPasseio;
    }

    public List<Carga> getListaCarga() {
        return listaCarga;
    }

    public void setListaCarga(List<Carga> listaCarga) {
        this.listaCarga = listaCarga;
    }

    private static BDVeiculos instancia = null;

    private BDVeiculos() {

    }

    public static BDVeiculos getInstancia() {
        if (instancia == null) {
            instancia = new BDVeiculos();
        }
        return instancia;
    }

    
    public boolean placaExiste(String placa) {
        for (Passeio p : listaPasseio) {
            if (p != null && p.getPlaca().equalsIgnoreCase(placa)) {
                return true;
            }
        }
        for (Carga c : listaCarga) {
            if (c != null && c.getPlaca().equalsIgnoreCase(placa)) {
                return true;
            }
        }
        return false;
    }

    public void cadastrarVeiculoPass(Passeio p) throws VeicExistException{
        if(placaExiste(p.getPlaca())){
            throw new VeicExistException("Placa já cadastrada");
        }
        listaPasseio.add(p);
    }

    public void cadastrarVeiculoCarga(Carga c) throws VeicExistException{
        if(placaExiste(c.getPlaca())){
            throw new VeicExistException("Placa já cadastrada");
        }
        listaCarga.add(c);
    }


    public void excluirVeiculoPasseio(String placa) throws VeicExistException{
        if(!placaExiste(placa)){
            throw new VeicExistException("Placa não cadastrada");
        }
        for (Passeio p : listaPasseio) {
            if (p != null && p.getPlaca().equalsIgnoreCase(placa)) {
                listaPasseio.remove(p);
                return;
            }
        }
    }
    public void excluirVeiculoCarga(String placa) throws VeicExistException{
        if(!placaExiste(placa)){
            throw new VeicExistException("Placa não cadastrada");
        }
        for (Carga c : listaCarga) {
            if (c != null && c.getPlaca().equalsIgnoreCase(placa)) {
                listaCarga.remove(c);
            }
        }
    }
    public void excluirVeiculoTodosPass(String placa){
        for (Passeio p : listaPasseio) {
            if (p != null) {
                listaPasseio.remove(p);
            }
        }
    }

    public void excluirVeiculoTodosCarga(String placa){
        for (Carga c : listaCarga) {
            if (c != null) {
                listaCarga.remove(c);
            }
        }
    }




}
