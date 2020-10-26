package kz.kazdream.controller;

import kz.kazdream.model.dto.CompanyDTO;
import kz.kazdream.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public CompanyDTO createCompanyDto( @RequestBody CompanyDTO companyDTO ) {
     return companyService.saveCompany(companyDTO);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteOneById(@PathVariable("id") Long id) {
        companyService.deleteOneById(id);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public CompanyDTO getOneById(@PathVariable("id") Long id) {
        return companyService.getOneById(id);
    }

    @PostMapping("/{id}")
    @ResponseBody
    public CompanyDTO updateOneById(@PathVariable("id") Long id, @RequestBody CompanyDTO companyDTO) {
        return companyService.updateOneById(id, companyDTO);
    }

    @GetMapping
    @ResponseBody
    public List<CompanyDTO> getAll() {
        return companyService.getAll();
    }

    @GetMapping("/search/name/{name}")
    @ResponseBody
    public CompanyDTO getOneByName(@PathVariable("name") String name) {
        return companyService.getOneByName(name);
    }

    @GetMapping("/search/ceo/{ceo}")
    @ResponseBody
    public List<CompanyDTO> getAllByCeo(@PathVariable("ceo") String ceo) {
        return companyService.getAllByCeo(ceo);
    }

    @GetMapping("/search/capitalization/{capitalization}")
    @ResponseBody
    public List<CompanyDTO> getAllByCapitalization(@PathVariable("capitalization") Double capitalization) {
        return companyService.getAllByCapitalization(capitalization);
    }
}


