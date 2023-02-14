public class Stairs {

    private String position;
    private double width;
    private double lenght;

    public Stairs(String position, double width, double lenght){
        this.position = position;
        this.width = width;
        this.lenght = lenght;
    }

    public String getPosition(){
        return position;
    }

    public double getSize(){
        return width * lenght / 2;
    }



}
