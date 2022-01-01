
public class CarSterio {
	String songname;
	public String playMusic(String songname)
	{
		this.songname = songname;
		return songname + " is playing";
	}
	public String pauseMusic(String song)
	{
	return this.songname + " is paused";
	}
	public String stopMusic()
	{
	return this.songname + " is stoped";
	}
	public String getSong()
	{
		return this.songname;
	}
}
