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

public class MySolutions extends BaseTest {

	@Override
	protected Exercises createExercises() {
		return new Exercises() {

			@Override
			public boolean isSameObject(Object arg0, Object arg1) {
				if (arg0 == arg1) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public boolean isEqual(Object arg0, Object arg1) {
				if (arg0.equals(arg1)) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public Integer findSmallest(List<Integer> arg0) {
				int smallestInt = arg0.get(0).intValue();
				for (int i = 0; i < arg0.size(); i++) {
					if (arg0.get(i).intValue() < smallestInt) {
						smallestInt = arg0.get(i).intValue();
					}
				}
				return smallestInt;
			}

			@Override
			public Integer findLargest(List<Integer> arg0) {
				int largestInt = arg0.get(0).intValue();
				for (int i = 0; i < arg0.size(); i++) {
					if (arg0.get(i).intValue() > largestInt) {
						largestInt = arg0.get(i).intValue();
					}
				}
				return largestInt;
			}

			@Override
			public IntegerGenerator createIntegerGenerator(int arg0, int arg1) {
				return new MyIntGenerator(arg0, arg1);
			}

			@Override
			public IntegerGenerator createFilteredIntegerGenerator(IntegerGenerator arg0, NumberFilter arg1) {
				return new MyFilteredIntGenerator(arg0, arg1);
			}

			@Override
			public Map<Integer, Integer> countOccurrences(List<Integer> arg0) {
				Map<Integer, Integer> occurrences = new HashMap<Integer, Integer>();
				for (int i = 0; i < arg0.size(); i++) {
					int occurrencesNumber = 0;
					for (int j = i; j < arg0.size(); j++) {
						if (occurrences.containsKey(arg0.get(i).intValue())) {
							break;
						}
						if (arg0.get(i).intValue() == arg0.get(j).intValue()) {
							occurrencesNumber++;
						}
					}
					if (occurrencesNumber > 0) {
						occurrences.put(arg0.get(i), occurrencesNumber);
					}

				}
				return occurrences;
			}

			@Override
			public List<Integer> consume(Iterator<Integer> arg0) {
				ArrayList<Integer> list = new ArrayList<Integer>();
				while (arg0.hasNext()) {
					list.add(arg0.next());
				}
				return list;
			}

			@Override
			public int computeSumOfNumbers(int arg0, NumberFilter arg1) {
				int sumOfFilteredNumbers = 0;
				for (int i = 1; i <= arg0; i++) {
					if (arg1.accept(i)) {
						sumOfFilteredNumbers += i;
					}
				}
				return sumOfFilteredNumbers;
			}

			@Override
			public int computeSumOfNumbers(int arg0) {
				int sum = 0;
				for (int i = 1; i <= arg0; i++) {
					sum += i;
				}
				System.out.println(sum);
				return sum;
			}

			@Override
			public List<Integer> computeNumbersUpTo(int arg0) {
				ArrayList<Integer> numbersList = new ArrayList<Integer>();
				int sum = 0;
				for (int i = 1; i < arg0; i++) {
					numbersList.add(i);
				}
				return numbersList;
			}
		};
	}

}
