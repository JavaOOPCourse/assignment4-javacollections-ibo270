package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void initializeAppointments() {
        appointments.add("Academic advising with Dr. Smith");
        appointments.add("Career counseling session");
        appointments.add("Financial aid consultation");

        appointments.addFirst("Urgent advisor meeting");
    }

    public void cancelLast() {
        if (!appointments.isEmpty()) {
            appointments.removeLast();
        }
    }

    public void showFirstAndLast() {
        if (!appointments.isEmpty()) {
            System.out.println("First appointment: " + appointments.getFirst());
            System.out.println("Last appointment: " + appointments.getLast());
        } else {
            System.out.println("No appointments scheduled.");
        }
    }

    public void printAppointments() {
        Iterator<String> iterator = appointments.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
