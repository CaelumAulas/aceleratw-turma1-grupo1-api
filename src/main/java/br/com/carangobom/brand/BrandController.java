package br.com.carangobom.brand;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brands")
@AllArgsConstructor
public class BrandController {

    private final BrandService service;

    @GetMapping
    public List<BrandDto> list() {
        return service.ListAll();
    }

    @PostMapping
    public ResponseEntity<BrandDto> persistBrand(@RequestBody BrandForm brandForm) {
        service.save(brandForm);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<BrandDto> delete(@RequestBody Long id) {
        if (service.delete(id)) {
            return new ResponseEntity<>(HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
