/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grotto.grotto.model.homeImpl;


import com.grotto.grotto.model.home.AbstractDaoInt;
import dao.AbstractDaoImp;
import java.io.Serializable;
import com.grotto.grotto.model.home.pojo.ProductBrands;

/**
 *
 * @author Mostafa_ITI
 */
public class ProductBrandsHomeImp extends AbstractDaoImp<ProductBrands,Integer> implements AbstractDaoInt<ProductBrands, Integer>{

    public ProductBrandsHomeImp() {
        setClassInstance(ProductBrands.class);
    }
    
}
