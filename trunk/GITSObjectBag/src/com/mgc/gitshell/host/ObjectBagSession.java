/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mgc.gitshell.host;

import com.mgc.gitshell.intf.IOutputConsumer;
import com.mgc.gitshell.intf.ISession;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author mgomez
 */
public class ObjectBagSession implements ISession {

    private static String DefaultSessionID = "DEFAULT";

    private String sessionID = null;
    private Map bag = null;

    public ObjectBagSession() {
    }

    public ObjectBagSession(String sessionId) {

    }

    private void init(String sessionId) {
        this.sessionID = sessionId;
        bag = new Hashtable();

    }
    public void execute(String textLine, IOutputConsumer consumer) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String[] getSuggestions(String textLine, int caretPosition) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
