package br.com.panoramico.piscina.Dao;

import br.com.panoramico.piscina.model.Notificacao;
import javax.ejb.Stateless;

@Stateless
public class NotificacaoDao extends AbstractDao<Notificacao>{
    
    public NotificacaoDao() {
        super(Notificacao.class);
    }
    
}
