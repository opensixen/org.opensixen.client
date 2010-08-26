/**
 * 
 */
package org.opensixen.swing;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.Properties;

import javax.swing.JTabbedPane;

import org.compiere.apps.APanel;
import org.compiere.apps.AWindow;
import org.compiere.model.MQuery;
import org.compiere.model.MWindow;
import org.compiere.swing.CPanel;
import org.compiere.util.Env;
import org.opensixen.osgi.Service;
import org.opensixen.osgi.ServiceQuery;
import org.opensixen.osgi.interfaces.IHelperContentProvider;

/**
 * @author harlock
 *
 */
public class AHelperPanel extends CPanel {

	private EPanel aPanel;
	
	protected int p_width = 300;
	protected int p_height;
	private List<IHelperContentProvider> providers;
	private Properties ctx;
	

	/**
	 * @param aWindow
	 * @param m_APanel
	 */
	public AHelperPanel(Properties ctx, EPanel m_APanel) {
		super();
		this.ctx = ctx;
		this.aPanel = m_APanel;
	}

		
	/* (non-Javadoc)
	 * @see org.opensixen.swing.IPanelListener#initPerformed()
	 */
	public boolean initPanel( int AD_Window_ID, MQuery query) {
		MWindow window = new MWindow(Env.getCtx(), AD_Window_ID, null);
		ServiceQuery sq = new ServiceQuery(IHelperContentProvider.P_WINDOWNAME, window.getName());
		providers = Service.list(IHelperContentProvider.class, sq);
		
		// Si no hay providers, salimos
		if (providers == null)	{
			getParent().setVisible(false);
			return true;
		}
		
		setLayout( new BorderLayout() );
		JTabbedPane tabbedPane = new JTabbedPane();

		p_height = aPanel.getHeight();
		setSize(p_width, p_height);
		setMinimumSize(new Dimension(p_width, 300));
		
		for (IHelperContentProvider provider:providers)	{
			// Añadimos al panel principal el nuevo provider como listener
			aPanel.addListener(provider);
			
			CPanel tab = new CPanel();
		    tab.setLayout( new BorderLayout() );
			provider.initContent(ctx, tab, aPanel);
			tabbedPane.addTab("Informacion", tab);

		}
		this.add( tabbedPane , BorderLayout.CENTER );
		return true;
	}


}
