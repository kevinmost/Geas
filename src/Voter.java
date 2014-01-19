import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;

public class Voter {
	
	static ArrayList<List<String>> pollLists = new ArrayList<List<String>>(); // List containing the polls used. Each element is another List containing two elements (the poll URL and the name of the item we want to vote for)
	
	static final String TABLE_FORMAT = "%-11s%-40s%-10s%-20s%-5s\n"; // Table format for when we display the votes that were done
	
	static String url; // The variable that holds the URL
	static String choice; // The variable that holds the choice we are selecting
	static Poll poll;
	
	static SimpleDateFormat sdf = new SimpleDateFormat("h:mm:ss a");

	
	public static void main(String[] args) {
		java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(Level.OFF); // Suppress HtmlUnit's warnings
		java.util.logging.Logger.getLogger("java.net.SocketException").setLevel(Level.OFF); // Suppress SocketException's warnings
		java.util.logging.Logger.getLogger("org.apache.http.impl.client.DefaultHttpClient").setLevel(Level.OFF); // Suppress HttpClient's warnings
		java.util.logging.Logger.getLogger("org.apache.http.NoHttpResponseException").setLevel(Level.OFF); // Suppress HttpClient's warnings

		// Index 0: URL for the poll
		// Index 1: Name of the poll option you want to select. This name does not have to be exact. The actual poll option only has to contain what you type in as your value, and what you type must be unique in the poll options
		// EXAMPLE: pollLists.add(Arrays.asList("http://www.poll.com/samplePoll", "sampleChoice"));
		
		System.out.format(TABLE_FORMAT, "Date", "Poll Title", "Choice Made", "IP Address", "Vote #");
		System.out.format(TABLE_FORMAT, "----", "----------", "-----------", "----------", "------");


		for(int i = 0; i < Integer.MAX_VALUE; i++) { // You can set how many times the program runs here
			for (List<String> pollList : pollLists) {
				try { 
					// Take the next entry in the iterator and stores its key and value into "url" and "choice", respectively
					url = pollList.get(0);
					choice = pollList.get(1);

					poll = new Poll(url); // Create a poll object of this URL and that will click on your specified value
					poll.vote(choice); // Vote for the previously-specified value

					System.out.format(TABLE_FORMAT, // Prints table of:
							sdf.format(new Date()), // 40 chars: Formatted time
							poll.getPollTitle(), // 40 chars: Poll title
							choice, // 30 chars: Poll option choice
							poll.getIpAddress(), // 25 chars: IP address used
							poll.getVoteCount(choice)); // 5 chars: Current option vote count


					poll.close(); // Close this page
				}
				catch (Exception e) { // If we encounter any errors, just print an error message and keep going
					System.err.println("Something went wrong with" + url + ". Continuing...");
				}
			}
		}

	}
}
