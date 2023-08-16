package pl.zajavka.myfoodapp.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.zajavka.myfoodapp.business.dao.RestaurantDao;

@Repository
@AllArgsConstructor
public class RestaurantRepository implements RestaurantDao {
}
