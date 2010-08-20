/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mgc.gitshell.host;

import com.mgc.gitshell.intf.IOutputConsumer;
import com.mgc.gitshell.intf.ISession;
import java.util.ArrayList;

/**
 *
 * @author mgomez
 */
public class EchoSession implements ISession {

    public void execute(String textLine, IOutputConsumer consumer) throws Exception {
        consumer.append("Recibido: " + textLine);
    }

    public String[] getSuggestions(String textLine, int caretPosition) throws Exception {
        return null;
    }

}
