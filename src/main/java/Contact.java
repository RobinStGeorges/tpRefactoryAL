public class Contact {
    String officeArea;
    int number;

    public Contact(String officeArea, int number) {
        this.officeArea = officeArea;
        this.number = number;
    }

    public String getTelNum(){
        return officeArea+""+number;
    }

}
