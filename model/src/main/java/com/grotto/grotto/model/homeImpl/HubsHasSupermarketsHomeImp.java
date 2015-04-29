/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grotto.grotto.model.homeImpl;


import com.grotto.grotto.model.home.AbstractDaoInt;
import com.grotto.grotto.model.home.pojo.HubsHasSupermarkets;

/**
 *
 * @author Mostafa_ITI
 */
public class HubsHasSupermarketsHomeImp extends AbstractDaoImp<HubsHasSupermarkets, Integer> implements AbstractDaoInt<HubsHasSupermarkets, Integer>{

    public HubsHasSupermarketsHomeImp() {
        setClassInstance(HubsHasSupermarkets.class);
    }
    
}
