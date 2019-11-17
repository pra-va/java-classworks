package lt.prava.structural.adapter;

public class Tester {
	Usb usb = new CardReaderAdapter(new SsdCard());
	usb.connectUsb();
	
}
