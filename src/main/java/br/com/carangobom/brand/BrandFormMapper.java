package br.com.carangobom.brand;

import br.com.carangobom.domain.Brand;
import br.com.carangobom.infra.Mapper;
import org.springframework.stereotype.Component;

@Component
public class BrandFormMapper implements Mapper<BrandForm, Brand> {
    @Override
    public Brand map(BrandForm source) {
        return new Brand(source.getId(), source.getName());
    }
}
