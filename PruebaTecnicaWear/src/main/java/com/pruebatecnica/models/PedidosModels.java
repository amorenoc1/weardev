package com.pruebatecnica.models;

import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class PedidosModels {

    private String nombreempresa  ;
    private String nombreproducto;
    private String fechapedido ;
    private String preciou;
    private String cantidad;
    private String descuento;


    public PedidosModels(DataTable travelCommunityFilters) {
        List<Map<String, String>> travelCommunityFilter = travelCommunityFilters.asMaps(String.class, String.class);
        this.nombreempresa = travelCommunityFilter.get(0).get("nombreempresa");
        this.nombreproducto = travelCommunityFilter.get(0).get("nombreproducto");
        this.fechapedido = travelCommunityFilter.get(0).get("fechapedido");
        this.preciou = travelCommunityFilter.get(0).get("preciou");
        this.cantidad = travelCommunityFilter.get(0).get("cantidad");
        this.descuento = travelCommunityFilter.get(0).get("descuento");

    }

    public String getNombreempresa() {
        return nombreempresa;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public String getFechapedido() {
        return fechapedido;
    }

    public String getPreciou() {
        return preciou;
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getDescuento() {
        return descuento;
    }
}
