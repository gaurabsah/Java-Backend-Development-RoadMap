import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 4, 6, 7, 9, 10, 2);

//		adding each element with 10
		List<Integer> evenList = list.stream().map(m -> m + 10)
//				.toList();
				.collect(Collectors.toList());
		System.out.println(evenList);

//		adding element greater than 5 with 10
		List<Integer> map = list.stream().filter(f -> f > 5).map(m -> m + 10)
				.toList();
//				.collect(Collectors.toList());
		System.out.println(map);
	}

}
