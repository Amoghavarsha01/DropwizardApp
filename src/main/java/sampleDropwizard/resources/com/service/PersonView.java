package sampleDropwizard.resources.com.service;

import io.dropwizard.views.View;

class PersonView extends View{
	private final Person person;
	public PersonView(Person person) {
		super("person.mustache");
		this.person = person;
	}
	public Person getPerson(){
		return person;
	}
}