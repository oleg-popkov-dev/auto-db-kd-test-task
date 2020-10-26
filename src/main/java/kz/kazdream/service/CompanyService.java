package kz.kazdream.service;

import kz.kazdream.model.dto.CompanyDTO;
import kz.kazdream.model.entity.CompanyEntity;
import kz.kazdream.repo.CompanyRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CompanyRepository companyRepository;

    public CompanyDTO saveCompany(CompanyDTO companyDTO) {
        CompanyEntity save = companyRepository.save(modelMapper.map(companyDTO, CompanyEntity.class));
        return modelMapper.map(save, CompanyDTO.class);
    }

    public CompanyDTO getOneById(Long id) {
        Optional<CompanyEntity> byId = companyRepository.findById(id);
        if (byId.isPresent()) {
            CompanyEntity companyEntity = byId.get();
            return modelMapper.map(companyEntity, CompanyDTO.class);
        } else {
            return null;
        }
    }

    public CompanyDTO updateOneById(Long id, CompanyDTO companyDTO) {
        Optional<CompanyEntity> byId = companyRepository.findById(id);
        if (byId.isPresent()) {
            CompanyEntity companyEntity = byId.get();
            modelMapper.map(companyDTO, companyEntity);
            CompanyEntity save = companyRepository.save(companyEntity);
            return modelMapper.map(save, CompanyDTO.class);
        } else {
            return null;
        }
    }

    public void deleteOneById(Long id) {
        companyRepository.deleteById(id);
    }

    public List<CompanyDTO> getAll() {
        List<CompanyEntity> all = companyRepository.findAll();
        ArrayList<CompanyDTO> companiesList = new ArrayList<>();
        if (!all.isEmpty()) {
            for(CompanyEntity entity : all) {
                companiesList.add(modelMapper.map(entity, CompanyDTO.class));
            }
        }
        return companiesList;
    }

    public CompanyDTO getOneByName(String name) {
        CompanyEntity byName = companyRepository.findByName(name);
        if (byName != null) {
            return modelMapper.map(byName, CompanyDTO.class);
        } else {
            return null;
        }
    }

    public List<CompanyDTO> getAllByCeo(String ceo) {
        List<CompanyEntity> byCeo = companyRepository.findByCeo(ceo);
        ArrayList<CompanyDTO> companyList = new ArrayList<>();
        if (!byCeo.isEmpty()) {
           for (CompanyEntity companyEntity : byCeo) {
               companyList.add(modelMapper.map(companyEntity, CompanyDTO.class));
           }
            return companyList;
        } else {
            return companyList;
        }
    }

    public List<CompanyDTO> getAllByCapitalization(Double capitalization) {
        List<CompanyEntity> byCapitalization = companyRepository.findByCapitalization(capitalization);
        ArrayList<CompanyDTO> companyList = new ArrayList<>();
        if (byCapitalization != null) {
            for (CompanyEntity companyEntity : byCapitalization) {
                companyList.add(modelMapper.map(companyEntity, CompanyDTO.class));
            }
            return companyList;
        } else {
            return companyList;
        }

    }

}


