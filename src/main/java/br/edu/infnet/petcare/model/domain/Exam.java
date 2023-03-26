package br.edu.infnet.petcare.model.domain;

import javax.persistence.Entity;

@Entity
public class Exam extends Services{
    private String type = "EXAM";
    private String price = "";

    public Exam(){}

    public Exam(String name,String description,String availableDate, String price){
        super(name, description, availableDate);
        this.price = price;

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

    @Override
    public String toString() {
        return "Exame: [Nome= " + super.getName() + ", Veterinário= " + super.getVet().getName() + ", preço= " + this.getPrice()
                + " ]";
    }
}
