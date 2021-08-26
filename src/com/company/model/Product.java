package com.company.model;

public class Product {

    String name;
    Double price;


    public void calcule(Integer quantidadeOfProdutos) {
        Double tot = this.price*quantidadeOfProdutos;
        System.out.println(tot);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuan
}

    public String toString() {
        return "Pessoa{" +
                "Nome='" + name + '\''+
                "'id ='" + price + '\''+
                '}';
    }}
