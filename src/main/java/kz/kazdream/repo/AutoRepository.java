package kz.kazdream.repo;

import kz.kazdream.model.entity.AutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutoRepository extends JpaRepository<AutoEntity, Long> {

    AutoEntity findByVin(String vin);

    List<AutoEntity> findByMark(String mark);

    List<AutoEntity> findByEngineVolume(Double volume);

}
