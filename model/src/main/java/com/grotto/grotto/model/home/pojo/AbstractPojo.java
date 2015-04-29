/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grotto.grotto.model.home.pojo;

/**
 *
 * @author Aliaa
 */
import java.io.Serializable;
import org.apache.commons.lang.builder.HashCodeBuilder;



public abstract class AbstractPojo<T, PK extends Serializable> {

    @Override
    public int hashCode() {

    if (findID() == null) {
            return new HashCodeBuilder(17, 31).append(super.hashCode())
                    .toHashCode();
        } else {
            return new HashCodeBuilder(17, 31).append(findID())
                    .toHashCode();
        }

    }
   
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (! (obj instanceof AbstractPojo)) {
            return false;
        }
        final AbstractPojo<?, ?> other = (AbstractPojo<?, ?>) obj;
        if (this.findID() != other.findID()&& (this.findID() == null || !this.findID().equals(other.findID()))) {
            return false;
        }
        return true;
    }

    public abstract PK findID();
}



