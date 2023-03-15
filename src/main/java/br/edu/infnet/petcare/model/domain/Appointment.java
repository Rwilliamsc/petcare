package br.edu.infnet.petcare.model.domain;

public class Appointment extends Service{
    private String type = "APPOINTMENT";
    private int level = 0;
    private double price = 0.00;

    public Appointment(String name, String description, String startDate, String endDate, int idVet, double price,int level){
        super(name, description, startDate, endDate, idVet);
        this.price = price;
        this.level = level;

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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    @Override
    public String toString() {
        return "Consulta Médica [Nome= " + super.getName() + ", Veterinário= " + super.getIdVet() + ", preço= " + this.getPrice()
                + ", Nivel de Emergencia= " + this.getLevel() + " ]";
    }
}
