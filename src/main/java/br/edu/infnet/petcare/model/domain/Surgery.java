package br.edu.infnet.petcare.model.domain;

public class Surgery extends Service{
    private String type = "SURGERY";
    private String price = "";

    private boolean isCritical;
    private boolean isEmergency;

    public Surgery(String name, String description, String availableDate, int idVet, String price, boolean isCritical, boolean isEmergency){
        super(name, description, availableDate, idVet);
        this.price = price;
        this.isCritical = isCritical;
        this.isEmergency = isEmergency;

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

    public boolean getIsCritical() {
        return isCritical;
    }

    public void setCritical(boolean critical) {
        isCritical = critical;
    }

    public boolean getIsEmergency() {
        return isEmergency;
    }

    public void setEmergency(boolean emergency) {
        isEmergency = emergency;
    }

    @Override
    public String toString() {
        return "Consulta Médica [Nome= " + super.getName() + ", Veterinário= " + super.getIdVet() + ", preço= " + this.getPrice()
                + ", Critico= " + this.getIsCritical() + ", Emergencia= " + this.getIsEmergency() + " ]";
    }
}
