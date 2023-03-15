package br.edu.infnet.petcare.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.petcare.model.domain.Appointment;
import org.springframework.stereotype.Repository;

@Repository
public class AppointmentRepository {
    
    private static Map<Integer, Appointment> database = new HashMap<Integer, Appointment>();


    public static boolean create(Appointment appointment) {
        try {
            appointment.setId(nextId());
            database.put(appointment.getId(), appointment);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Collection<Appointment> list() {
        return database.values();
    }
    
    public static Appointment getById(int key) {
        return database.get(key);
    }

    public static Appointment update(int key, Appointment appointment) {
        Appointment itemEdit = database.get(key);
        itemEdit = appointment;
        return itemEdit;
    }
    
    public static Appointment remove(int key) {
    	return database.remove(key);
    }

    public static int nextId() {
        return database.size() + 1;
    }
}
