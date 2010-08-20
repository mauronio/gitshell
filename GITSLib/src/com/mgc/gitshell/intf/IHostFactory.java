/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mgc.gitshell.intf;

/**
 *
 * @author Administrador
 */
public interface IHostFactory {

    public IHost startHost() throws Exception;
    public IHost startHost(String hostDefID) throws Exception;

}
