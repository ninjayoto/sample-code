// Install the C# / .NET helper library from twilio.com/docs/csharp/install

using System;
using Twilio;
using Twilio.Rest.Messaging.V1.Service;


class Program 
{
    static void Main(string[] args)
    {
        // Find your Account Sid and Token at twilio.com/console
        const string accountSid = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
        const string authToken = "your_auth_token";

        TwilioClient.Init(accountSid, authToken);

        var shortCodes = ShortCodeResource.Read(
            pathServiceSid: "MG2172dd2db502e20dd981ef0d67850e1a"
        );

        foreach(var record in shortCodes)
        {
           Console.WriteLine(record.Sid);
        }
    }
}
