package corepackage;

public class Abstract {
	public static void main(String[] args)
	{
		Racoon racoon=new Racoon("Racoon");
		racoon.eat();
			racoon.breathe();
	}}
	abstract class Animal
	{
		private String name;
		public Animal(String name)
		{
			this.name=name;
		}
		
		public String getName()
		{
			return name;
		}
		public abstract void eat();
		public abstract void breathe();
	}
	class Racoon extends Animal
	{
		public Racoon(String name) {
			super(name);
		}
		public void eat() {
			System.out.println(getName()+" is eating");}
		public void breathe() {
			System.out.println("Breathe in,breath out,repeat");
		}
		
	}

