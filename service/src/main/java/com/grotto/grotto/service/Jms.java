/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.grotto.grotto.service;

import com.grotto.grotto.entity.Cells;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
/**
 *
 * @author dina
 */
public class Jms implements JmsInt{
private JmsTemplate template;

    public Jms(JmsTemplate template) {
        this.template = template;
    }


    @Override
    public void send(String queue) {
        template.send(queue,new MessageCreator() {

            @Override
            public Message createMessage(Session sn) throws JMSException {
               Cells c = new Cells(1000,50,null);
                ObjectMessage oM=sn.createObjectMessage(c);
 
                return oM;
            }
        });
    }
    
}
