package com.pruebatecnica.models;

import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class InicioSesionModels {

    private  String user;
    private  String pass;


    public InicioSesionModels(DataTable travelCommunityFilters) {
        List<Map<String, String>> travelCommunityFilter = travelCommunityFilters.asMaps(String.class, String.class);
        this.user = travelCommunityFilter.get(0).get("user");
        this.pass = travelCommunityFilter.get(0).get("pass");
    }

    public String getPass() {
        return pass;
    }

    public String getUser() {
        return user;
    }
}


