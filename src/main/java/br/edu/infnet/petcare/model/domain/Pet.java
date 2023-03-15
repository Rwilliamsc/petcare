package br.edu.infnet.petcare.model.domain;

public class Pet {
    private String name         = "";

    private String type         = "";
    private String breed        = "";
    private int age             = 0;
    private String brithDate    = "";
    private int idGuardian      = 0;
    private int id              = 0;

    public Pet(){}

    public Pet(String name, String type, String breed, int age, String brithDate,int idGuardian){
        this.name = name;
        this.type = type;
        this.breed = breed;
        this.age = age;
        this.brithDate = brithDate;
        this.idGuardian = idGuardian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBrithDate() {
        return brithDate;
    }

    public void setBrithDate(String brithDate) {
        this.brithDate = brithDate;
    }

    public int getIdGuardian() {
        return idGuardian;
    }

    public void setIdGuardian(int idGuardian) {
        this.idGuardian = idGuardian;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {

        return String.format(
                "Nome:  %s \n tipo: %s \n Guardiao: %d",
                this.getName(),
                this.getType(),
                this.getIdGuardian());
    }
}
