package pr1;

public class Ball {
    private String state;
    private String color;
    private String appointment;

    public Ball (String state, String color, String appointment) {
        this.state = state;
        this.color = color;
        this.appointment = appointment;
    }

    public String getName() {return state;}
    public String getColor() {return color;}
    public String getAppointment() {return appointment;}


    public void BallDescription ()
    {
        System.out.println(state + " " + color + " ball for " + appointment);
    }

}