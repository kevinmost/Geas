import java.io.IOException;
import java.net.MalformedURLException;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.CookieManager;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.ProxyConfig;
import com.gargoylesoftware.htmlunit.TextPage;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlHeading1;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlRadioButtonInput;

public class Poll {
	static WebClient client; // Browser
	static ProxyConfig proxy; // Tor proxy
	static CookieManager cookies; // Cookies
	
	static HtmlPage page; // Webpage for the poll
	
	static String pollTitle; // Get the title of the poll
	static HtmlDivision voteCountDiv; // Text for the choice you selected
	static HtmlRadioButtonInput choiceButton; // Input for the choice you selected

	public Poll(String url) throws FailingHttpStatusCodeException, MalformedURLException, IOException {
		if (client == null) { // Only do this when the client hasn't been initialized yet
			client = new WebClient(BrowserVersion.FIREFOX_17); // Other browser versions may not work as smoothly in HtmlUnit

			cookies = new CookieManager(); 
			client.setCookieManager(cookies);

			proxy = new ProxyConfig("proxy.com", 9150, true); // Place the URL for your TOR proxy here
			// client.getOptions().setProxyConfig(proxy); // Uncomment this line to use a proxy
		}
		page = client.getPage(url); // Get the poll page
	}

	public void vote(String choice) throws IOException {
		choiceButton = (HtmlRadioButtonInput) page.getByXPath("//input[contains(@data-side-label, '" + choice + "')]").get(0); // Get the element for the poll option that you want
		choiceButton.click(); // Click it
	}
	public void close() {
		client.closeAllWindows();
		cookies.clearCookies();
	}

	public String getIpAddress() throws FailingHttpStatusCodeException, MalformedURLException, IOException {
		return ((TextPage) client.getPage("http://www.icanhazip.com")).getContent().trim(); // Returns your IP address
	}
	public String getPollTitle() {
		return ((HtmlHeading1) page.getElementsByTagName("h1").get(0)).getTextContent(); // Returns this poll's title
	}
	public String getVoteCount(String choice) {
		voteCountDiv = (HtmlDivision) page.getByXPath("//div[contains(@title, '" + choice + "')]").get(0); // Gets the text for the poll option we want
		String voteCount = voteCountDiv.getElementsByTagName("strong").get(1).getTextContent(); // Gets the 2nd "strong" element, which contains the vote-count
		int begin = 0;
		int end = voteCount.indexOf("votes,");
		voteCount = voteCount.substring(begin, end).replaceAll(",", "").trim(); // Gets text before "votes," and then removes commas and whitespace (which is just the vote-count)
		return voteCount; // Returns vote count
	}
}