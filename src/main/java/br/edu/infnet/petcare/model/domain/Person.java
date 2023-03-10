package br.edu.infnet.petcare.model.domain;

public abstract class Person {

    private String name         = "";
    private String familyName   = "";
    private String nickName     = "";
    private String cpf          = "";
    private String status       = "";

    public Person() {}

    public Person(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public Person (String name, String familyName, String nickName, String cpf, String status) {
        this.name = name;
        this.familyName = familyName;
        this.nickName = nickName;
        this.cpf = cpf;
        this.status = status;
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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

    public StringBuilder getFullName() {
        StringBuilder fullName = new StringBuilder();
        fullName.append(this.getName());
        fullName.append(this.getFamilyName());

        return fullName;
    }


}
