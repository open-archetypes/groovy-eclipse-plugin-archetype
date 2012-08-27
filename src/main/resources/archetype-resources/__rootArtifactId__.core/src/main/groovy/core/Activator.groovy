#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core;

import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.osgi.framework.BundleContext

/**
 * The activator class controls the plug-in life cycle
 */
class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "${parentArtifactId}.core" //$NON-NLS-1$

    public boolean started;
	    
	// The shared instance
	private static Activator plugin
	
	void start(BundleContext context) throws Exception {
		super.start(context)
        started = true;
		plugin = this
	}

	void stop(BundleContext context) throws Exception {
		started = false
        plugin = null
		super.stop(context)
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	static Activator getDefault() {
		return plugin
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path)
	}
}
