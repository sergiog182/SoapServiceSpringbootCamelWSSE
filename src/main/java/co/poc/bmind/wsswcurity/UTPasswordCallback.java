package co.poc.bmind.wsswcurity;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.apache.wss4j.common.ext.WSPasswordCallback;

/**
 * Callback handler to handle passwords
 */
public class UTPasswordCallback implements CallbackHandler {

    private Map<String, String> passwords = new HashMap<String, String>();

    public UTPasswordCallback() {
        passwords.put("claus", "sualc");
        passwords.put("charles", "selrahc");
        passwords.put("james", "semaj");
        passwords.put("abcd", "dcba");
    }

    /**
     * Here, we attempt to get the password from the private alias/passwords map.
     */
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {

        String user = "";

        for (Callback callback : callbacks) {
            WSPasswordCallback pc = (WSPasswordCallback) callback;
            user = pc.getIdentifier();

            String pass = passwords.get(user);
            if (pass != null) {
                pc.setPassword(pass);
                return;
            }
        }

        // Password not found
        throw new IOException("Password does not exist for the user : " + user);
    }

    /**
     * Add an alias/password pair to the callback mechanism.
     */
    public void setAliasPassword(String alias, String password) {
        passwords.put(alias, password);
    }

	@Override
	public String toString() {
		return "UTPasswordCallback";
	}
    
    
}
