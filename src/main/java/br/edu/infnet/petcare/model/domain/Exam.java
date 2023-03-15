package br.edu.infnet.petcare.model.domain;

public class Exam extends Service{
    private String type = "EXAM";
    private double price = 0.00;

    public Exam(String name,String description,String startDate, String endDate, int idVet, double price){
        super(name, description, startDate, endDate, idVet);
        this.price = price;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Exame: [Nome= " + super.getName() + ", Veterinário= " + super.getIdVet() + ", preço= " + this.getPrice()
                + " ]";
    }
}
