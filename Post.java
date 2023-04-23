// The class Post represents a light post with an ordinary bulb that needs to be replaced with an LED bulb.
public class Post{
    private int number;
    private String location;
    private boolean replaceBulb;
    // others attibutes such as, latitude and longitude.

   // The constructor receives two parameters, an integer "number" and a string "location",
   //and initializes the corresponding attributes with the received values. The "replaceBulb" attribute is initialized to "false",
   //indicating that the bulb does not need to be replaced at the time of the creation the of the object.
   public Post(int number, String location) {
        this.number = number;
        this.location = location;
        this.replaceBulb = false;
    }

    public int getNumber() {
        return number;
    }

    public String getLoction() {
        return location;
    }

    public boolean isReplaceBulb() {
        return replaceBulb;
    }

    public void setReplaceBulb(boolean replaceBulb) {
        this.replaceBulb = replaceBulb;
    }
}