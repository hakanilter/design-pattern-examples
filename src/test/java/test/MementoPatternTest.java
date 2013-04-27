package test;

import junit.framework.Assert;

import org.junit.Test;

import constructional.memento.Form;
import constructional.memento.Form.FormMemento;

/**
 * 
 * Nesnenin durumunu encapsulation bozulmadan
 * disarda saklanmasi ve restore edilmesini saglayar
 * 
 */
public class MementoPatternTest 
{
	@Test
	public void test()
	{
		Form form = new Form("John", "Doe");
		System.out.println(form.getFullName());
		FormMemento memento = form.createMemento();

		Form restoredForm = new Form();
		restoredForm.restoreMemento(memento);
		System.out.println(restoredForm.getFullName());
		
		Assert.assertEquals(form.getFullName(), restoredForm.getFullName());
	}
}
