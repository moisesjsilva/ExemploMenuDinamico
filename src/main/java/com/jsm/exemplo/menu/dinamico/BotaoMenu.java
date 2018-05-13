/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.exemplo.menu.dinamico;

import java.io.Serializable;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

/**
 *
 * @author moises
 */
public class BotaoMenu<T> extends JButton implements Serializable {
    private T object;
    private static final Logger LOG = Logger.getLogger(BotaoMenu.class.getName());

    public BotaoMenu(T object) {
        this.object = object;
    }

    public BotaoMenu(T object, Icon icon) {
        super(icon);
        this.object = object;
    }

    public BotaoMenu(T object, String text) {
        super(text);
        this.object = object;
    }

    public BotaoMenu(T object, Action a) {
        super(a);
        this.object = object;
    }

    public BotaoMenu(T object, String text, Icon icon) {
        super(text, icon);
        this.object = object;
    }

    public T getObject() {
        return object;
    }

   
    
  
    
}
