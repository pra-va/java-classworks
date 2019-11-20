package lt.pra_va.type_convertions;

import lt.itakademija.exam.converter.TypeConverter;

public class TypeConvStr implements TypeConverter<String> {

	@Override
	public String format(String arg0) {
		return arg0;
	}

	@Override
	public String parse(String arg0) {
		return arg0;
	}

}
