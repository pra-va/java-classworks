package lt.pra_va.document_constraints;

import lt.itakademija.exam.constraint.ConstraintChecker;
import lt.itakademija.exam.constraint.NotNull;
import lt.itakademija.exam.constraint.Violation;
import lt.itakademija.exam.document.DocumentInput;

public class NotNullConstrain extends ConstraintChecker<NotNull> {

	public NotNullConstrain(NotNull constraint) {
		super(constraint);
	}

	@Override
	public Violation check(DocumentInput input) {
		if (!input.hasValue()) {
			return new Violation(constraint, input.getFieldId(), "Input can not be null.");
		}

		return null;
	}

}
