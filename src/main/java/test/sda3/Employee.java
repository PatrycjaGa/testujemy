package test.sda3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import test.mz_1.Person;
@Getter
@Setter
@AllArgsConstructor
public class Employee extends Person {

    private Integer yearOfBirth;
    private Double salary;


    public  Integer seetingYear(){
        if (this.yearOfBirth <= 1900 || this.yearOfBirth >= 2020){
            yearOfBirth = 0;
        }
        return yearOfBirth;
    }

    public Double getSalary(){

        return salary;
    }

    public String whoAmI(){
        return "Nazywam się " + getName() + getSurname() + " i zarabiam " + getSalary().toString();
    }



}
