package sanek.cassandra.irepository;


import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.repository.CrudRepository;
import sanek.cassandra.model.Hotel;

import java.util.ArrayList;
import java.util.UUID;

public interface IHotelRepository extends CassandraRepository<Hotel, UUID> {

    @AllowFiltering
    ArrayList<Hotel> findByName(String name);

}
