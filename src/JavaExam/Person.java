package JavaExam;

public class Person {
    String phone;
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return phone;
    }
}

class Professor extends Person {
    public String getPhone(){
        return "Professor : " + super.getPhone();
    }
}
