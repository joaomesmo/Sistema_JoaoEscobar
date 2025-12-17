/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.JceVendas;
import bean.JceVendasProdutos;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
/**
 *
 * @author Caio
 */
public class VendasProdutosDAO extends DAOAbstract {
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
    
    public void deleteProdutos(JceVendas jceVendas) {
        //listar todos os produtos do pedido
        List lista = (List) listProdutos(jceVendas);
        //deleta  a lista acima 
        session.beginTransaction();
        for (int i = 0; i < lista.size(); i++) {
            JceVendasProdutos jceVendasProdutos = (JceVendasProdutos) lista.get(i);
            //delete(pedidosProdutos);
            session.flush();
            session.clear();
            session.delete(jceVendasProdutos);
        }
    }

    @Override
    public Object list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JceVendasProdutos.class);
        criteria.add(Restrictions.eq("jce_idVendasProdutos", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public Object listProdutos(JceVendas jceVendas) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JceVendasProdutos.class);
        criteria.add(Restrictions.eq("jcevendas", jceVendas));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JceVendasProdutos.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public static void main(String[] args) {
        ClientesDAO clientesDAO = new ClientesDAO();
        clientesDAO.listAll();
    }
}
