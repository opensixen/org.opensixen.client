/**
 * 
 */
package org.opensixen.swing;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.event.ChangeEvent;

import org.compiere.apps.APanel;
import org.compiere.apps.AWindow;
import org.compiere.grid.GridController;
import org.compiere.model.DataStatusEvent;
import org.compiere.model.MQuery;

/**
 * @author harlock
 *
 */
public class EPanel extends APanel{

	private ArrayList<IPanelListener> listeners = new ArrayList<IPanelListener>();
	
	public EPanel(AWindow window) {
		super(window);
	}

	public EPanel(GridController gc, int windowNo) {
		super(gc, windowNo);
	}
		
	
	public GridController getGridController()	{
		return this.m_curGC;
	}


	/* (non-Javadoc)
	 * @see org.compiere.apps.APanel#stateChanged(javax.swing.event.ChangeEvent)
	 */
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		super.stateChanged(e);
	}

	
	public void addListener(IPanelListener listener)		{
		listeners.add(listener);
	}

	/* (non-Javadoc)
	 * @see org.compiere.apps.APanel#dataStatusChanged(org.compiere.model.DataStatusEvent)
	 */
	
	@Override
	public void dataStatusChanged(DataStatusEvent e) {
		// TODO Auto-generated method stub
		super.dataStatusChanged(e);
	}

	/* (non-Javadoc)
	 * @see org.compiere.apps.APanel#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		super.actionPerformed(e);
		fireActionPerformed(e);
	}
	
	private void fireActionPerformed(ActionEvent e)	{
		for (IPanelListener listener:listeners)	{
			listener.actionPerformed(e);
		}
	}
	
			
}
