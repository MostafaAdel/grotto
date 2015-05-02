/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.grotto.grotto.Main;

import com.grotto.grotto.service.Jms;
import com.grotto.grotto.service.JmsInt;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;


/**
 *
 * @author dina
 */

public class ProducerMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/beans.xml");
        JmsInt template = (JmsInt) ctx.getBean("jmsQueueTemplate");
        template.send("Queue 1");
    }
}
