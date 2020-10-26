package kz.kazdream.controller;


import kz.kazdream.model.dto.SpecDTO;
import kz.kazdream.service.SpecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/spec")
public class SpecController {

    @Autowired
    private SpecService specService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public SpecDTO createSpecDto(@RequestBody SpecDTO specDTO) {
        return specService.saveSpec(specDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOneById(@PathVariable("id") Long id) {
        specService.deleteByOneId(id);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public SpecDTO getOneById(@PathVariable("id") Long id) {
        return specService.getOneById(id);
    }
    @PostMapping("/{id}")
    @ResponseBody
    public SpecDTO updateOneById(@PathVariable("id") Long id, @RequestBody SpecDTO specDTO) {
        return  specService.updateByOneId(id, specDTO);
    }

    @GetMapping
    @ResponseBody
    public List<SpecDTO> getAll() {
        return specService.getAll();
    }

    @GetMapping("/search/body/{body}")
    @ResponseBody
    public List<SpecDTO> getAllByBody(@PathVariable("body") String body) {
        return specService.getAllByBody(body);
    }

    @GetMapping("/search/model/{model}")
    @ResponseBody
    public List<SpecDTO> getAllByModel(@PathVariable("model") String model) {
        return specService.getAllByModel(model);
    }

    @GetMapping("/search/maxSpeed/{maxSpeed}")
    @ResponseBody
    public List<SpecDTO> getAllByMaxSpeed(@PathVariable("maxSpeed") Integer maxSpeed) {
        return specService.getAllByMaxSpeed(maxSpeed);
    }
}
