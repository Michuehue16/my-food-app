package pl.zajavka.myfoodapp.infrastructure.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.zajavka.myfoodapp.infrastructure.database.entity.AddressEntity;

@Repository
public interface AddressEntityRepository extends JpaRepository<AddressEntity, Integer> {
}
