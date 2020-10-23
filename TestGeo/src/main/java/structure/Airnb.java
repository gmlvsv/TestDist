package structure;

public class Airnb {
	private String id;
	private String name;
	private String last_review;
	private String neighbourhood_group_cleansed;
	private String neighbourhood_cleansed;
	private float review_scores_rating;
	private float review_scores_location;
	private float review_scores_value;
	private float latitude;
	private float longitude;
	private String property_type;
	private String room_type;
	private String accommodates;
	private int bathrooms;
	private int bedrooms;
	private String square_feet;
	private float price;
	private float security_deposit;
	private float cleaning_fee;
	private int guests_included;
	private int minimum_nights;
	private float number_of_reviews_ltm;
	private String last_review1;
	private float reviews_per_month;
	private int number_of_reviews;
	private int availability_365;
	private int crimes;
	
	public Airnb() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_review() {
		return last_review;
	}

	public void setLast_review(String last_review) {
		this.last_review = last_review;
	}

	public String getNeighbourhood_group_cleansed() {
		return neighbourhood_group_cleansed;
	}

	public void setNeighbourhood_group_cleansed(String neighbourhood_group_cleansed) {
		this.neighbourhood_group_cleansed = neighbourhood_group_cleansed;
	}

	public String getNeighbourhood_cleansed() {
		return neighbourhood_cleansed;
	}

	public void setNeighbourhood_cleansed(String neighbourhood_cleansed) {
		this.neighbourhood_cleansed = neighbourhood_cleansed;
	}

	public float getReview_scores_rating() {
		return review_scores_rating;
	}

	public void setReview_scores_rating(float review_scores_rating) {
		this.review_scores_rating = review_scores_rating;
	}

	public float getReview_scores_location() {
		return review_scores_location;
	}

	public void setReview_scores_location(float review_scores_location) {
		this.review_scores_location = review_scores_location;
	}

	public float getReview_scores_value() {
		return review_scores_value;
	}

	public void setReview_scores_value(float review_scores_value) {
		this.review_scores_value = review_scores_value;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public String getProperty_type() {
		return property_type;
	}

	public void setProperty_type(String property_type) {
		this.property_type = property_type;
	}

	public String getRoom_type() {
		return room_type;
	}

	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}

	public String getAccommodates() {
		return accommodates;
	}

	public void setAccommodates(String accommodates) {
		this.accommodates = accommodates;
	}

	public int getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}

	public int getBedrooms() {
		return bedrooms;
	}

	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}

	public String getSquare_feet() {
		return square_feet;
	}

	public void setSquare_feet(String square_feet) {
		this.square_feet = square_feet;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getSecurity_deposit() {
		return security_deposit;
	}

	public void setSecurity_deposit(float security_deposit) {
		this.security_deposit = security_deposit;
	}

	public float getCleaning_fee() {
		return cleaning_fee;
	}

	public void setCleaning_fee(float cleaning_fee) {
		this.cleaning_fee = cleaning_fee;
	}

	public int getGuests_included() {
		return guests_included;
	}

	public void setGuests_included(int guests_included) {
		this.guests_included = guests_included;
	}

	public int getMinimum_nights() {
		return minimum_nights;
	}

	public void setMinimum_nights(int minimum_nights) {
		this.minimum_nights = minimum_nights;
	}

	public float getNumber_of_reviews_ltm() {
		return number_of_reviews_ltm;
	}

	public void setNumber_of_reviews_ltm(float number_of_reviews_ltm) {
		this.number_of_reviews_ltm = number_of_reviews_ltm;
	}

	public String getLast_review1() {
		return last_review1;
	}

	public void setLast_review1(String last_review1) {
		this.last_review1 = last_review1;
	}

	public float getReviews_per_month() {
		return reviews_per_month;
	}

	public void setReviews_per_month(float reviews_per_month) {
		this.reviews_per_month = reviews_per_month;
	}

	public int getNumber_of_reviews() {
		return number_of_reviews;
	}

	public void setNumber_of_reviews(int number_of_reviews) {
		this.number_of_reviews = number_of_reviews;
	}

	public int getAvailability_365() {
		return availability_365;
	}

	public void setAvailability_365(int availability_365) {
		this.availability_365 = availability_365;
	}

	public int getCrimes() {
		return crimes;
	}

	public void setCrimes(int crimes) {
		this.crimes = crimes;
	}

	@Override
	public String toString() {
		return "Airnb [id=" + id + ", name=" + name + ", last_review=" + last_review + ", neighbourhood_group_cleansed="
				+ neighbourhood_group_cleansed + ", neighbourhood_cleansed=" + neighbourhood_cleansed
				+ ", review_scores_rating=" + review_scores_rating + ", review_scores_location="
				+ review_scores_location + ", review_scores_value=" + review_scores_value + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", property_type=" + property_type + ", room_type=" + room_type
				+ ", accommodates=" + accommodates + ", bathrooms=" + bathrooms + ", bedrooms=" + bedrooms
				+ ", square_feet=" + square_feet + ", price=" + price + ", security_deposit=" + security_deposit
				+ ", cleaning_fee=" + cleaning_fee + ", guests_included=" + guests_included + ", minimum_nights="
				+ minimum_nights + ", number_of_reviews_ltm=" + number_of_reviews_ltm + ", last_review1=" + last_review1
				+ ", reviews_per_month=" + reviews_per_month + ", number_of_reviews=" + number_of_reviews
				+ ", availability_365=" + availability_365 + ", crimes=" + crimes + "]";
	}
	
	
}
