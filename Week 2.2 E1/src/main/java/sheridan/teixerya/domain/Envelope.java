package sheridan.teixerya.domain;

import java.io.Serializable;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class Envelope implements Serializable {

    @Min(0)
    @Max(2)
    private int message = 2;

    @NotBlank
    private String firstName = "";

    public Envelope() {
    }

    public Envelope(int message,String firstName) {
        this.message = message;
        this.firstName = firstName;

    }

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    @Override
    public String toString() {
        return "Envelope{" +
                "message=" + message +
                "firstName='" + firstName + '\'' +

                '}';
    }
}