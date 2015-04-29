/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grotto.grotto.model.homeImpl;

import com.grotto.grotto.model.home.AbstractDaoInt;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mostafa_ITI
 */
@Repository
public class AbstractDaoImp<T, PK extends Serializable> implements AbstractDaoInt<T, PK> {

    private Class<T> classInstance;
    Session session;

//    @Autowired
//    public AbstractDaoImp(Class<T> classInstance) {
//        this.classInstance = classInstance;
//        // this.classInstance = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
//
//    }
    public void setClassInstance(Class<T> classInstance) {
        this.classInstance = classInstance;
    }

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected void startOperation() {
        session = sessionFactory.openSession();
     //   tx = session.beginTransaction();
    }

    protected Session getSession() {
        return sessionFactory.openSession();//session pooling
    }

    @Override
    public void beginTransaction() {
        getTransaction();
    }

    protected Transaction getTransaction() {
        Transaction transaction = getSession().getTransaction();
        if (transaction == null) {
            transaction = getSession().beginTransaction();
        }
        return transaction;
    }

    @Override
    public void commmitTransaction() {
        Transaction transaction = getSession().getTransaction();
        transaction.commit();
    }

    @Override
    public void rollbackTransaction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(T obj) {
        startOperation();
        session.persist(obj);
    }

    @Override
    public void delete(PK id) {
        T obj = null;
        obj = read(id);
        startOperation();
        session.delete(obj);
    }

    @Override
    public T read(PK id) {
        T obj = null;
        startOperation();
        obj = (T) session.load(classInstance, id);
        return obj;
    }

    @Override
    public List<T> readAll(T obj) {
        List objects = null;
        startOperation();
        Query query = session.createQuery("from " + obj.getClass().getName());
        // Query query = session.createQuery(String.format("FROM %s", classInstance.getSimpleName())).list();
        objects = query.list();
        return objects;
    }

    @Override
    public void saveOrUpdate(T obj) {
        session.saveOrUpdate(obj);
    }

}
