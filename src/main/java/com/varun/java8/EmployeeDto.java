package com.varun.java8;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.style.ToStringCreator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDto {

	private int id;
	private String name;
	private String email;
	private Long mobile;
	
	public EmployeeDto(int id, String name, String email, Long mobile) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.abc = null;
	}

	@Override
	public String toString() {
		ToStringCreator creator = new ToStringCreator(this);
		return creator.toString();
	}
	
	public List<EmployeeDto> getMockObjs(){
		List<EmployeeDto> dtos = new ArrayList<>();
		dtos.add(new EmployeeDto(9, "abc", "abc@gmail.com", 9966099511L));
		dtos.add(new EmployeeDto(7, "def", "def@gmail.com", 1166099511L));
		dtos.add(new EmployeeDto(8, "ghf", "ghf@gmail.com", 8166099511L));
		dtos.add(new EmployeeDto(4, "hik", "hik@gmail.com", 4566099511L));
		dtos.add(new EmployeeDto(6, "xyz", "xyz@gmail.com", 2266099511L));
		dtos.add(new EmployeeDto(5, "cab", "cab@gmail.com", 3166099511L));
		dtos.add(new EmployeeDto(1, "mno", "mno@gmail.com", 6366099511L));
		return dtos;
	}
	
	private final String abc;
	//abc = "asddf";
	
	void gste() {
		
	}
}
