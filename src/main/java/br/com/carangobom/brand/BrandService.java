package br.com.carangobom.brand;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BrandService {

    @Autowired
    private BrandRepository repository;

    @Autowired
    private BrandViewMapper viewMapper;

    public List<BrandDto> ListAll() {
        return repository.findAll().stream().map(viewMapper::map).collect(Collectors.toList());
    }
}
