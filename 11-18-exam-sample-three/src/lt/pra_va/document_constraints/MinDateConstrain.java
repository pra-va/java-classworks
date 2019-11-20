package lt.pra_va.document_constraints;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lt.itakademija.exam.constraint.ConstraintChecker;
import lt.itakademija.exam.constraint.MinDate;
import lt.itakademija.exam.constraint.Violation;
import lt.itakademija.exam.document.DocumentInput;

public class MinDateConstrain extends ConstraintChecker<MinDate> {

	public MinDateConstrain(MinDate constraint) {
		super(constraint);
	}

	@Override
	public Violation check(DocumentInput input) {
		if (!input.hasValue()) {
			return null;
		}

		final Date date = (Date) input.getValue();
		final MinDate minDate = constraint;
		final Date minDateValue;
		final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		try {
			minDateValue = dateFormat.parse(minDate.value());
		} catch (ParseException e) {
			throw new RuntimeException("Failed to parse date string.", e);
		}

		if (date.before(minDateValue)) {
			return new Violation(constraint, input.getFieldId(), "Date can not be earlier.");
		}

		return null;
	}
}