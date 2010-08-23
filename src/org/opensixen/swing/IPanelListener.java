/**
 * 
 */
package org.opensixen.swing;

import java.awt.event.ActionEvent;

import org.compiere.model.MQuery;

/**
 * @author harlock
 *
 */
public interface IPanelListener {
	
	public boolean disposePerformed();

	/**
	 * @param e
	 */
	public void actionPerformed(ActionEvent e);
	
	
}
