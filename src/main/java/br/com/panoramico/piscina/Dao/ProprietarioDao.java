/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.panoramico.piscina.Dao;

import br.com.panoramico.piscina.model.Proprietario;
import javax.ejb.Stateless;

/**
 *
 * @author Julio
 */

@Stateless
public class ProprietarioDao extends  AbstractDao<Proprietario>{

    public ProprietarioDao() {
        super(Proprietario.class);
    }
    
    
    
}
