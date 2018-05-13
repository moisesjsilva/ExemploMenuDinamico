/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.exemplo.menu.dinamico;

/**
 *
 * @author moises
 */
public class Categoria {

    private Long id;
    private String sigla;
    private String nome;
    private String foto;

    public Categoria() {
    }
    
    public Categoria(Long id) {
        this.id =id;
    }

    public Categoria(Long id, String sigla, String nome, String foto) {
        this.id = id;
        this.sigla = sigla;
        this.nome = nome;
        this.foto = foto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    

    @Override
    public String toString() {
        return "Categoria{" + "id=" + id + ", sigla=" + sigla + ", nome=" + nome + '}';
    }
    
    

}
