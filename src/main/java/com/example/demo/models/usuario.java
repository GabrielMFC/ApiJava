package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Usuários")
public class usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(nullable = false)
    private String Nome;

    @Column(nullable = false)
    private String CEP;

    @Column(nullable = false)
    private String Rua;

    @Column(nullable = false)
    private String Numero;

    @Column(nullable = false)
    private String Bairro;

    private String Complemento;

    @Column(nullable = false)
    private String Cidade;

    @Column(nullable = false)
    private String Estado;

    public usuario(String nome, String cEP, String rua, String numero, String bairro, String complemento, String cidade,String estado) {
        Nome = nome;
        CEP = cEP;
        Rua = rua;
        Numero = numero;
        Bairro = bairro;
        Complemento = complemento;
        Cidade = cidade;
        Estado = estado;
    }
    public usuario(){
    }

    public long getId() {
        return Id;
    }
    public void setId(long id) {
        Id = id;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getCEP() {
        return CEP;
    }
    public void setCEP(String cEP) {
        CEP = cEP;
    }
    public String getRua() {
        return Rua;
    }
    public void setRua(String rua) {
        Rua = rua;
    }
    public String getNumero() {
        return Numero;
    }
    public void setNumero(String numero) {
        Numero = numero;
    }
    public String getBairro() {
        return Bairro;
    }
    public void setBairro(String bairro) {
        Bairro = bairro;
    }
    public String getComplemento() {
        return Complemento;
    }
    public void setComplemento(String complemento) {
        Complemento = complemento;
    }
    public String getCidade() {
        return Cidade;
    }
    public void setCidade(String cidade) {
        Cidade = cidade;
    }
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String estado) {
        Estado = estado;
    }
}
