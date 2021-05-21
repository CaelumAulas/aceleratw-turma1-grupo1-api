package br.com.carangobom.brand;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
