package lt.pra_va.document_constraints;

import lt.itakademija.exam.constraint.ConstraintChecker;
import lt.itakademija.exam.constraint.MaxNumber;
import lt.itakademija.exam.constraint.Violation;
import lt.itakademija.exam.document.DocumentInput;

public class MaxNumberConstrain extends ConstraintChecker<MaxNumber> {

	public MaxNumberConstrain(MaxNumber constraint) {
		super(constraint);
	}

	@Override
	public Violation check(DocumentInput input) {
		if (!input.hasValue()) {
			return null;
		}

		long inputValue = Long.parseLong(input.getValue().toString());

		if (inputValue > constraint.value()) {
			return new Violation(constraint, input.getFieldId(), "Number is to large.");
		}

		return null;
	}

}
