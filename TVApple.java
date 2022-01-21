public class TVApple implements Control
{
    private Channel active;
	private Channel [] arr = new Channel[12];
	public void switchChannel(int channel) 
    {  
		System.out.println("Pindah channel pada TV Apple ke "+ this.arr[channel]);
	} 
	
	public void setVolumeup(int volume) 
    {  
		System.out.println("Perbesar volume pada TV Apple sebanyak "+ volume);
	}
	
	public void setVolumedown(int volume) 
    {  
		System.out.println("Perkecil volume pada TV Apple sebanyak "+ volume);
	}    
	public TVApple() 
	{
		active = null;
	}
	public TVApple(Channel active)
	{
		this.active = active;
	}
	int index = 1;
	public void addChannel(Channel channel) 
	{
		this.arr[index] = channel;
		index++;
	}
	public void setActive(Channel active) {this.active = active;}
    public Channel getActive() {return active;}
	public void viewtv()
	{
		System.out.println("Brand = Apple");
		if (active!=null)
		System.out.println("Channel aktif = "+active.getName());
		if (arr[1]!=null)
		System.out.println("Channel tersedia:");
		for (int i=1;i<=10;i++)
		{
			if (arr[i]!=null)
			System.out.println(i+". "+arr[i].getName()+" volume "+arr[i].getVolume());
		}
	}
}
