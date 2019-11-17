package lt.prava.structural.adapter;

public class MicroSDCard extends AbstractMemoryCard {

	@Override
	public void insert() {
		System.out.println("Micro SD card inserted...");

	}

	@Override
	public void copyData() {
		System.out.println("Data copied...");

	}

}
