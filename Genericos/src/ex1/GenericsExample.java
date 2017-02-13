package ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GenericsExample {
	
	public void betterForCasting()
	{
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("Another string");
		
		String s = list.get(0);
		String s2 = list.get(1);
		
	}
	
	public void boxesTest()
	{
		List<Box> boxes = new ArrayList<>();
		Box box = new Box();
		box.setObject("unString");
		boxes.add(box);
	}

}
