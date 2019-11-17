package lt.prava.structural.facade;

public class ComputerFacade {
	private Cpu cpu;
	private Memory memory;
	private HardDisc hardDisc;

	public ComputerFacade() {
		this.cpu = new Cpu();
		this.memory = new Memory();
		this.hardDisc = new HardDisc();
	}

	public void movingData() {
		hardDisc.readData();
		memory.loadData();
		cpu.processingData();
	}

}
