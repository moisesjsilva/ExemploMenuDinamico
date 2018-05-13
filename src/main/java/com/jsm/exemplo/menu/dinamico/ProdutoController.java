/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.exemplo.menu.dinamico;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author moises
 */
public class ProdutoController {
    public static List<Produto> produtosPorCategoria(Categoria cat) {
        List<Produto> lista = new ArrayList<>();
        
        Long id = 1L;
        lista.add(new Produto(id++, "124", "Coca-cola", "http://wfarm3.dataknet.com/static/resources/icons/set41/de4d7870.png",new BigDecimal("1.25"),new Categoria(3L)));
        lista.add(new Produto(id++, "365", "Fanta", "http://wfarm3.dataknet.com/static/resources/icons/set41/de4d7870.png",new BigDecimal("1.25"),new Categoria(3L)));
        lista.add(new Produto(id++, "758", "Guarana", "http://wfarm3.dataknet.com/static/resources/icons/set41/de4d7870.png",new BigDecimal("1.25"),new Categoria(3L)));
        lista.add(new Produto(id++, "362", "Misto-quente", "http://wfarm3.dataknet.com/static/resources/icons/set41/de4d7870.png",new BigDecimal("1.25"),new Categoria(1L)));
       

 


        List<Produto> produtosPorCategoria = lista.stream()
                .filter(p -> Objects.equals(p.getCategoria().getId(), cat.getId()))
                .collect(Collectors.toList());
        produtosPorCategoria.add(0,new Produto(-1L, "-1", "Voltar", "http://3.bp.blogspot.com/-p-uZQLNS_No/UBuUQukW1LI/AAAAAAAADaE/Qng8EZVGuBY/s200/voltar.jpg",null,null));
        return produtosPorCategoria;
    }
}
