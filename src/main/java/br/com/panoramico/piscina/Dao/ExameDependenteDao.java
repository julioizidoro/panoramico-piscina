/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.panoramico.piscina.Dao;

import br.com.panoramico.piscina.model.Examedependente;
import javax.ejb.Stateless;

@Stateless
public class ExameDependenteDao extends AbstractDao<Examedependente>{
    
    public ExameDependenteDao() {
        super(Examedependente.class);
    }
    
}
