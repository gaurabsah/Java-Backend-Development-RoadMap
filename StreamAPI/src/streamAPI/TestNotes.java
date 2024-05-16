package streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * How to convert a List of objects into a Map 
 * by considering duplicated keys and store them in sorted order?
 */

class Notes {

	private int id;
	private String tagName;
	private int tagId;

	public Notes() {

	}

	public Notes(int id, String tagName, int tagId) {
		super();
		this.id = id;
		this.tagName = tagName;
		this.tagId = tagId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public int getTagId() {
		return tagId;
	}

	public void setTagId(int tagId) {
		this.tagId = tagId;
	}

}

public class TestNotes {
	public static void main(String[] args) {
		List<Notes> noteLst = new ArrayList<>();
		noteLst.add(new Notes(1, "note1", 11));
		noteLst.add(new Notes(2, "note2", 22));
		noteLst.add(new Notes(3, "note3", 33));
		noteLst.add(new Notes(4, "note4", 44));
		noteLst.add(new Notes(5, "note5", 55));

		noteLst.add(new Notes(6, "note4", 66));

		Map<String, Integer> notesRecords = noteLst.stream()
				.sorted(Comparator.comparingLong(Notes::getTagId).reversed()) // sorting
																				// is
																				// based
																				// on
																				// TagId
																				// 55,44,33,22,11
				.collect(Collectors.toMap(Notes::getTagName, Notes::getTagId, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new));
		// consider old value 44 for dupilcate key
		// it keeps order
		System.out.println("Notes : " + notesRecords);
		
		
		
		/*
		 * How to check if list is empty in Java 8 using Optional, 
		 * if not null iterate through the list and print the object?
		 */
		
//		Optional.ofNullable(noteLst)
//        .orElseGet(Collections::emptyList) // creates empty immutable list: [] in case noteLst is null
//        .stream().filter(Objects::nonNull) //loop throgh each object and consider non null objects
//        .map(note -> Notes::getTagName) // method reference, consider only tag name
//        .forEach(System.out::println); // it will print tag names
		
		
	}
}


