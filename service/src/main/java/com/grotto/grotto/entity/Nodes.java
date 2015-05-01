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
public class Nodes implements Serializable{
    protected int id;
    protected String type;

    public Nodes() {
    }

    public Nodes(int id, String type, String ip) {
        this.id = id;
        this.type = type;
        this.ip = ip;
    }
    protected String ip;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.id;
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
        final Nodes other = (Nodes) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
}

