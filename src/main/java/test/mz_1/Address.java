package test.mz_1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Address {

    private String street;
    private String city;
    private String country;
    private int flatNo;
    private int homeNo;

   public String getStreet(){
       return this.street;
   }

   public void setStreet(String road){
       this.street = road;
   }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(int flatNo) {
        this.flatNo = flatNo;
    }

    public int getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(int homeNo) {
        this.homeNo = homeNo;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", flatNo=" + flatNo +
                ", homeNo=" + homeNo +
                '}';
    }
}
