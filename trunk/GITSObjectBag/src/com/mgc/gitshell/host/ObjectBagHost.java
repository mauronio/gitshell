/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mgc.gitshell.host;

import com.mgc.gitshell.intf.IHost;
import com.mgc.gitshell.intf.IOutputConsumer;
import com.mgc.gitshell.intf.ISession;

/**
 *
 * @author mgomez
 */
public class ObjectBagHost implements IHost {

    private static String DefaultSessionID = "DEFAULT";

    public ISession openSession() throws Exception {
        return this.openSession(DefaultSessionID);
    }

    public ISession openSession(String sessionDefId) throws Exception {
        return new ObjectBagSession();
    }

    public void writeInfo(IOutputConsumer output) throws Exception {
        output.append("ObjectBag 1.0");
        output.append("-------------");
        output.append("");
    }

}
