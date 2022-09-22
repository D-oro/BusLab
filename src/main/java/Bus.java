import java.util.ArrayList;

public class Bus {

    public String destination;
    public int capacity;
    public ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public void removePassenger(Person person){
        if (this.passengerCount() > 0){
            this.passengers.remove(person);
        }
    }

    public void addPassenger(Person person){
        if (this.capacity > this.passengerCount()) {
            this.passengers.add(person);
        }
    }

    public int passengerCount(){
        return passengers.size();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Person> getPersonList() {
        return passengers;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.passengers = personList;
    }
}
