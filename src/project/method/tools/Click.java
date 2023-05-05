package project.method.tools;

public class Click {
	
	static public void button(String xpath) {
		Generate.element(xpath).click();
	}
}
