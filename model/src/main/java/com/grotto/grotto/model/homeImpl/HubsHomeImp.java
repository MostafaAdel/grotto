/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grotto.grotto.model.homeImpl;


import com.grotto.grotto.model.home.AbstractDaoInt;
//import dao.AbstractDaoImp;
import java.io.Serializable;
import com.grotto.grotto.model.home.pojo.Hubs;

/**
 *
 * @author Mostafa_ITI
 */
public class HubsHomeImp extends AbstractDaoImp<Hubs, Integer>  implements AbstractDaoInt<Hubs, Integer>{

    public HubsHomeImp() {
        setClassInstance(Hubs.class);
    }
    
}
