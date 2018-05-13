/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.exemplo.menu.dinamico;

import java.awt.event.ActionListener;

/**
 *
 * @author moises
 * @param <T>
 */
public interface MenuOnClickListener<T> extends ActionListener{
    void onClick(T object);
}
