package org.task2;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;



public class Execution {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File file = new File("D:\\Krishna\\JAVA\\API\\src\\test\\resources\\JSONFiles\\ListUser2.json");
		ObjectMapper mapper = new ObjectMapper();
		// To Read
		RootClass rootClass = mapper.readValue(file, RootClass.class);
		System.out.println(rootClass.getPage());
		System.out.println(rootClass.getper_page());
		System.out.println(rootClass.getTotal());
		System.out.println(rootClass.gettotal_pages());
		
		List<Data> data = rootClass.getData();
		for (Data d : data) {
			System.out.println(d.getId());
			System.out.println(d.getEmail());
			System.out.println(d.getfirst_name());
			System.out.println(d.getlast_name());
			System.out.println(d.getAvatar());

		}
		Support support = rootClass.getSupport();
		System.out.println(support.getUrl());
		System.out.println(support.getText());
	}

}
