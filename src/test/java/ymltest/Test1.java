package ymltest;

import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.esotericsoftware.yamlbeans.YamlReader;

public class Test1 {

	@SuppressWarnings("unchecked")
	@Test
	public void test1() throws Exception {
		File f = new File("contract.yml");
		System.out.println(f.getCanonicalPath());

		YamlReader reader = new YamlReader(new FileReader(f));
		Object object = reader.read();
		System.out.println(object);
		Map<?,?> map = (Map<?,?>) object;

		/*
    name: Nathan Sweet
    age: 28
    address: 4011 16th Ave S
    phone numbers:
     - name: Home
       number: 206-555-5138
     - name: Work
       number: 425-555-2306
		 */
		System.out.println();
		System.out.printf("name = %s\n", map.get("name"));
		System.out.printf("age = %s\n", map.get("age"));
		System.out.printf("address = %s\n", map.get("address"));
		System.out.printf("phone numbers = \n");
		List<Map<String, String>> nums = (List<Map<String, String>>)map.get("phone numbers");

		nums.forEach(e -> {
			System.out.printf("  name=%s, number=%s\n", e.get("name"), e.get("number"));
		});
	}

}
