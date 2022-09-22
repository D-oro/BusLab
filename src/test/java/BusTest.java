import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("TheFuture", 3);
        person = new Person();
    }


    @Test
    public void stopAddingWhenBusFull(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(3, bus.passengerCount());
    }

    @Test
    public void canRemovePassengers(){
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassengers(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void hasDestination(){
        assertEquals("TheFuture", bus.destination);
    }

    @Test
    public void hasCapacity(){
        assertEquals(50, bus.capacity);
    }

    @Test
    public void startsWithoutPassengers(){
        assertEquals(0, bus.passengerCount());
    }


}
