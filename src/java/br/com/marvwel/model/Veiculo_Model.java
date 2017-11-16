/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.marvwel.model;

import javax.swing.text.StyledEditorKit;

/**
 *
 * @author wellington
 */
public abstract class Veiculo_Model {
    //Atributos
    int codigo;
    CategoriaVeiculo_Model categoria;
    String marca;
    String modelo;
    int anoFabricacao;
    String placa;
    String chassi;
    String potenciaMotor;
    String numeroDePortas;
    String numeroDePassageiros;
    PrecoDiariaVeiculo valorDiaria;
    float valorFranquiSeguro;
    boolean status;
        
}
