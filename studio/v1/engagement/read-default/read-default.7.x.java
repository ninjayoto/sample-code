// Install the Java helper library from twilio.com/docs/java/install

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.studio.v1.flow.Engagement;

public class Example {
    // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    public static final String AUTH_TOKEN = "your_auth_token";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        ResourceSet<Engagement> engagements = 
            Engagement.reader("FWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
            .read();

        for(Engagement record : engagements) {
            System.out.println(record.getSid());
        }
    }
}