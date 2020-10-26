package kz.kazdream.service;


import kz.kazdream.model.dto.SpecDTO;
import kz.kazdream.model.entity.SpecEntity;
import kz.kazdream.repo.SpecRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SpecService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private SpecRepository specRepository;

    public SpecDTO saveSpec(SpecDTO specDTO) {
        SpecEntity save = specRepository.save(modelMapper.map(specDTO, SpecEntity.class));
        return modelMapper.map(save, SpecDTO.class);
    }

    public SpecDTO getOneById(Long id) {
        Optional<SpecEntity> byId = specRepository.findById(id);
        if (byId.isPresent()) {
            SpecEntity specEntity = byId.get();
            return modelMapper.map(specEntity, SpecDTO.class);
        } else {
            return null;
        }
    }

    public  SpecDTO updateByOneId(Long id, SpecDTO specDTO) {
        Optional<SpecEntity> byId = specRepository.findById(id);
        if (byId.isPresent()) {
            SpecEntity specEntity = byId.get();
            modelMapper.map(specDTO, specEntity);
            SpecEntity save = specRepository.save(specEntity);
            return modelMapper.map(save, SpecDTO.class);
        } else {
            return null;
        }
    }

    public void deleteByOneId (Long id) {
        specRepository.deleteById(id);
    }

    public List<SpecDTO> getAll() {
        List<SpecEntity> all = specRepository.findAll();
        ArrayList<SpecDTO> specsList = new ArrayList<>();
        if (!all.isEmpty()) {
            for (SpecEntity entity : all) {
                specsList.add(modelMapper.map(entity, SpecDTO.class));
            }
        }
        return specsList;
    }

    public List<SpecDTO> getAllByBody(String body) {
        List<SpecEntity> byBody = specRepository.findByBody(body);
        ArrayList<SpecDTO> specList = new ArrayList<>();
        if (!byBody.isEmpty()) {
            for (SpecEntity specEntity : byBody) {
                specList.add(modelMapper.map(specEntity, SpecDTO.class));
            }
            return specList;
        }  else {
            return specList;
        }
    }

    public List<SpecDTO> getAllByModel(String model) {
        List<SpecEntity> byModel = specRepository.findByModel(model);
        ArrayList<SpecDTO> specList = new ArrayList<>();
        if (!byModel.isEmpty()) {
            for (SpecEntity specEntity : byModel) {
                specList.add(modelMapper.map(specEntity, SpecDTO.class));
            }
            return specList;
        } else {
            return specList;
        }
    }

    public List<SpecDTO> getAllByMaxSpeed(Integer maxSpeed) {
        List<SpecEntity> byMaxSpeed = specRepository.findByMaxSpeed(maxSpeed);
        ArrayList<SpecDTO> specList = new ArrayList<>();
        if (!byMaxSpeed.isEmpty()) {
            for (SpecEntity specEntity : byMaxSpeed) {
                specList.add(modelMapper.map(specEntity, SpecDTO.class));
            }
            return specList;
        } else {
            return specList;
        }
    }




}
