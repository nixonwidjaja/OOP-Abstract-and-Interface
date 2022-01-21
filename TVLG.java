public class TVLG implements Control
{
    private Channel active;
	private Channel [] arr = new Channel[12];
	public void switchChannel(int channel) 
    {  
		System.out.println("Pindah channel pada TV LG ke "+ this.arr[channel]);
	} 
	
	public void setVolumeup(int volume) 
    {  
		System.out.println("Perbesar volume pada TV LG sebanyak "+ volume);
	}
	
	public void setVolumedown(int volume) 
    {  
		System.out.println("Perkecil volume pada TV LG sebanyak "+ volume);
	}
	public TVLG() 
	{
		active = null;
	}
	public TVLG(Channel active)
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
		System.out.println("Brand = LG");
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
