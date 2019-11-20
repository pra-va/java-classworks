package lt.pra_va.document_validator;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

import lt.itakademija.exam.constraint.ConstraintChecker;
import lt.itakademija.exam.constraint.ConstraintCheckerFactory;
import lt.itakademija.exam.constraint.NotNull;
import lt.itakademija.exam.constraint.Violation;
import lt.itakademija.exam.constraint.Violations;
import lt.itakademija.exam.document.Document;
import lt.itakademija.exam.document.DocumentConstraintsChecker;
import lt.itakademija.exam.document.DocumentInput;
import lt.itakademija.exam.document.DocumentInputsResolver;

public class DocumentConstraintsCheckerImplementation extends DocumentConstraintsChecker {

	private DocumentInputsResolver documentInputsResolver;

	public DocumentConstraintsCheckerImplementation(DocumentInputsResolver documentInputsResolver,
			ConstraintCheckerFactory constraintCheckerFactory) {
		super(documentInputsResolver, constraintCheckerFactory);

		this.documentInputsResolver = documentInputsResolver;
	}

	@Override
	public Violations validate(Document document) {
		List<Violation> violationsList = new ArrayList<Violation>();

		for (DocumentInput input : getDocumentInputs(document)) {
			for (Annotation constraint : getDocumentInputConstraints(input)) {
				ConstraintChecker constraintChecker = constraintCheckerFactory.createFor(constraint);
				if (constraintChecker == null) {
					continue;
				} else if (constraintChecker.check(input).getConstraint() instanceof NotNull) {
					violationsList.add(new Violation(constraintChecker.check(input).getConstraint(), input.getFieldId(),
							"Input can not be null."));
				}

				final Violation violation = constraintChecker.check(input);
				System.out.println(input.getValue());
				violationsList.add(violation);
			}
		}

		return new Violations(violationsList);
	}

}
