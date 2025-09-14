package com.teste.Estoque_minis_api.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "modelos")
public class Modelos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String token;
    private String marca;
    private String modelo;
    private String escala;
    private String fabricante;
    @JsonIgnore // Importante para ocultar itens do json
    private String idLong = "" + Id;


    public Modelos(){}

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getIdLong() {
        return idLong;
    }

    public void setIdLong(String idLong) {
        this.idLong = idLong;
    }

    @Override
    public String toString() {
        return "Modelos{" +
                "Marca='" + marca + '\'' +
                ", Modelo='" + modelo + '\'' +
                ", Escala='" + escala + '\'' +
                ", Fabricante='" + fabricante + '\'' +
                '}';

    }
}