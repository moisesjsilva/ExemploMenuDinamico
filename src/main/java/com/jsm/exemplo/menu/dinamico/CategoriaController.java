/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.exemplo.menu.dinamico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author moises
 */
public class CategoriaController {

    public static List<Categoria> categorias() {
        List<Categoria> lista = new ArrayList<>();
        Long id = 1L;
        lista.add(new Categoria(id++, "LAN", "Lanche", "http://wfarm3.dataknet.com/static/resources/icons/set41/de4d7870.png"));
        lista.add(new Categoria(id++, "SGD", "Salgado", "http://www.guiafeurosa.com.br/files/guia/135/100-salgados-fritos-para-festa.jpg"));
        lista.add(new Categoria(id++, "REF", "Refrigerante", "https://sushisdohobbit.com/images/35_refris.jpg"));
        lista.add(new Categoria(id++, "PTZ", "Pizza", "https://media1.fdncms.com/sacurrent/imager/u/blog/2551009/pizza_drake.jpg?cb=1473812431"));
        lista.add(new Categoria(id++, "SBZ", "Sobremesa", "http://img.app.kiwi/icon/MeTS4FghF7boX_RcYZjxSm6kxwxzL8YutHJ7TkXfSk0Exf9VxhT-5j1vDB_wiQmjbOo"));

        return lista;
    }
}
