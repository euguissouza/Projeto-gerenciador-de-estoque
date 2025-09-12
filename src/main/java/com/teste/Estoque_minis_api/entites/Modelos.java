package com.teste.Estoque_minis_api.entites;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.teste.Estoque_minis_api.repositories.ModeloRepository;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "modelos")
public class Modelos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String idLong = "" + Id;
    private String token;
    private String Marca;
    private String Modelo;
    private String Escala;
    private String Fabricante;



    public Modelos(){}

    public String getIdLong() {
        return idLong;
    }

    public void setIdLong(String idLong) {
        this.idLong = idLong;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getEscala() {
        return Escala;
    }

    public void setEscala(String escala) {
        Escala = escala;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String fabricante) {
        Fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Modelos{" +
                "Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Escala='" + Escala + '\'' +
                ", Fabricante='" + Fabricante + '\'' +
                '}';

    }
}