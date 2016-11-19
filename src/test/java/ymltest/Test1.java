package ymltest;

import java.io.File;
import java.io.FileReader;
import java.util.Map;

import org.junit.Test;

import com.esotericsoftware.yamlbeans.YamlReader;

public class Test1 {

	@Test
	public void test1() throws Exception {
		File f = new File("/home/gim/git/ymltest/src/main/java/ymltest/contract.yml");

		YamlReader reader = new YamlReader(new FileReader(f));
		Object object = reader.read();
		System.out.println(object);
		Map map = (Map) object;
		System.out.println(map.get("address"));
	}

}
