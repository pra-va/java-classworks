package lt.pra_va.type_convertions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lt.itakademija.exam.converter.TypeConversionException;
import lt.itakademija.exam.converter.TypeConverter;

public final class TypeConvDate implements TypeConverter<Date> {

	public static final String DATE_FORMAT = "yyyy-MM-dd";

	@Override
	public Date parse(String value) {
		if (value == null) {
			return null;
		}

		try {
			return new SimpleDateFormat(DATE_FORMAT).parse(value);
		} catch (ParseException e) {
			throw new TypeConversionException(String.format("Failed to parse value '%s' to java.util.Date", value), e);
		}
	}

	@Override
	public String format(Date value) {
		if (value == null) {
			return null;
		}

		return new SimpleDateFormat(DATE_FORMAT).format(value);
	}

}
