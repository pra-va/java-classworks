package lt.pra_va.type_convertions;

import lt.itakademija.exam.converter.TypeConverter;

public class TypeConvLong implements TypeConverter<Long> {

	@Override
	public String format(Long number) {
		return number.toString();
	}

	@Override
	public Long parse(String arg0) {
		return Long.parseLong(arg0);
	}

}
