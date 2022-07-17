package Module5.Part5;
import java.io.Serializable;
public class Payload implements Serializable {
    //read https://www.baeldung.com/java-serial-version-uid
    private static final long serialVersionUID = 1L;//change this if the class changes
    
    /**
     * Determines how to process the data on the receiver's side
     */

    private String formatToken;
    private PayloadType payloadType;
    public PayloadType getPayloadType() {
        return payloadType;
    }
    public void setPayloadType(PayloadType payloadType) {
        this.payloadType = payloadType;
    }

    /**
     * Who the payload is from
     */
    private String clientName;
    public String getClientName() {
        return clientName;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * Generic text based message
     */
    private String message;
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {

        boolean colorized = false;

        int startingIndex = 0;
        int endingIndex = message.length();

        if (message.startsWith("[") && message.endsWith("]")) {
            int endingColorIndex = message.indexOf(']');
            this.formatToken = message.substring(0, endingColorIndex + 1);
            colorized = true;
        }

        if (colorized && message.startsWith(this.formatToken) && message.endsWith(this.formatToken)) {
            startingIndex = this.formatToken.length();
            endingIndex = message.length() - this.formatToken.length();
        } else if (message.startsWith("***") && message.endsWith("***")) {
            // if the msg starts & ends w *** then bold

            startingIndex = 3;
            endingIndex = message.length()-3;
            this.formatToken = "***";
        } else if (message.startsWith("**") && message.endsWith("**")) {
            // if the msg starts & ends w *** then italics
            this.formatToken = "**";
            startingIndex = 2;
            endingIndex = message.length()-2;
        } else if (message.startsWith("*") && message.endsWith("*")) {
                // if the msg starts & ends w *** then italics

                startingIndex = 1;
                endingIndex = message.length()-1;
                this.formatToken = "*";
        } else {

            this.formatToken = "";
        }
        this.message = message.substring(startingIndex, endingIndex);
    }



    public String getStyledMessage() {
        return String.format("%s%s%s", this.formatToken, this.getMessage(), this.formatToken);
    }
    /**
    /**
     * Generic number for example sake
     */
    private int number;
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
	return String.format("Type[%s], Number[%s], Message[%s]", getPayloadType().toString(), getNumber(),
		getMessage());
    }
}