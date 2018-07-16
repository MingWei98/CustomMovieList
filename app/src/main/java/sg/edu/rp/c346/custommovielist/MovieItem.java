package sg.edu.rp.c346.custommovielist;

import java.util.Calendar;

/**
 * Created by 16038911 on 16/7/2018.
 */

// Class - MovieItem
public class MovieItem {
    private String name;
    private String date;

    // Generate Constructor
    public MovieItem(String name, String date) {
        this.name = name;
        this.date = date;
    }

    // Generate Get and Set Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // Generate toString() Method
    @Override
    public String toString() {
        return "MovieItem{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
