
package org.certificatic.tarjetaDijital;

import javax.jws.WebService;

@WebService(endpointInterface = "org.certificatic.tarjetaDijital.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }

	@Override
	public String sayBye(String nombre) {
		
		return "adios" + nombre ;
	}
}

