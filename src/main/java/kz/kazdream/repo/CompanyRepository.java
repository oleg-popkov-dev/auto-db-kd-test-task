package kz.kazdream.repo;

import kz.kazdream.model.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {

    CompanyEntity findByName(String name);

    List<CompanyEntity> findByCeo(String ceo);

    List<CompanyEntity> findByCapitalization(Double capitalization);
}
