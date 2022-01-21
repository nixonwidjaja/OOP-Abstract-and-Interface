public class Tiger extends Animal
{
    private String name, location, food;
    private double weight;
    public Tiger()
    {
        super();
    }
    public Tiger(String name, String location, String food, double weight)
    {
        super(name,location,food,weight);
    }
    public void voice(String voice)
    {
        System.out.println(this.name+" mengaum");
    }
    public void reproduce(String cara)
    {
        System.out.println(this.name+" berkembangbiak dengan beranak");
    }
}
