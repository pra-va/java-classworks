package lt.prava.structural.adapterTry;

public class JavaApplicationDbAdapter extends JavaApplication implements DataBase {

	@Override
	public void insert() {
		savePeople(new PeopleOne("Algimantas", 30));

	}

	@Override
	public void read() {
		new People("Algimantas", 30) {

		});
		
		System.out.println("Adding...");

	}

	@Override
	public void update() {

	}

	@Override
	public void delete() {

	}

}
