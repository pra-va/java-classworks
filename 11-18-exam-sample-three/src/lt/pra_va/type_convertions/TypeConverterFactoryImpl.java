package lt.pra_va.type_convertions;

import java.util.Date;

import lt.itakademija.exam.converter.TypeConverter;
import lt.itakademija.exam.converter.TypeConverterFactory;

public class TypeConverterFactoryImpl implements TypeConverterFactory {

	@Override
	public <T> TypeConverter<T> create(Class<T> dataType) {
		TypeConverter result;

		if (Date.class == dataType) {
			result = new TypeConvDate();
		} else if (dataType == Boolean.class) {
			result = new TypeConvBool();
		} else if (dataType == String.class) {
			result = new TypeConvStr();
		} else if (Long.class == dataType) {
			result = new TypeConvLong();
		} else {
			throw new IllegalArgumentException("Unsupported dataType type passed");
		}

		return result;
	}

}
