package br.edu.infnet.petcare.model.domain;


public abstract class Service {
    private String name         = "";
    private String description  = "";
    private String startDate    = "";
    private String endDate      = "";
    private int idVet           = 0;
    private int id              = 0;

    public Service(){}

    public Service (String name,String description,String startDate, String endDate, int idVet){
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
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
