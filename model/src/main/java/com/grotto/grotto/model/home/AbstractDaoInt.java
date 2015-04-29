/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grotto.grotto.model.home;

import java.io.Serializable;
import java.util.List;


/**
 *
 * @author Mostafa_ITI
 * @param <T>
 * @param <PK>
 */
public interface AbstractDaoInt<T, PK extends Serializable> {

    public void create(T obj);

    public T read(PK id);

    public List<T> readAll(T obj);

    public void saveOrUpdate(T obj);

    public void delete(PK id);

    public void beginTransaction();

    public void commmitTransaction();

    public void rollbackTransaction();
}
