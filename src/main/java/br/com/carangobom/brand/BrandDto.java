package br.com.carangobom.brand;

import br.com.carangobom.domain.Brand;

public class BrandDto {

    private String name;

    public BrandDto(Brand source) {
        this.name = source.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
