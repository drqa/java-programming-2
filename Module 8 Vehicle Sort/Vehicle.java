public class Vehicle {
    
    private String make;
    private String model;
    private double mpg;

    public Vehicle(String make, String model, double mpg){

        super();
        this.make = make;
        this.model = model;
        this.mpg = mpg;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMpg() {
        return this.mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public boolean lessThanOrEqualTo(Vehicle other) {
      return this.mpg <= other.getMpg();
    }

    public String toString(){
        String temp = "";
        temp += "Make: " + getMake() + "\n";
        temp += "Model: " + getModel() + "\n";
        temp += "MPG: " + getMpg() + "\n";

        return temp;

    }
}

