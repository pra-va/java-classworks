package lt.prava.structural.adapter;

public class CardReaderAdapter implements Usb {
	private AbstractMemoryCard abstractMemoryCard;

	public CardReaderAdapter(AbstractMemoryCard abstractMemoryCard) {
		this.abstractMemoryCard = abstractMemoryCard;
	}

	@Override
	public void connectUsb() {
		this.abstractMemoryCard.insert();
		this.abstractMemoryCard.copyData();
	}
}
