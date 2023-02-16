package LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class StudentDto{
	
	private String name;
	
	private String rollNo;

	public StudentDto(String name, String rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	
}

public class PredicateList {

	public static void main(String[] args) {
		
		Predicate<Object> emptyAndNullCheck = (e) -> {
			return null != e && !e.toString().isEmpty();
		};
		
		List<String> nameList = new ArrayList<>();
		nameList.add("sana");
		nameList.add("");
		nameList.add("naveen");
		nameList.add(null);
		
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(21);
		intList.add(16);
		intList.add(null);

		List<String> finalNameList = filterList(nameList,emptyAndNullCheck);
		System.out.println(finalNameList);
		
		List<Integer> finIntegersList = filterList(intList,emptyAndNullCheck);
		System.out.println(finIntegersList);
		
		
		StudentDto studentDto = new StudentDto("naveen", "101");
		StudentDto studentDto1 = new StudentDto("sana", "102");
		StudentDto studentDto2 = null;
		List<StudentDto> studentDtos = new ArrayList<StudentDto>();
		studentDtos.add(studentDto);
		studentDtos.add(studentDto1);
		studentDtos.add(studentDto2);
		
		List<StudentDto> finalStudentDtos = filterList(studentDtos, emptyAndNullCheck);
		
		for(StudentDto dto : finalStudentDtos) {
			System.out.println(dto.getName());
			System.out.println(dto.getRollNo());
		}
		
	}

	private static <T> List<T> filterList(List<T> list, Predicate<Object> predicate) {
		
		List<T> result = new ArrayList<T>();
		for(T t : list) {
			if(predicate.test(t))
				result.add(t);
		}
		return result;
	}
	
}
