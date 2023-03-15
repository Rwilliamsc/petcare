package br.edu.infnet.petcare.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.petcare.model.domain.Schedule;
import org.springframework.stereotype.Repository;

@Repository
public class ScheduleRepository {
    
    private static Map<Integer, Schedule> database = new HashMap<Integer, Schedule>();


    public static boolean create(Schedule schedule) {
        try {
            schedule.setId(nextId());
            database.put(schedule.getId(), schedule);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Collection<Schedule> list() {
        return database.values();
    }
    
    public static Schedule getById(int key) {
        return database.get(key);
    }

    public static Schedule update(int key, Schedule schedule) {
        Schedule itemEdit = database.get(key);
        itemEdit = schedule;
        return itemEdit;
    }
    
    public static Schedule remove(int key) {
    	return database.remove(key);
    }

    public static int nextId() {
        return database.size() + 1;
    }
}
