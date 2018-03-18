package PersonException;

import com.cisc181.core.Person;

public class PersonException extends Exception{
	private Person p1;

	public PersonException(Person p1) {
		this.p1 = p1;
	}
	public Person getp1() {
		return p1;
	}

}
