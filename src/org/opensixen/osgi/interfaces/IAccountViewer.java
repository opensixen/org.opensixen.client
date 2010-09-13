/**
 * 
 */
package org.opensixen.osgi.interfaces;

/**
 * 
 * 
 * @author Eloy Gomez
 * Indeos Consultoria http://www.indeos.es
 *
 */
public interface IAccountViewer extends IService {

	public void view(int AD_Client_ID, int AD_Table_ID, int record_ID);
	
}
