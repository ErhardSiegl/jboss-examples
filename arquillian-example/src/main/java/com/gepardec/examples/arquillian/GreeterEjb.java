package com.gepardec.examples.arquillian;

import java.io.PrintStream;

import javax.ejb.Stateless;

@Stateless
public class GreeterEjb implements Greeter {
    /* (non-Javadoc)
	 * @see com.gepardec.examples.arquillian.Greeter#greet(java.io.PrintStream, java.lang.String)
	 */
    @Override
	public void greet(PrintStream to, String name) {
        to.println(createGreeting(name));
    }

    /* (non-Javadoc)
	 * @see com.gepardec.examples.arquillian.Greeter#createGreeting(java.lang.String)
	 */
    @Override
	public String createGreeting(String name) {
        return "The EJB greets " + name + "!";
    }
}