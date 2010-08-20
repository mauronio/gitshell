/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mgc.gitshell.base;

import com.mgc.gitshell.intf.IHost;
import com.mgc.gitshell.intf.IHostFactory;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author mgomez
 */
public class SimpleHostFactory implements IHostFactory  {

    private Properties hostProperties = null;

    private static final String PROPERTIES_FILE = "/gits.properties";
    private static final String HOSTCLASS_PROPERTY = "host.classname";

    protected void setHostProperties(Properties hostProperties) {
        this.hostProperties = hostProperties;
    }

    public IHost startHost() throws Exception {
        Class hostClass = Class.forName(hostProperties.getProperty(HOSTCLASS_PROPERTY));
        IHost hostInstance = (IHost)hostClass.newInstance();
        return hostInstance;
    }

    public IHost startHost(String hostDefID) throws Exception {return null;};

    public static SimpleHostFactory getInstance() throws Exception {
         Properties props = new Properties();
         SimpleHostFactory hostFactory = new SimpleHostFactory();
         InputStream is = hostFactory.getClass().getResourceAsStream(PROPERTIES_FILE);
         props.load(is);
         hostFactory.setHostProperties(props);
         return hostFactory;
    };
}
