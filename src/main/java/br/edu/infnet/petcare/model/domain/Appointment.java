package br.edu.infnet.petcare.model.domain;

import javax.persistence.Entity;

@Entity
public class Appointment extends Services{
    private String type = "APPOINTMENT";
    private String level ="";
    private String price = "";

    public Appointment(){}

    public Appointment(String name, String description, String availableDate, String price, String level){
        super(name, description, availableDate);
        this.price = price;
        this.level = level;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    @Override
    public String toString() {
        return "Consulta Médica [Nome= " + super.getName() + ", Veterinário= " + super.getVet().getName() + ", preço= " + this.getPrice()
                + ", Nivel de Emergencia= " + this.getLevel() + " ]";
    }
}
