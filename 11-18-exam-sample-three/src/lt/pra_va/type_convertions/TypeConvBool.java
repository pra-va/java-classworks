package lt.pra_va.type_convertions;

import lt.itakademija.exam.converter.TypeConversionException;
import lt.itakademija.exam.converter.TypeConverter;

public class TypeConvBool implements TypeConverter<Boolean> {

	@Override
	public String format(Boolean bool) {
		return bool.toString();
	}

	@Override
	public Boolean parse(String stringText) {
		if (stringText.equals("false") || stringText.equals("true")) {
			return Boolean.parseBoolean(stringText);
		} else {
			throw new TypeConversionException("Impossible to convert " + stringText + " to boolean.");
		}
	}

}
