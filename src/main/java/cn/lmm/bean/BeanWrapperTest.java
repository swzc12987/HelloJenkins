package cn.lmm.bean;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;

import org.junit.Test;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class BeanWrapperTest {

	

	@Test
	public void test01() throws Exception {
		Person person = new Person(1111, "zc", 1);
		BeanWrapper bw = new BeanWrapperImpl(new Person(1111, "zc", 1));
		PropertyDescriptor[] pds = bw.getPropertyDescriptors();
		for (PropertyDescriptor pd : pds) {
			Object propertyValue = bw.getPropertyValue(pd.getName());
			System.out.printf(bw.toString() + ":" + propertyValue + "\n");
		}
		Person person2 = bw.convertIfNecessary(person, Person.class);
		Field field = Person.class.getDeclaredField("id");
		Person person3 = bw.convertIfNecessary(person, Person.class, field);
		System.out.println(person3);
		
	}
}
