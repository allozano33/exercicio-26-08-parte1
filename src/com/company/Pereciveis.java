package com.company;

import com.company.model.Product;

public class Pereciveis extends Product {

    Integer daysPorCaducar;

    public Pereciveis(String name, Double price, Integer daysPorCaducar) {
        this.daysPorCaducar=daysPorCaducar;
        super(name, price);
    }

    public Integer getDaysPorCaducar() {
        return daysPorCaducar;
    }

    public void setDaysPorCaducar(Integer daysPorCaducar) {
        this.daysPorCaducar = daysPorCaducar;

    }

    public String toString() {
            return "Pessoa{" +
                    "Nome='" + daysPorCaducar + '\''+
                    '}';
    }
}




