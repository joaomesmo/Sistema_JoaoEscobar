/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.JcePublicadoras;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Caio
 */
public class PublicadorasDAO extends DAOAbstract{
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
        Criteria criteria = session.createCriteria(JcePublicadoras.class);
        criteria.add(Restrictions.eq("jce_idpublicadoras", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public Object listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(HQsDAO.class);
        criteria.add(Restrictions.like("jceNome", "%"+"%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public Object listEmail(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(HQsDAO.class);
        criteria.add(Restrictions.like("jceEmail", "%"+"%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public Object listNomeEmail(String nome, double valorUnitario) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(HQsDAO.class);
        criteria.add(Restrictions.like("jceNome", "%"+"%"));
        criteria.add(Restrictions.like("jceEmail", "%"+"%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JcePublicadoras.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
}
