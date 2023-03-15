package br.edu.infnet.petcare.model.domain;

public class Schedule {


    private int id = 0;
    private int idService = 0;
    private int idVet = 0;
    private int idGuardian = 0;
    private int idPet = 0;
    private String nameService = "";
    private String nameVet = "";
    private String nameGuardian = "";
    private String namePet = "";

    private String date = "";
    private boolean isEmergency;
    private double value = 0.00;

    public Schedule(int idService, int idVet, int idGuardian, int idPet, String nameService, String nameVet, String nameGuardian, String namePet, String date, boolean isEmergency, double value){
        this.idService = idService;
        this.idVet = idVet;
        this.idGuardian = idGuardian;
        this.idPet = idPet;
        this.date = date;
        this.isEmergency = isEmergency;
        this.value = value;
        this.nameService = nameService;
        this.nameVet = nameVet;
        this.nameGuardian = nameGuardian;
        this.namePet = namePet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public int getIdVet() {
        return idVet;
    }

    public void setIdVet(int idVet) {
        this.idVet = idVet;
    }

    public int getIdGuardian() {
        return idGuardian;
    }

    public void setIdGuardian(int idGuardian) {
        this.idGuardian = idGuardian;
    }

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(int idPet) {
        this.idPet = idPet;
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

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getNameVet() {
        return nameVet;
    }

    public void setNameVet(String nameVet) {
        this.nameVet = nameVet;
    }

    public String getNameGuardian() {
        return nameGuardian;
    }

    public void setNameGuardian(String nameGuardian) {
        this.nameGuardian = nameGuardian;
    }

    public String getNamePet() {
        return namePet;
    }

    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    @Override
    public String toString() {
        return "Agendamento: [id= " + this.getId() + ", Guardian= " + this.getIdGuardian() + ", Pet= " + this.getIdPet() + " ]";
    }
}
