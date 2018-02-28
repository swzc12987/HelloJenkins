package cn.lmm.bean;

import java.io.Serializable;

public class Person implements Serializable{

	private Integer id;
	private String name;
	private Integer classId;
	
	public Person() {}
	
	public Person(Integer id, String name, Integer classId) {
		this.id = id;
		this.name = name;
		this.classId = classId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [id=").append(id).append(", name=").append(name).append(", classId=").append(classId)
				.append("]");
		return builder.toString();
	}
}
