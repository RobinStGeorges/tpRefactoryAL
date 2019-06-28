public class Contact {
    String officeArea;
    String number;

    public Contact(String officeArea, String number) {
        this.officeArea = officeArea;
        this.number = number;
    }

    public String getTelNum(){
        return officeArea+""+number;
    }

}
