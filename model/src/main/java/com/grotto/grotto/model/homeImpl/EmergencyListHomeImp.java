/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grotto.grotto.model.homeImpl;

import com.grotto.grotto.model.home.AbstractDaoInt;
import com.grotto.grotto.model.home.pojo.EmergencyList;


/**
 *
 * @author Mostafa_ITI
 */
public class EmergencyListHomeImp extends AbstractDaoImp<EmergencyList, Integer> implements AbstractDaoInt<EmergencyList, Integer>{

    public EmergencyListHomeImp() {
        setClassInstance(EmergencyList.class);
    }
    
}
