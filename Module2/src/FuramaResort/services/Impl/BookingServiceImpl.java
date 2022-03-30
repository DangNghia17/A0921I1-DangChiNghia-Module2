package FuramaResort.services.Impl;

import FuramaResort.models.Booking;
import FuramaResort.models.Customer;
import FuramaResort.models.Facility;
import FuramaResort.services.BookingService;
import FuramaResort.utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {

    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());

    static List<Customer> customerList = new ArrayList<>();

    static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    static {
//        customerList.add(new Customer(1,"Nghia", 20, "17/10/2002","Male",201826498 ,929031, "dnghia2002@gmail.com", "VIP" ,"Da Nang"));
    }
    @Override
    public void addBooking() {

    }

    @Override
    public void displayListBooking() {

    }
}
