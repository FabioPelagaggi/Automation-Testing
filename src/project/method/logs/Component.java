package project.method.logs;

public class Component {

	static public String section(){
		StringBuilder sectionComponent = new StringBuilder();
		sectionComponent.append("<section id=\"Test Item 1\" class=\"card shadow mb-4\">");
		sectionComponent.append("<div class=\"card-header d-flex justify-content-between align-items-center\">");
		sectionComponent.append("<h5 class=\"m-0 text-primary\">");
		sectionComponent.append("Test Item 1");
		sectionComponent.append("</h5>");
		sectionComponent.append("<span class=\"align-self-center btn btn-success\">Pass</span>");
		sectionComponent.append("</div>");
		sectionComponent.append("<div class=\"d-flex flex-column\">");
		sectionComponent.append("<div class=\"card-body d-flex justify-content-center \">");
		sectionComponent.append("<div>");
		sectionComponent.append("<img src=\"/src/project/html/template/screenshots/screenshot_3.png\" class=\"rounded\" alt=\"...\" style=\"width: 450px\" />");
		sectionComponent.append("</div>");
		sectionComponent.append("<div class=\"card-body ms-5 m-2\">");
		sectionComponent.append("<b>Access Dogs Page.</b>");
		sectionComponent.append("<p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quisquam, voluptatum.</p>");
		sectionComponent.append("</div>");
		sectionComponent.append("</div>");
		sectionComponent.append("<div class=\"card-footer d-flex justify-content-around\">");
		sectionComponent.append("<div>");
		sectionComponent.append("<span><b>Code Line</b> - </span>");
		sectionComponent.append("<span>125</span>");
		sectionComponent.append("</div>");
		sectionComponent.append("<div>");
		sectionComponent.append("<span><b>Timestamp</b> - </span>");
		sectionComponent.append("<span>13:22:35 [23/04/2023]</span>");
		sectionComponent.append("</div>");
		sectionComponent.append("</div>");
		sectionComponent.append("</div>");
		sectionComponent.append("</section>");
		return sectionComponent.toString();
	}

}