package br.com.carangobom.brand;

import br.com.carangobom.domain.Brand;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BrandService {

    @Autowired
    private BrandRepository repository;

    @Autowired
    private BrandViewMapper viewMapper;

    @Autowired
    private BrandFormMapper formMapper;

    public List<BrandDto> ListAll() {
        return repository.findAll().stream().map(viewMapper::map).collect(Collectors.toList());
    }

    public void save(BrandForm brandForm) {
        var brand = formMapper.map(brandForm);
        repository.save(brand);
    }

    public boolean delete(Long id) {
        Optional<Brand> brand = repository.findById(id);

        if (brand.isEmpty()) {
            return false;
        }

        repository.delete(repository.findById(id).get());
        return true;
    }
}
