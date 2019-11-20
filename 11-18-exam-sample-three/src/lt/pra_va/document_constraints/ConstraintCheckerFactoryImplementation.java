package lt.pra_va.document_constraints;

import java.lang.annotation.Annotation;

import lt.itakademija.exam.constraint.ConstraintChecker;
import lt.itakademija.exam.constraint.ConstraintCheckerFactory;
import lt.itakademija.exam.constraint.MaxDate;
import lt.itakademija.exam.constraint.MaxNumber;
import lt.itakademija.exam.constraint.MinDate;
import lt.itakademija.exam.constraint.MinNumber;
import lt.itakademija.exam.constraint.NotNull;
import lt.itakademija.exam.constraint.StringLength;

public class ConstraintCheckerFactoryImplementation implements ConstraintCheckerFactory {

	@Override
	public ConstraintChecker createFor(Annotation constraint) {
		if (constraint instanceof MinDate) {
			return new MinDateConstrain((MinDate) constraint);
		} else if (constraint instanceof MaxDate) {
			return new MaxDateConstrain((MaxDate) constraint);
		} else if (constraint instanceof NotNull) {
			return new NotNullConstrain((NotNull) constraint);
		} else if (constraint instanceof MinNumber) {
			return new MinNumberConstrain((MinNumber) constraint);
		} else if (constraint instanceof MaxNumber) {
			return new MaxNumberConstrain((MaxNumber) constraint);
		} else if (constraint instanceof StringLength) {
			return new StrLengthConstraint((StringLength) constraint);
		}
		return null;
	}

}
