package sanek.cassandra.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sanek.cassandra.irepository.IHotelRepository;
import sanek.cassandra.model.Hotel;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.UUID;

@Component
public class HotelRepository {

    @Autowired
    IHotelRepository repository;

    public Hotel findTop1ByName(String name) {
        ArrayList<Hotel> list = repository.findByName(name);
        return list.get(0);
    };

    public void save(Hotel hotel) {
        repository.save(hotel);
    }

    public Hotel findById(UUID id) {
        Hotel hotel = repository.findById(id).orElse(null);
        return hotel;
    }


}
