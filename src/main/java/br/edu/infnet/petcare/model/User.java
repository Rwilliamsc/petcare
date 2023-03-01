package br.edu.infnet.petcare.model;

public class User extends Person{
    private String email    = "";
    private String password = "";
    public User(String name, String cpf, String email, String password) {
        super(name, cpf);
        this.email = email;
        this.password = password;
    }

    public User(String email, String password, String name, String familyName, String nickName, String cpf, String status) {
        super(name, familyName, nickName, cpf, status);
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
