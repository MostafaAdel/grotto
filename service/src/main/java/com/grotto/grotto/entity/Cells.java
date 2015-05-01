/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.grotto.grotto.entity;

import java.io.Serializable;


/**
 *
 * @author dina
 */
public class Cells implements Serializable{
    protected int id;
    protected int min_weight;
    protected Nodes node;

    public int getId() {
        return id;
    }

    public Cells() {
    }

    public Cells(int id, int min_weight, Nodes node) {
        this.id = id;
        this.min_weight = min_weight;
        this.node = node;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMin_weight() {
        return min_weight;
    }

    public void setMin_weight(int min_weight) {
        this.min_weight = min_weight;
    }

    public Nodes getNode() {
        return node;
    }

    public void setNode(Nodes node) {
        this.node = node;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cells other = (Cells) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
}
