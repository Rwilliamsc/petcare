package br.edu.infnet.petcare.model.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id = 0;
    private String date = "";
    private boolean isEmergency;
    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "userId")
    private User user;
    @ManyToOne
    @JoinColumn(name = "petId")
    private Pet pet;
    @ManyToOne
    @JoinColumn(name = "vetId")
    private Veterinary vet;
    @ManyToOne
    @JoinColumn(name = "serviceId")
    private Services service;

    public Schedule(){ }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean getIsEmergency() {
        return isEmergency;
    }

    public void setEmergency(boolean emergency) {
        isEmergency = emergency;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Veterinary getVet() {
        return vet;
    }

    public void setVet(Veterinary vet) {
        this.vet = vet;
    }

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "Agendamento: [id= " + this.getId() + ", Guardian= " + this.user.getFullName() + ", Pet= " + this.pet.getName() + " ]";
    }
}
