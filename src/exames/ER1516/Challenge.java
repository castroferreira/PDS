package Exame;
public class Challenge {
	private String title, description;
	private Seeker postedBy;
	private double award;
	private ChallengeType type;
	
	public Challenge(String title, String description, Seeker postedBy, double premio, ChallengeType type) {
		this.title = title;
		this.description = description;
		this.postedBy = postedBy;
		this.award = premio;
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public Seeker getPostedBy() {
		return postedBy;
	}

	public double getAward() {
		return award;
	}

	public ChallengeType getType() {
		return type;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPostedBy(Seeker postedBy) {
		this.postedBy = postedBy;
	}

	public void setAward(double award) {
		this.award = award;
	}

	public void setType(ChallengeType type) {
		this.type = type;
	}

	public String toString() {
		return "Challenge [title=" + title + ", description=" + description + ", postedBy=" + postedBy + ", award="
				+ award + ", deadline=" + ", type=" + type + "]";
	}
	
}
