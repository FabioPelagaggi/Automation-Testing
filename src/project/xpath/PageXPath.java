package project.xpath;

import project.method.tools.Generate;

public class PageXPath {
	static public String signIn = Generate.xpath("span", "class", "sign-text", "Sign In");
	static public String enterStore = Generate.xpath("a", "Enter the Store");
	static public String fish = Generate.xpath("a", "href", "FISH");
	static public String dogs = Generate.xpath("a", "href", "DOGS");
	static public String reptiles = Generate.xpath("a", "href", "REPTILES");
	static public String cats = Generate.xpath("a", "href", "CATS");
	static public String birds = Generate.xpath("a", "href", "BIRDS");

}
