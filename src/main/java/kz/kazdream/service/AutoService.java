package kz.kazdream.service;

import kz.kazdream.model.dto.AutoDTO;
import kz.kazdream.model.entity.AutoEntity;
import kz.kazdream.repo.AutoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AutoService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private AutoRepository autoRepository;

    public AutoDTO saveAuto(AutoDTO autoDTO) {
        AutoEntity save = autoRepository.save(modelMapper.map(autoDTO, AutoEntity.class));
        return modelMapper.map(save, AutoDTO.class);
    }

    public AutoDTO getOneById(Long id) {
        Optional<AutoEntity> byId = autoRepository.findById(id);
        if (byId.isPresent()) {
            AutoEntity autoEntity = byId.get();
            return modelMapper.map(autoEntity, AutoDTO.class);
        } else {
            return null;
        }
    }

    public AutoDTO updateOneById(Long id, AutoDTO autoDTO) {
        Optional<AutoEntity> byId = autoRepository.findById(id);
        if (byId.isPresent()) {
            AutoEntity autoEntity = byId.get();
            modelMapper.map(autoDTO, autoEntity);
            AutoEntity save = autoRepository.save(autoEntity);
            return modelMapper.map(save, AutoDTO.class);
        } else {
            return null;
        }

    }

    public void deleteOneById(Long id) {
        autoRepository.deleteById(id);
    }

    public List<AutoDTO> getAll() {
        List<AutoEntity> all = autoRepository.findAll();
        ArrayList<AutoDTO> autosList = new ArrayList<>();
        if (!all.isEmpty()) {
            for (AutoEntity entity : all) {
                autosList.add(modelMapper.map(entity, AutoDTO.class));
            }
        }
        return autosList;
    }

    public AutoDTO getOneByVin(String vin) {
        AutoEntity byVin = autoRepository.findByVin(vin);
        if (byVin != null) {
            return modelMapper.map(byVin, AutoDTO.class);
        } else {
            return null;
        }
    }

    public List<AutoDTO> getAllByMark(String mark) {
        List<AutoEntity> byMark = autoRepository.findByMark(mark);
        ArrayList<AutoDTO> autoList = new ArrayList<>();
        if (!byMark.isEmpty()) {
            for (AutoEntity autoEntity : byMark) {
                autoList.add(modelMapper.map(autoEntity, AutoDTO.class));
            }
            return autoList;
        } else {
            return autoList;
        }

    }

    public List<AutoDTO> getAllByEngineVolume(Double engineVolume) {
        List<AutoEntity> byEngineVolume = autoRepository.findByEngineVolume(engineVolume);
        ArrayList<AutoDTO> autoList = new ArrayList<>();
        if (!byEngineVolume.isEmpty()) {
            for (AutoEntity autoEntity : byEngineVolume) {
                autoList.add(modelMapper.map(autoEntity, AutoDTO.class));
            }
            return  autoList;
        } else {
            return autoList;
        }

    }


}
