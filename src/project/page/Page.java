package project.page;

import project.method.tools.Click;
import project.xpath.PageXPath;

public class Page {

	static public void login() {
		Click.button(PageXPath.signIn);
	}

	static public void enterStore() {
		Click.button(PageXPath.enterStore);
	}

	static public void clickFish() {
		Click.button(PageXPath.fish);
	}

	static public void clickDogs() {
		Click.button(PageXPath.dogs);
	}

	static public void clickReptiles() {
		Click.button(PageXPath.reptiles);
	}

	static public void clickCats() {
		Click.button(PageXPath.cats);
	}

	static public void clickBirds() {
		Click.button(PageXPath.birds);
	}

}
