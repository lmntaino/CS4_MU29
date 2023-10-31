/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enzot224
 */
public class Singer {

    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favouriteSong;
    private static int totalPerformances = 0;

    public Singer(String name) {
        this.name = name;
        this.noOfPerformances = 0;
        this.earnings = 0;
    }
    public String getName() {
        return name;
    }
    public int getNoOfPerformances() {
        return noOfPerformances;
    }
    public void setNoOfPerformances(int noOfPerformances) {
        this.noOfPerformances = noOfPerformances;
    }
    public double getEarnings() {
        return earnings;
    }
    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }
    public Song getFavSong() {
        return favouriteSong;
    }
    public void setFavouriteSong(Song favouriteSong) {
        this.favouriteSong = favouriteSong;
    }
    public void changeFavSong(Song newFavouriteSong) {
        setFavouriteSong(newFavouriteSong);
    }
    public static int getTotalPerformances() {
        return totalPerformances;
    }
    public void setTotalPerformances(int totalPerformances) {
        this.totalPerformances = totalPerformances;
    }
    public void performForAudience(int nPeople) {
        setNoOfPerformances(getNoOfPerformances() + 1);
        setEarnings(getEarnings() + (nPeople * 500));
        setTotalPerformances(getTotalPerformances() + 1);
    }
    public void performForAudience(Singer collab, int nPeople) {
        collab.setNoOfPerformances(collab.getNoOfPerformances() + 1);
        collab.setEarnings(collab.getEarnings() + (nPeople * 100));
        setTotalPerformances(getTotalPerformances() + 2);
    }
}
