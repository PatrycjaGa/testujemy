package test.sda3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Manager extends Employee{
    private String seat = "manager";


    public Manager(Integer yearOfBirth, Double salary, String seat) {
        super(yearOfBirth, salary);
        this.seat = seat;
    }

    public Manager(Integer yearOfBirth, Double salary) {
        super(yearOfBirth, salary);
    }

    @Override
    public Double getSalary() {
        return super.getSalary()*1.1;
    }

    @Override
    public String whoAmI() {
        return  "Nazywam się " + seat + " " + getName()+" " + getSurname() + " i zarabiam " + getSalary().toString();
    }
}
