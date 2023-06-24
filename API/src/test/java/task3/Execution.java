package task3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Execution {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File file = new File("D:\\Krishna\\JAVA\\API\\src\\test\\resources\\JSONFiles\\write.json");
		ObjectMapper mapper = new ObjectMapper();
		
//		// To write
		Data d1 = new Data(7, "shri@2018", "shri", "Krishna", "https://jkdhsah");
		Data d2 = new Data(12, "sakthi@gmail", "shakthi", "Prakash", "jhjkj");
		List<Data> datas = new ArrayList<Data>();
		datas.add(d1);
		datas.add(d2);
		Support support = new Support("https://www.fb.com","Krishna");
		RootClass root = new RootClass(2,3,7,32,datas,support);
		mapper.writeValue(file, root);
	}

}
