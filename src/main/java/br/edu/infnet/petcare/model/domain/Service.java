package br.edu.infnet.petcare.model.domain;


public abstract class Service {
    private String name         = "";
    private String description  = "";
    private String availableDate    = "";
    private int idVet           = 0;
    private int id              = 0;

    public Service(){}

    public Service (String name,String description,String availableDate, int idVet){
        this.name = name;
        this.description = description;
        this.availableDate = availableDate;
        this.idVet = idVet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(String availableDate) {
        this.availableDate = availableDate;
    }


    public int getIdVet() {
        return idVet;
    }

    public void setIdVet(int idVet) {
        this.idVet = idVet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
