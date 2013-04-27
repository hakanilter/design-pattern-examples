package constructional.memento;

import java.io.Serializable;

public class Form 
{
	private String name;
	private String surname;
	
	public Form() {
		
	}
	
	public Form(String name, String surname) 
	{
		this.name = name;
		this.surname = surname;
	}
	
	public String getFullName() {
		return name + " " + surname;
	}
	
	public FormMemento createMemento() {
		return new FormMemento(name, surname);
	}
	
	public void restoreMemento(FormMemento memento) 
	{
		this.name = memento.name;
		this.surname = memento.surname;
	}
	
	public static class FormMemento implements Serializable 
	{
		private static final long serialVersionUID = -7954212659831196188L;
		
		private String name;
		private String surname;
		
		public FormMemento(String name, String surname) 
		{
			this.name = name;
			this.surname = surname;
		}
	}
}
