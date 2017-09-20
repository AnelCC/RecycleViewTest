package apps.cherry.recycleviewtest.data.entities;

/**
 * Created by anel.calvo on 21/02/17.
 */

public class Friend {

    private String title;
    private String name;
    private String lastName;
    private String url;

    public Friend(String title, String name, String lastName, String url) {
        this.title = title;
        this.lastName = lastName;
        this.name = name;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}


