/* We're using json-lib for deserialising JSON data */
import net.sf.json.*;

public class SMSGlobalRESTClientMain
{
    public static void main(String[] args) throws Exception
    {
        String apiKey = "2237275ba354517bdbd2477b7266e3c1";
        String secret = "ccbb84e115a66eb2fc83834b8c0f31a3";
        String extraData = "";
        String protocol = "HTTP";
        String host = "api.local";
        int port = 80;
        boolean isDebug = true;

        SMSGlobalRESTClient restClient = new SMSGlobalRESTClient(apiKey, secret, extraData, protocol, host, port, true);

        /** Get Balance **/
        try {
            System.out.println("Balance -- ");
            String balanceJSON = restClient.getBalance();
            JSONObject balance = JSONObject.fromObject(balanceJSON);
            System.out.println("Credits: " + balance.get("credits"));
            System.out.println("Country Code: " + balance.get("countryCode"));
            System.out.println("Credits Per MMS: " + balance.get("creditsPerMms"));
            System.out.println("Credits Per SMS: " + balance.get("credits"));
            System.out.println("MMS Available: " + balance.get("mmsAvailable"));
            System.out.println("SMS Available: " + balance.get("smsAvailable"));
        } catch (SMSGlobalRestClientException e) {
            System.out.println("Error communicating with API server." + e.getMessage());
        } catch (JSONException e) {
            System.out.println("Error decoding server returned data." + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unknown Error while trying to get the balance.");
        }
/*
        System.out.println("Child Accounts: " + restClient.getChildAccounts());
        System.out.println("Contacts: " + restClient.getContacts());
        System.out.println("Dedicated Numbers: " + restClient.getDedicatedNumbers());
        System.out.println("Groups: " + restClient.getGroups());
        System.out.println("Look Up Number: " + restClient.getLookups());
*/
        return;
    }
}