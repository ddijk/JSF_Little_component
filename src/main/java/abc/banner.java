/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abc;

import javax.faces.component.UINamingContainer;

/**
 *
 * @author Dick
 */
public class banner extends UINamingContainer {
	
	public String doit() {
		System.out.println("doit called");
		return "/default";
	}
}
