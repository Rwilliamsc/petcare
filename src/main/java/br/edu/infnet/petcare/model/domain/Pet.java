package br.edu.infnet.petcare.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pet{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id              = 0;
    private String name         = "";
    private String type         = "";
    private String breed        = "";
    private int age             = 0;
    private String brithDate    = "";
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
    @OneToMany
    @JoinColumn(name = "petId")
	private List<Schedule> schedule;

    public Pet(){}
    
    public Pet(String name, String type, String breed, int age, String brithDate){
        this.name = name;
        this.type = type;
        this.breed = breed;
        this.age = age;
        this.brithDate = brithDate;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getBreed() {
        return breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getBrithDate() {
        return brithDate;
    }

    public void setBrithDate(String brithDate) {
        this.brithDate = brithDate;
    }
    
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public User getUser() {
        return user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    public List<Schedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<Schedule> schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        
        return String.format(
            "Nome:  %s \n tipo: %s \n Guardião: %d",
            this.getName(),
            this.getType(),
            this.getUser().getName());
    }
}
