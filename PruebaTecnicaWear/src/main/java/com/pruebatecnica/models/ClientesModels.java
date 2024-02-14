package com.pruebatecnica.models;

import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class ClientesModels {

    private  String id;
    private  String nombreempresa;
    private  String contacto;
    private  String titulo;
    private  String representante;
    private  String direccion;
    private  String pais;
    private  String region;
    private  String telefono;
    private  String ciudad;
    private  String postal;
    private  String fax;
    private  String fecha;
    private String ultimocontacto;
    private String email;





    public ClientesModels(DataTable travelCommunityFilters) {
        List<Map<String, String>> travelCommunityFilter = travelCommunityFilters.asMaps(String.class, String.class);
        this.id = travelCommunityFilter.get(0).get("id");
        this.nombreempresa = travelCommunityFilter.get(0).get("nombreempresa");
        this.contacto = travelCommunityFilter.get(0).get("contacto");
        this.titulo = travelCommunityFilter.get(0).get("titulo");
        this.representante = travelCommunityFilter.get(0).get("representante");
        this.direccion = travelCommunityFilter.get(0).get("direccion");
        this.pais = travelCommunityFilter.get(0).get("pais");
        this.region = travelCommunityFilter.get(0).get("region");
        this.telefono = travelCommunityFilter.get(0).get("telefono");
        this.ciudad = travelCommunityFilter.get(0).get("ciudad");
        this.postal = travelCommunityFilter.get(0).get("postal");
        this.fax = travelCommunityFilter.get(0).get("fax");
        this.fecha = travelCommunityFilter.get(0).get("fecha");
        this.ultimocontacto = travelCommunityFilter.get(0).get("ultimocontacto");
        this.email = travelCommunityFilter.get(0).get("email");



}

    public String getId() {
        return id;
    }

    public String getNombreempresa() {
        return nombreempresa;
    }

    public String getContacto() {
        return contacto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getRepresentante() {
        return representante;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getPais() {
        return pais;
    }

    public String getRegion() {
        return region;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPostal() {
        return postal;
    }

    public String getFax() {
        return fax;
    }

    public String getFecha() {
        return fecha;
    }

    public String getUltimocontacto() {
        return ultimocontacto;
    }

    public String getEmail() {
        return email;
    }
}