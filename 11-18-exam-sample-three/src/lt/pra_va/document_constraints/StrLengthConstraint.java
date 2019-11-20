package lt.pra_va.document_constraints;

import lt.itakademija.exam.constraint.ConstraintChecker;
import lt.itakademija.exam.constraint.StringLength;
import lt.itakademija.exam.constraint.Violation;
import lt.itakademija.exam.document.DocumentInput;

public class StrLengthConstraint extends ConstraintChecker<StringLength> {

	public StrLengthConstraint(StringLength constraint) {
		super(constraint);
	}

	@Override
	public Violation check(DocumentInput input) {
		if (!input.hasValue()) {
			return null;
		}

		final long stringLength = input.getValue().toString().length();
		final long minLength = constraint.min();
		final long maxLength = constraint.max();
		System.out.println(minLength + " val");

		if (stringLength < minLength || stringLength > maxLength) {
			return new Violation(constraint, input.getFieldId(), "Faulty string length");
		}

		return null;
	}

}
