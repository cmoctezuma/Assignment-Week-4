import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AssingmentWeek4 {

	public static void main(String[] args) {
		System.out.println("Hello world");

		// 1

		ArrayList<String> employeeNames = new ArrayList<String>();

		// 2

		Set<Integer> ids = new HashSet<Integer>();

		// 3

		Map<Integer, String> employeeMap = new HashMap<Integer, String>();

		// 4

		employeeNames.add("Rachel");
		employeeNames.add("Ross");
		employeeNames.add("Phoebe");
		employeeNames.add("Monica");
		employeeNames.add("Chandler");

		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);

		// 5

		System.out.println("-- 5 --");

		int i = 0;

		for (Integer id : ids) {
			System.out.println(id + " " + employeeNames.get(i));
			employeeMap.put(id, employeeNames.get(i));
			i++;
		}

		// 6

		System.out.println("-- 6 --");

		for (Integer id : employeeMap.keySet()) {
			System.out.println("ID: " + id + " " + employeeMap.get(id));

		}

		// 7

		StringBuilder idsBuilder = new StringBuilder();

		// 8

		System.out.println("-- 8 --");

		for (Integer id : ids) {
			idsBuilder.append(id + "-");

		}

		// 9
		System.out.println("-- 9 --");
		System.out.println(idsBuilder.toString());

		// 10

		StringBuilder nameBuilder = new StringBuilder();

		// 11

		for (String employeeName : employeeNames) {
			nameBuilder.append(employeeName + " ");
		}
		//12 
		
		System.out.println("-- 12 --");
		System.out.println(nameBuilder.toString());

	}

}
