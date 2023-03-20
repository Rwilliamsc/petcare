package br.edu.infnet.petcare.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.petcare.model.domain.Appointment;
import org.springframework.stereotype.Repository;

@Repository
public class AppointmentRepository {
    
    private static Map<Integer, Appointment> database = new HashMap<Integer, Appointment>();


    public boolean create(Appointment appointment) {
        try {
            appointment.setId(nextId());
            database.put(appointment.getId(), appointment);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Collection<Appointment> list() {
        return database.values();
    }
    
    public Appointment getById(int key) {
        return database.get(key);
    }

    public Appointment update(int key, Appointment appointment) {
        database.replace(appointment.getId(), appointment);
        return database.get(key);
    }
    
    public Appointment remove(int key) {
    	return database.remove(key);
    }

    public int nextId() {
        return database.size() + 1;
    }
}
