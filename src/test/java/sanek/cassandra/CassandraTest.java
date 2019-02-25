package sanek.cassandra;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import sanek.cassandra.model.Hotel;
import sanek.cassandra.repository.HotelRepository;

import java.util.UUID;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CassandraTest {

    @Autowired
    private HotelRepository hotelRepository;

    @Test
    public void repositoryCrudOperations() {

//        HotelRepository hotelRepository = new HotelRepository();

        Hotel sample = sampleHotel();

        hotelRepository.save(sample);

        Hotel savedHotel = hotelRepository.findById(sample.getId());

        assertThat(savedHotel.getName(), equalTo("Sample Hotel"));

        Hotel hotel1 = hotelRepository.findTop1ByName("Sample Hotel");
        System.out.println("hotel1: " + hotel1);

        //this.hotelRepository.delete(savedHotel);

    }

    private Hotel sampleHotel() {

        Hotel hotel = new Hotel();

        hotel.setId(UUID.randomUUID());

        hotel.setName("Sample Hotel");

        hotel.setAddress("Sample Address");

        hotel.setZip("8764");

        return hotel;

    }

}
