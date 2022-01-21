public class Remote 
{
	public void Action(int aksi, Control tv,int x)
    {
		switch(aksi)
        {
		case 1:
			tv.switchChannel(x);
			break;
		case 2:
			tv.setVolumeup(x);
			break;
		case 3:
			tv.setVolumedown(x);
			break;
		}    
	}
}
