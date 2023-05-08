package project.method.logs;

public class Component {

	static private String sectionTestcaseName(String testcaseName){
		return "<section id=\"" + testcaseName + "\" class=\"card shadow mb-4\"><div class=\"card-header d-flex justify-content-between align-items-center\"><h5 class=\"m-0 text-primary\">"+ testcaseName +"</h5>";
	}

	static private String sectionStatus(boolean sectionStatus){
		if(sectionStatus){
			return "<span class=\"align-self-center btn btn-success pe-none\">Pass</span>";
		}else{
			return "<span class=\"align-self-center btn btn-danger pe-none\">Fail</span>";
		}
	}

	static private String sectionDescription(String sectionDescription){
		return "<div class=\"card-body\"><p>" + sectionDescription + "</p></div>";
	}

	static private String sectionScreenshot(String sectionScreenshot){
		return "<div class=\"card-body\"><a href=\"" + sectionScreenshot + "\"><img src=\"" + sectionScreenshot + "\" class=\"rounded\" alt=\"...\" style=\"width: 450px\" /></a></div>";
	}

	static private String sectionCodeLine(String sectionCodeLine){
		return "<div><span><b>Code Line</b> - </span><span>" + sectionCodeLine + "</span></div>";
	}

	static private String sectionTimestamp(String sectionTimestamp){
		return "<div><span><b>Timestamp</b> - </span><span>" + sectionTimestamp + "</span></div>";
	}

	static public String section(String testcaseName, boolean sectionStatus, String sectionDescription, String sectionScreenshot, String sectionCodeLine){
		StringBuilder sectionComponent = new StringBuilder();

		sectionComponent.append(sectionTestcaseName(testcaseName));
		sectionComponent.append(sectionStatus(sectionStatus));
		sectionComponent.append("</div><div class=\"d-flex flex-column\"><div class=\"card-body d-flex justify-content-center \">");
		sectionComponent.append(sectionScreenshot(sectionScreenshot));
		sectionComponent.append(sectionDescription(sectionDescription));
		sectionComponent.append("</div><div class=\"card-footer d-flex justify-content-around\">");
		sectionComponent.append(sectionCodeLine(sectionCodeLine));
		sectionComponent.append(sectionTimestamp(DateTime.now()));
		sectionComponent.append("</div></div></section>");
		sectionComponent.append("<div hidden>$section</div>");

		return sectionComponent.toString();
	}

	static public String section(String testcaseName, String sectionDescription, String sectionScreenshot, String sectionCodeLine){
		StringBuilder sectionComponent = new StringBuilder();

		sectionComponent.append(sectionTestcaseName(testcaseName));
		sectionComponent.append("</div><div class=\"d-flex flex-column\"><div class=\"card-body d-flex justify-content-center \">");
		sectionComponent.append(sectionScreenshot(sectionScreenshot));
		sectionComponent.append(sectionDescription(sectionDescription));
		sectionComponent.append("</div><div class=\"card-footer d-flex justify-content-around\">");
		sectionComponent.append(sectionCodeLine(sectionCodeLine));
		sectionComponent.append(sectionTimestamp(DateTime.now()));
		sectionComponent.append("</div></div></section>");
		sectionComponent.append("<div hidden>$section</div>");

		return sectionComponent.toString();
	}

	static public String section(String testcaseName, String sectionDescription, String sectionCodeLine){
		StringBuilder sectionComponent = new StringBuilder();

		sectionComponent.append(sectionTestcaseName(testcaseName));
		sectionComponent.append("</div><div class=\"d-flex flex-column\"><div class=\"card-body d-flex justify-content-center \">");
		sectionComponent.append(sectionDescription(sectionDescription));
		sectionComponent.append("</div><div class=\"card-footer d-flex justify-content-around\">");
		sectionComponent.append(sectionCodeLine(sectionCodeLine));
		sectionComponent.append(sectionTimestamp(DateTime.now()));
		sectionComponent.append("</div></div></section>");
		sectionComponent.append("<div hidden>$section</div>");

		return sectionComponent.toString();
	}

	static public String section(String testcaseName, String sectionCodeLine){
		StringBuilder sectionComponent = new StringBuilder();

		sectionComponent.append(sectionTestcaseName(testcaseName));
		sectionComponent.append("</div><div class=\"d-flex flex-column\"><div class=\"card-body d-flex justify-content-center \">");
		sectionComponent.append("</div><div class=\"card-footer d-flex justify-content-around\">");
		sectionComponent.append(sectionCodeLine(sectionCodeLine));
		sectionComponent.append(sectionTimestamp(DateTime.now()));
		sectionComponent.append("</div></div></section>");
		sectionComponent.append("<div hidden>$section</div>");

		return sectionComponent.toString();
	}
}