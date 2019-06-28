public class Person {

    String officeAreaCode;
    String number;

    public Person(String officeAreaCode, String number) {
        this.officeAreaCode = officeAreaCode;
        this.number = number;
    }

    public String getname(){
        return "";
    }
    public String getTelNum(){
        Contact contact = new Contact(getOfficeAreaCode(), getNumber());
        return contact.getTelNum();
    }
    private String getOfficeAreaCode(){
        return officeAreaCode;
    }
    private void setOfficeAreaCode(int code){

    }
    private String getNumber(){
        return number;
    }
    private void setNumber(){
    }
}
