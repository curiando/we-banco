package projeto.webanco.entities;

import javax.persistence.*;

@Entity
@Table(name = "dado")

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "career")
    private String careerUser;

    public Cliente(){

    }

    public Cliente(String firstName, String lastName, String careerUser){
        this.firstName = firstName;
        this.lastName = lastName;
        this.careerUser = careerUser;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getCareerUser(){
        return careerUser;
    }

    public void setCareerUser(String careerUser){
        this.careerUser = firstName;
    }
}
