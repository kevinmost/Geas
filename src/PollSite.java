
public interface PollSite {
	String getPollTitle();
	String[] getChoices();
	String[] getVoteCounts();
	void vote();
}
