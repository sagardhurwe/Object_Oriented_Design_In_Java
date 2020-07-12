class Gear
{
private int chainRing;
private int cog;
Wheel wheel;

	public Gear(int chainRing,int cog, Wheel wheel)
	{
	this.chainRing = chainRing;
	this.cog = cog;
	this.wheel = wheel;
	}

	public float ratio()
	{
	return chainRing/cog;
	}

	public float gearInches()
	{
	return ratio* wheel.diameter;
	}
}

class Wheel{
	private int rim;
	private int tire;
	public int diameter()
	{
	return rim + (tire*2);
	}
	float circumfarance()
	{
	return this.diameter()*3.14;
	} 
}
