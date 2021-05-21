package br.com.carangobom.brand;

import br.com.carangobom.domain.Brand;
import br.com.carangobom.infra.Mapper;
import org.springframework.stereotype.Component;

@Component
public class BrandViewMapper implements Mapper<Brand, BrandDto> {

    @Override
    public BrandDto map(Brand source) {
        return new BrandDto(source);
    }
}
