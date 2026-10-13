/*
 * Track.java
 * Represents a single music track in a streaming playlist.
 *
 * Name: Zeynep Ece ÖZASLAN
 * Student ID: 250444039
 * Date: 07.10.2026
 */

public class Track {

    // -------------------------------------------------------
    // Instance variables
    // -------------------------------------------------------
    private String title;
    private String artist;
    private int durationSeconds;
    private boolean isExplicit;


    // Full constructor (all four parameters).
    public Track(String title, String artist, int durationSeconds, boolean isExplicit) {
        this.title = title;
        this.artist = artist;
        this.isExplicit = isExplicit;

        if (durationSeconds < 0) {
            System.out.println("Warning: Invalid duration. Setting to 0.");
            this.durationSeconds = 0;
        } else {
            this.durationSeconds = durationSeconds;
        }
    }

    // Title + artist constructor.
    public Track(String title, String artist) {
        this(title, artist, 0, false);
    }

    // Title-only constructor chaining.
    public Track(String title) {
        this(title, "Unknown Artist", 0, false);
    }

    // Default constructor chaining.
    public Track() {
        this("Unknown Title", "Unknown Artist", 0, false);
    }

    // Getter Methods
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public boolean isExplicit() {
        return isExplicit;
    }

    // Formats
    public String getDurationFormatted() {
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;
        return String.format("%d:%02d", minutes, seconds);
    }

    // Returns string representation of the track.
    @Override
    public String toString() {
        String result = "\"" + title + "\" by " + artist + " [" + getDurationFormatted() + "]";
        if (isExplicit) {
            result += " [EXPLICIT]";
        }
        return result;
    }
}