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
public class EchoHost implements IHost {

    public void writeInfo(IOutputConsumer output) throws Exception {
        output.append("EchoHost 1.0");
        output.append("-------------");
        output.append("");
    }

    public ISession openSession() throws Exception {
        return new EchoSession();
    }

    public ISession openSession(String sessionDefId) throws Exception {
        return this.openSession();
    }

}
