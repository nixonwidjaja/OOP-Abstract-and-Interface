public class Eagle extends Animal
{
    private String name, location, food;
    private double weight;
    public Eagle()
    {
        super();
    }
    public Eagle(String name, String location, String food, double weight)
    {
        super(name,location,food,weight);
    }
    public void voice(String voice)
    {
        System.out.println(this.name+" memekik");
    }
    public void reproduce(String cara)
    {
        System.out.println(this.name+" berkembangbiak dengan bertelur");
    }
}
