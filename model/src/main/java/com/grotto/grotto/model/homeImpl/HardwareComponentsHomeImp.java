/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grotto.grotto.model.homeImpl;


import com.grotto.grotto.model.home.AbstractDaoInt;
import com.grotto.grotto.model.home.pojo.HardwareComponents;

/**
 *
 * @author Mostafa_ITI
 */
public class HardwareComponentsHomeImp extends AbstractDaoImp<HardwareComponents, Integer> implements AbstractDaoInt<HardwareComponents, Integer>{

    public HardwareComponentsHomeImp() {
        setClassInstance(HardwareComponents.class);
    }
    
}
