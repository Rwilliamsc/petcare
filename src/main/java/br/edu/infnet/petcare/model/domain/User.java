package br.edu.infnet.petcare.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class User extends Person{
    private String email    = "";
    private String password = "";
    private String nickName = "";
    private String type     = "";
    @OneToMany
    @JoinColumn(name = "userId")
    private List<Pet> pets;
    @OneToMany
    @JoinColumn(name = "userId")
	private List<Schedule> schedule;
   
    public User() {}
   
    public User(String name, String cpf, String email, String password) {
        super(name, cpf);
        this.email = email;
        this.password = password;
    }

    public User(String email, String password, String name, String familyName, String nickName, String cpf, String status) {
        super(name, familyName, cpf, status);
        this.email = email;
        this.password = password;
        this.nickName = nickName;
        this.type = "USER";
    }
    
    public User(String email, String password, String name, String familyName, String nickName, String cpf, String status, int id) {
        super(name, familyName, cpf, status, id);
        this.email = email;
        this.password = password;
        this.nickName = nickName;
        this.type = "USER";
    }

    public User(String email, String password, String name, String familyName, String nickName, String cpf, String status, String type) {
        super(name, familyName, cpf, status);
        this.email = email;
        this.password = password;
        this.nickName = nickName;
        this.type = type;
    }

    public User(String email, String password) {
        super();
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

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public List<Schedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<Schedule> schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {

        return String.format(
                "Usuário:  %s \n Email: %s \n Senha: %s",
                super.getName(),
                email,
                password);
    }
}
