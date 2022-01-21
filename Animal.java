public abstract class Animal 
{
    private String name, location, food;
    private double weight;
    public Animal()
    {
        this.name = "unknown";
        this.location = "unknown";
        this.food = "unknown";
        this.weight = 0;
    }
    public Animal(String name, String location, String food, double weight)
    {
        this.name = name;
        this.location = location;
        this.food = food;
        this.weight = weight;
    }
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}
    public void setLocation(String location) {this.location = location;}
    public String getLocation() {return location;}
    public void setFood(String food) {this.food = food;}
    public String getFood() {return food;}
    public void setWeight(double weight) {this.weight = weight;}
    public double getWeight() {return weight;}
    public void voice(String voice)
    {
        System.out.println(this.name+" "+voice);
    }
    public void reproduce(String cara)
    {
        System.out.println(this.name+" berkembangbiak dengan "+cara);
    }
}
