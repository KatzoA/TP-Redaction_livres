package com.oarano;

import java.util.List;

public class Page {

    // attributs
    private List<String> lignes;

    // constructor
    public Page(List<String>lignes){
    this.lignes = lignes;
    }

    // méthodes
    public List<String>getLigne(){
        return this.lignes;
    }
}
