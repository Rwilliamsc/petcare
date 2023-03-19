package br.edu.infnet.petcare.model.domain;

public abstract class Person {

    private String name         = "";
    private String familyName   = "";
    private String cpf          = "";
    private String status       = "";
    private int id              = 0;

    public Person() {}

    public Person(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public Person (String name, String familyName, String cpf, String status) {
        this.name = name;
        this.familyName = familyName;
        this.cpf = cpf;
        this.status = status;
    }
    
    public Person (String name, String familyName, String cpf, String status, int id) {
        this.name = name;
        this.familyName = familyName;
        this.cpf = cpf;
        this.status = status;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StringBuilder getFullName() {
        StringBuilder fullName = new StringBuilder();
        fullName.append(this.getName());
        fullName.append(" ");
        fullName.append(this.getFamilyName());

        return fullName;
    }


}
