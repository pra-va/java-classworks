package lt.pra_va;

import lt.itakademija.exam.constraint.ConstraintCheckerFactory;
import lt.itakademija.exam.converter.TypeConverterFactory;
import lt.itakademija.exam.document.DocumentConstraintsChecker;
import lt.itakademija.exam.document.DocumentInputsResolver;
import lt.itakademija.exam.test.BaseTest;
import lt.pra_va.document_constraints.ConstraintCheckerFactoryImplementation;
import lt.pra_va.document_validator.DocumentConstraintsCheckerImplementation;
import lt.pra_va.type_convertions.TypeConverterFactoryImpl;

public class ExamSolution extends BaseTest {

	@Override
	protected ConstraintCheckerFactory createConstraintCheckerFactory() {
		return new ConstraintCheckerFactoryImplementation();
	}

	@Override
	protected DocumentConstraintsChecker createDocumentConstraintsChecker(DocumentInputsResolver resolver,
			ConstraintCheckerFactory checker) {
		return new DocumentConstraintsCheckerImplementation(resolver, checker);
	}

	@Override
	protected TypeConverterFactory createTypeConverterFactory() {
		return new TypeConverterFactoryImpl();
	}

}
