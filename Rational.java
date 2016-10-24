//Rational Number Lab
public class Rational
{
	private int num;
	private int denom;
	public Rational(int n, int d)
	{
		num=n;                      //default constructor
		denom=d;
	}
	public int getNum()
	{
		return num;
	}
	public int getDenom()
	{
		return denom;
	}
	public double getDecimal()
	{
		return num/denom;
	}
	public Rationaladd(Rationalother)
	{
		int n= num*other.getDenom() + other.getNum()*denom;
		int d= denom*other.getDenom();
		return new Rational(n,d);
	}
	public Rationalsubtract(Rational other)
	{
		int n= num*other.getDenom() - other.getNum()*denom;
		int d= denom*other.getDenom();
		return new Rational(n,d);
		
