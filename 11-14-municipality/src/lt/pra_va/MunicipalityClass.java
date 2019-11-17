package lt.pra_va;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lt.vtvpmc.municipality.AbstractMunicipalityTest;
import lt.vtvpmc.municipality.IllegalCitizenException;
import lt.vtvpmc.municipality.Municipality;
import lt.vtvpmc.municipality.Person;

public class MunicipalityClass extends AbstractMunicipalityTest implements Municipality {
	private List<Person> persons = new ArrayList<Person>();

	@Override
	public Person findOldestPerson() {

		Person oldestPerson;

		if (this.persons.size() > 0) {
			oldestPerson = this.persons.get(0);
		} else {
			return null;
		}

		for (Person person: this.persons) {
			if (person.getDateOfBirth().isBefore(oldestPerson.getDateOfBirth())) {
				oldestPerson = person;
			}
		}

		return oldestPerson;
	}

	@Override
	public int getCitizenCount() {
		return this.persons.size();
	}

	@Override
	public boolean isRegisteredCitizen(Person arg0) {

		if (this.persons.contains(arg0)) {
			return true;
		}

		for (Person person: this.persons) {
			if (person.getYearlyIncome() == arg0.getYearlyIncome() &&
				person.getDateOfBirth().equals(arg0.getDateOfBirth()) &&
				person.getLastName().equals(arg0.getLastName()) &&
				person.getFirstName().equals(arg0.getFirstName())) {
				return true;
			} else {
				return false;
			}
		}

		return false;
	}

	@Override
	public void registerCitizen(Person arg0) throws IllegalCitizenException {
		if (this.persons.contains(arg0)) {
			return;
		}

		LocalDate date = LocalDate.of(2018, 11, 15);

		if (arg0.getFirstName() == null ||
				arg0.getLastName() == null ||
				arg0.getFirstName().equals("") ||
				arg0.getLastName().equals("") ||
				arg0.getDateOfBirth() == null ||
				arg0.getDateOfBirth().isAfter(date) ||
				arg0.getYearlyIncome() < 0) {
			throw new IllegalCitizenException(arg0);
		} else {
			this.persons.add(arg0);
		}



	}

	@Override
	public double totalIncomeInTaxes() {
		double totalTaxes = 0.0;
		for (Person person : this.persons) {
			if (person.getYearlyIncome() < 14000) {
				continue;
			} else if (person.getYearlyIncome() > 1_000_000) {
				totalTaxes += person.getYearlyIncome() * 0.16;
				continue;
			} else {
				totalTaxes += person.getYearlyIncome() * 0.15;
			}
		}
		return totalTaxes;
	}

	@Override
	public Municipality getMunicipality() {
		return this;
	}

}
