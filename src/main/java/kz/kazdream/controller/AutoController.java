package kz.kazdream.controller;

import kz.kazdream.model.dto.AutoDTO;
import kz.kazdream.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auto")
public class AutoController {

    @Autowired
    private AutoService autoService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public AutoDTO createAutoDto(@RequestBody AutoDTO autoDTO) {
        return autoService.saveAuto(autoDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOneById(@PathVariable("id") Long id) {
        autoService.deleteOneById(id);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public AutoDTO getOneById(@PathVariable("id") Long id) {
        return autoService.getOneById(id);
    }

    @PostMapping("/{id}")
    @ResponseBody
    public AutoDTO updateOneById(@PathVariable("id") Long id, @RequestBody AutoDTO autoDTO) {
        return autoService.updateOneById(id, autoDTO);
    }

    @GetMapping
    @ResponseBody
    public List<AutoDTO> getAll() {
        return autoService.getAll();
    }

    @GetMapping("/search/engineVolume/{engineVolume}")
    @ResponseBody
    public List<AutoDTO> getAllByEngineVolume(@PathVariable("engineVolume") Double engineVolume) {
        return autoService.getAllByEngineVolume(engineVolume);
    }

    @GetMapping("/search/vin/{vin}")
    @ResponseBody
    public AutoDTO getOneByVin(@PathVariable("vin") String vin) {
        return autoService.getOneByVin(vin);
    }

    @GetMapping("/search/mark/{mark}")
    @ResponseBody
    public List<AutoDTO> getAllByMark(@PathVariable("mark") String mark) {
        return autoService.getAllByMark(mark);
    }
}
