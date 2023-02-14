public class Property {

    private String address;
    private double width;
    private double lenght;

    public Property(String a, double w, double l){
        address = a;
        width = w;
        lenght = l;
    }

    public String getAddress(){
        return address;
    }

    public double getSize(){
        return width * lenght;
    }

}
