package br.edu.infnet.petcare.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Veterinary extends Person{
    private String specialty  = "";
    private String cfmv       = "";
    private String prefix     = "";
    private String phone      = "";
    @OneToMany
    @JoinColumn(name = "vetId")
	private List<Schedule> schedule;

    public Veterinary() {}

    public Veterinary(String name, String familyName, String prefix, String cpf, String status, String specialty, String cfmv, String phone) {
        super(name, familyName, cpf, status);
        this.specialty = specialty;
        this.cfmv = cfmv;
        this.prefix = prefix;
        this.phone = phone;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getCfmv() {
        return cfmv;
    }

    public void setCfmv(String cfmv) {
        this.cfmv = cfmv;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
                "Veterinário:  %s \n CFMV: %s",
                super.getName(),
                this.cfmv);
              
    }
}
