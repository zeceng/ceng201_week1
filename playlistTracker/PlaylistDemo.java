/*
 * PlaylistDemo.java
 * Driver program to test all constructors and methods of the Track class.
 *
 * Name: Zeynep Ece ÖZASLAN
 * Student ID: 250444039
 * Date: 07.10.2026
 */

public class PlaylistDemo {

    public static void main(String[] args) {

        System.out.println("=== Playlist Track Demo ===\n");

        // --- Default constructor ---
        Track defaultTrack = new Track();
        System.out.println("Default Track:");
        System.out.println(defaultTrack.toString());
        System.out.println();

        // --- Title-only constructor ---
        Track titleOnlyTrack = new Track("Neon Lights");
        System.out.println("Title-only track:");
        System.out.println(titleOnlyTrack.toString());
        System.out.println();

        // --- Title + artist constructor ---
        Track titleArtistTrack = new Track("Ocean Drive", "Midnight Pulse");
        System.out.println("Title + Artist Track:");
        System.out.println(titleArtistTrack.toString());
        System.out.println();

        // --- Full constructor ---
        Track fullTrack = new Track("Raindrop Waltz", "Clara Voss", 210, false);
        System.out.println("Full Track (non-explicit):");
        System.out.println(fullTrack.toString());
        System.out.println();

        // Testing Invalid Duration Validation
        System.out.println("Invalid Duration Test:");
        Track invalidTrack = new Track("Broken Clock", "Static Noise", -50, false);
        System.out.println(invalidTrack.toString());
        System.out.println();

        // Testing Getter Methods
        Track getterTrack = new Track("Stardust", "Stellar Echo", 242, true);
        System.out.println("Getter Test:");
        System.out.printf("%-11s%s%n", "Title:", getterTrack.getTitle());
        System.out.printf("%-11s%s%n", "Artist:", getterTrack.getArtist());
        System.out.printf("%-11s%s%n", "Duration:", getterTrack.getDurationFormatted());
        System.out.printf("%-11s%b%n", "Explicit:", getterTrack.isExplicit());
    }
}