package pl.zajavka.myfoodapp.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.zajavka.myfoodapp.business.dao.OrdersDao;

@Repository
@AllArgsConstructor
public class OrdersRepository implements OrdersDao {
}
