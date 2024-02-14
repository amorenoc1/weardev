package com.pruebatecnica.models;

import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class ProductoModels {

    private String nombreproducto;
    private String stock;
    private String pedido;
    private String reorden;

    public ProductoModels(DataTable travelCommunityFilters) {
        List<Map<String, String>> travelCommunityFilter = travelCommunityFilters.asMaps(String.class, String.class);
        this.nombreproducto = travelCommunityFilter.get(0).get("nombreproducto");
        this.stock = travelCommunityFilter.get(0).get("stock");
        this.pedido = travelCommunityFilter.get(0).get("pedido");
        this.reorden = travelCommunityFilter.get(0).get("reorden");


    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public String getStock() {
        return stock;
    }

    public String getPedido() {
        return pedido;
    }

    public String getReorden() {
        return reorden;
    }
}