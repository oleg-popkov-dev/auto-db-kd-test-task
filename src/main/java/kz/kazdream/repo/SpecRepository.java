package kz.kazdream.repo;

import kz.kazdream.model.entity.SpecEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpecRepository extends JpaRepository<SpecEntity, Long> {

    List<SpecEntity> findByBody(String body);

    List<SpecEntity> findByModel(String model);

    List<SpecEntity> findByMaxSpeed(Integer maxSpeed);
}
