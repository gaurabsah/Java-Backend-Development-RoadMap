import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// toList() from jdk 16

public class Filter {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 4, 6, 7, 9, 10, 2);
		
//		finding the even number
		List<Integer> evenList = list.stream().filter(f -> f % 2 == 0)
				.toList();
//				.collect(Collectors.toList());
		System.out.println(evenList);
		
		List<Integer> map = list.stream().filter(f -> f > 5)
				.toList();
		System.out.println(map);
	}

}
