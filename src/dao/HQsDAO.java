/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.JceHqs;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Caio
 */
public class HQsDAO extends DAOAbstract {
    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JceHqs.class);
        criteria.add(Restrictions.eq("idhqs", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public Object listNomeH(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(HQsDAO.class);
        criteria.add(Restrictions.like("jceNome", "%"+"%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public Object listNomeC(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(HQsDAO.class);
        criteria.add(Restrictions.like("jceCriador", "%"+"%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public Object listNomeHC(String nome, double valorUnitario) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(HQsDAO.class);
        criteria.add(Restrictions.like("jceNome", "%"+"%"));
        criteria.add(Restrictions.like("jceCriador", "%"+"%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JceHqs.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
}
