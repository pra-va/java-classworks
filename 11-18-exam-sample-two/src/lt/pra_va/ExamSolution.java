package lt.pra_va;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;
import lt.itakademija.exam.test.BaseTest;

public class ExamSolution extends BaseTest {

	@Override
	protected Exercises createExercises() {
		return new Exercises() {

			@Override
			public boolean isSameObject(Object arg0, Object arg1) {
				return arg0 == arg1;
			}

			@Override
			public boolean isEqual(Object arg0, Object arg1) {
				return arg0.equals(arg1);
			}

			@Override
			public Integer findSmallest(List<Integer> arg0) {
				Integer smallestInteger = arg0.get(0);
				for (Integer integer : arg0) {
					if (integer < smallestInteger) {
						smallestInteger = integer;
					}
				}
				return smallestInteger;
			}

			@Override
			public Integer findLargest(List<Integer> arg0) {
				Integer smallestInteger = arg0.get(0);
				for (Integer integer : arg0) {
					if (integer > smallestInteger) {
						smallestInteger = integer;
					}
				}
				return smallestInteger;
			}

			@Override
			public IntegerGenerator createIntegerGenerator(int arg0, int arg1) {
				return new IntegerGeneratorImplementation(arg0, arg1);
			}

			@Override
			public IntegerGenerator createFilteredIntegerGenerator(IntegerGenerator generator, NumberFilter filter) {
				return new FilteredGenerator(generator, filter);
			}

			@Override
			public Map<Integer, Integer> countOccurrences(List<Integer> arg0) {
				Map<Integer, Integer> occurancesMap = new HashMap<Integer, Integer>();
				for (Integer integer : arg0) {
					if (occurancesMap.containsKey(integer)) {
						occurancesMap.put(integer, occurancesMap.get(integer) + 1);
					} else {
						occurancesMap.put(integer, 1);
					}
				}
				return occurancesMap;
			}

			@Override
			public List<Integer> consume(Iterator<Integer> iterator) {
				List<Integer> integers = new ArrayList<Integer>();
				if (iterator.hasNext()) {
					integers.add(iterator.next());
				}
				return integers;
			}

			@Override
			public int computeSumOfNumbers(int maxNumber, NumberFilter filter) {
				int sum = 0;
				for (int i = 1; i <= maxNumber; i++) {
					if (filter.accept(i)) {
						sum += i;
					}
				}
				return sum;
			}

			@Override
			public int computeSumOfNumbers(int number) {
				int sum = 0;
				for (int i = 1; i <= number; i++) {
					sum += i;
				}
				return sum;
			}

			@Override
			public List<Integer> computeNumbersUpTo(int maxNumber) {
				List<Integer> numbersIntegers = new ArrayList<Integer>();
				for (int i = 1; i < maxNumber; i++) {
					numbersIntegers.add(i);
				}
				return numbersIntegers;
			}
		};
	}

}
