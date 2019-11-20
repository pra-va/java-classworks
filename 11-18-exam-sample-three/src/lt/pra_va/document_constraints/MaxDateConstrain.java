package lt.pra_va.document_constraints;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lt.itakademija.exam.constraint.ConstraintChecker;
import lt.itakademija.exam.constraint.MaxDate;
import lt.itakademija.exam.constraint.Violation;
import lt.itakademija.exam.document.DocumentInput;

public class MaxDateConstrain extends ConstraintChecker<MaxDate> {

	public MaxDateConstrain(MaxDate constraint) {
		super(constraint);
	}

	@Override
	public Violation check(DocumentInput input) {
		if (!input.hasValue()) {
			return null;
		}

		final Date date = (Date) input.getValue();
		final MaxDate maxDate = constraint;
		final Date maxDateValue;
		final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		try {
			maxDateValue = dateFormat.parse(maxDate.value());
		} catch (ParseException e) {
			throw new RuntimeException("Failed to parse date string.", e);
		}

		if (date.after(maxDateValue)) {
			return new Violation(constraint, input.getFieldId(), "Date can not be after.");
		}

		return null;
	}

}
