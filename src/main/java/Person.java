public class Person {
    public String getname(){
        return "";
    }
    public String getTelNum(){
        Contact contact = new Contact(getOfficeAreaCode(), getNumber());
        return contact.getTelNum();
    }
    private String getOfficeAreaCode(){
        return "";
    }
    private void setOfficeAreaCode(int code){

    }
    private int getNumber(){
        return 14;
    }
    private void setNumber(){
    }
}
