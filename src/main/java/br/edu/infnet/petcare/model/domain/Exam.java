package br.edu.infnet.petcare.model.domain;

public class Exam extends Service{
    private String type = "EXAM";
    private String price = "";

    public Exam(String name,String description,String availableDate, int idVet, String price){
        super(name, description, availableDate, idVet);
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
        return "Exame: [Nome= " + super.getName() + ", Veterinário= " + super.getIdVet() + ", preço= " + this.getPrice()
                + " ]";
    }
}
