/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mgc.gitshell.host;

import bsh.Interpreter;
import com.mgc.gitshell.intf.IOutputConsumer;
import com.mgc.gitshell.intf.ISession;

/**
 *
 * @author mgomez
 */
public class BeanshellSession implements ISession {

    private Interpreter interpreter = new Interpreter();

    public void execute(String textLine, IOutputConsumer consumer) throws Exception {
        String response = interpreter.eval(textLine).toString();
        consumer.append(response);
    }

    public String[] getSuggestions(String textLine, int caretPosition) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
