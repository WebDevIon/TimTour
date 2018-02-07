package com.example.webdevion.timtour;

/**
 * {@link Place} represents a location that the user wants to visit.
 * It contains a name for the location, working hours if it applies to that location, address of the location, the rating of the location if that applies as well, and an image for that location.
 */
public class Place {

    // Name of the place.
    private String mNameOfPlace;

    // Working hours.
    private String mWorkingHours = NO_WORKING_HOURS_PROVIDED;

    // Address of the place.
    private String mAddress;

    // Rating of the place;
    private String mRating = NO_RATING_PROVIDED;

    // Image resource ID for the place;
    private int mImageResourceId;

    /** Constant value that represents no working hours was provided for this place */
        private static final String NO_WORKING_HOURS_PROVIDED = null;

    /** Constant value that represents no rating was provided for this place */
    private static final String NO_RATING_PROVIDED = null;

    /**
     * Create a new Place object.
     *
     * @param nameOfPlace is the name of the place that we display in our list.
     * @param workingHours represents the hours when you can visit that place.
     * @param address is the address of the place.
     * @param rating is the rating of the place.
     * @param imageResourceId is the drawable resource ID for the image associated with the place.
     */
    public Place(String nameOfPlace, String workingHours, String address, String rating, int imageResourceId) {
        mNameOfPlace = nameOfPlace;
        mWorkingHours = workingHours;
        mAddress = address;
        mRating = rating;
        mImageResourceId = imageResourceId;
    }

    /**
     * Create a new Place object.
     *
     * @param nameOfPlace is the name of the place that we display in our list.
     * @param workingHours represents the hours when you can visit that place.
     * @param address is the address of the place.
     * @param imageResourceId is the drawable resource ID for the image associated with the place.
     */
    public Place(String nameOfPlace, String workingHours, String address, int imageResourceId) {
        mNameOfPlace = nameOfPlace;
        mWorkingHours = workingHours;
        mAddress = address;
        mImageResourceId = imageResourceId;
    }

    /**
     * Create a new Place object.
     *
     * @param nameOfPlace is the name of the place that we display in our list.
     * @param address is the address of the place.
     * @param imageResourceId is the drawable resource ID for the image associated with the place.
     */
    public Place(String nameOfPlace, String address, int imageResourceId) {
        mNameOfPlace = nameOfPlace;
        mAddress = address;
        mImageResourceId = imageResourceId;
    }

    // Get the name of the place.
    public String getNameOfPlace(){
        return mNameOfPlace;
    }

    // Get the working hours of the place.
    public String getWorkingHours(){
        return mWorkingHours;
    }

    // Returns whether or not there are working hours for this place.
    public boolean hasWorkingHours() {
        return mWorkingHours != NO_WORKING_HOURS_PROVIDED;
    }

    // Get the address of the place.
    public String getAddress(){
        return mAddress;
    }

    // Get the rating of the place.
    public String getRating(){
        return mRating;
    }

    // Returns whether or not there are working hours for this place.
    public boolean hasRating() {
        return mRating != NO_RATING_PROVIDED;
    }

    // Get the image resource ID of the place.
    public int getImageResourceId(){
        return mImageResourceId;
    }


}
