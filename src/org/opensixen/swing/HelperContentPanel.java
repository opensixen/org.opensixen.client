/**
 * 
 */
package org.opensixen.swing;

import java.awt.Component;
import java.awt.LayoutManager;
import java.util.ArrayList;

import org.compiere.plaf.CompiereColor;
import org.compiere.swing.CPanel;

/**
 * 
 * 
 * @author Eloy Gomez
 * Indeos Consultoria http://www.indeos.es
 *
 */
public class HelperContentPanel extends CPanel {

	public static final int POSITION_TOP = 1;
	
	public static final int POSITION_CENTER = 2;
	
	private boolean priority = false;
	
	private String tabName;
	
	private int position= POSITION_TOP;
	
	
	public HelperContentPanel() {
		super();
	}

	public HelperContentPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
	}

	public HelperContentPanel(CompiereColor bc) {
		super(bc);
	}

	public HelperContentPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
	}

	public HelperContentPanel(LayoutManager layout) {
		super(layout);
	}

	/**
	 * @return the priority
	 */
	public boolean isPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(boolean priority) {
		this.priority = priority;
	}

	/**
	 * @return the tabName
	 */
	public String getTabName() {
		return tabName;
	}

	/**
	 * @param tabName the tabName to set
	 */
	public void setTabName(String tabName) {
		this.tabName = tabName;
	}

	/**
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(int position) {
		this.position = position;
	}
	
	

	
}
