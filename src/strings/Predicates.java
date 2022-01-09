package strings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Predicates {

	static BiPredicate< Integer, Double> bi= (a,b) -> {
		return a > 3.5 && b > 3;
	};

	static Function<List<Student>,Map<String,Integer>> fun= (a) -> {
		Map<String,Integer> map= new HashMap<>();
		a.forEach(each -> {
			map.put(each.getName(), each.getGradeLevel());
		});
		return map;
	};

	static UnaryOperator<String> un= (s) -> s.concat("Kanav Ji");
	static BinaryOperator<Integer> bn=(s,t)-> s*t; 

	public static void main(String[] args) {

		testBiPredicate(StudentDataBase.getAllStudents());
		testFunction(StudentDataBase.getAllStudents());
		testUniaryOperator(StudentDataBase.getAllStudents().get(1).getName());
		testBinaryOperator(StudentDataBase.getAllStudents().get(1).getGradeLevel(),
				StudentDataBase.getAllStudents().get(2).getGradeLevel());

	}

	private static void testBinaryOperator(int gradeLevel, int gradeLevel2) {
		System.out.println(bn.apply(gradeLevel, gradeLevel2));

	}

	private static void testUniaryOperator(String name) {
		System.out.println(un.apply(name));
	}

	private static void testFunction(List<Student> name) {
		System.out.println(fun.apply(name));
	}

	private static void testBiPredicate(List<Student> list) {

		list.forEach((a -> {
			System.out.println(bi.test(a.getGradeLevel(), a.getGpa()));
		}));

	}

}