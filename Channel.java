public class Channel 
{
    private String name;
    private int freq;
    private int volume;    
    public Channel()
    {
        name = "unknown";
        freq = 0;
        volume = 0;
    }
    public Channel(String name, int freq, int volume)
    {
        this.name = name;
        this.freq = freq;
        this.volume = volume;
    }
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}
    public void setFreq(int freq) {this.freq = freq;}
    public int getFreq() {return freq;}
    public void setVolume(int volume) {this.volume = volume;}
    public int getVolume() {return volume;}
}
