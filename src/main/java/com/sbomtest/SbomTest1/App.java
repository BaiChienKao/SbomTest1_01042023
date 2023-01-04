package com.sbomtest.SbomTest1;

import com.sun.swing.internal.plaf.basic.resources.basic;
import com.thoughtworks.xstream.converters.basic.*;
import com.zaxxer.nuprocess.codec.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.security.Principal;
import java.util.HashMap;

import org.apache.batik.*;
import org.keycloak.common.util.*;
import org.apache.commons.jxpath.JXPathContext;
import org.eclipse.californium.scandium.auth.PrincipalSerializer;
import ch.qos.logback.core.encoder.ByteArrayUtil;
import org.eclipse.californium.elements.util.DatagramWriter;
import com.softwaremill.session.converters.MapConverters;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONWriter;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String newStr = new String("Sbom");
    	JXPathContext context = JXPathContext.newContext(newStr);
    	context.equals(newStr);
    	ByteArrayUtil arrayUtil = new ByteArrayUtil();
    	String arrayU = arrayUtil.toString();
    	
    	Principal principal = null;
    	DatagramWriter writer = new DatagramWriter();
    	PrincipalSerializer.serialize(principal, writer);
    	
    	java.util.Map<String, String> m = new HashMap<>();
        m.put("key", "value");
        MapConverters.toImmutableMap(m);
         
         
        Writer my_writer = null;
		try {
			my_writer = new FileWriter("output.txt");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
         try {
			JSONWriter writer1 = new JSONWriter(my_writer).object().key("JSON").value("Hello, World!").endObject();
		} catch (JSONException e) {
			e.printStackTrace();
		}
    	
    	
        System.out.println( "Hello World!" );
        
    }
}
