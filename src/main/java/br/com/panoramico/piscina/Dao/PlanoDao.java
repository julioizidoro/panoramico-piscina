/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.panoramico.piscina.Dao;

import br.com.panoramico.piscina.model.Plano;
import javax.ejb.Stateless;

/**
 *
 * @author Julio
 */

@Stateless
public class PlanoDao extends AbstractDao<Plano>{

    public PlanoDao() {
        super(Plano.class);
    }
    
}
