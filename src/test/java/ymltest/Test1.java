package ymltest;

import java.io.File;
import java.io.FileReader;
import java.util.Map;

import org.junit.Test;

import com.esotericsoftware.yamlbeans.YamlReader;

public class Test1 {

	@Test
	public void test1() {
		File f = new File("/pang/git/src/main/java/ymltest/contract.yml");
		System.out.println(f.exists());
		
		
		 YamlReader reader = new YamlReader(new FileReader("contact.yml"));
		    Object object = reader.read();
		    System.out.println(object);
		    Map map = (Map)object;
		    System.out.println(map.get("address"));
	}

}
