package org.opensixen.osgi.interfaces;

import java.awt.Component;

public interface IMenuInfoComponent extends IService {

	public Component getComponent();
	
	public void updateInfo();
	
}
