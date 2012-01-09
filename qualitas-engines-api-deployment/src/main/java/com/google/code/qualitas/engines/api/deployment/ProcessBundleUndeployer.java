package com.google.code.qualitas.engines.api.deployment;

import com.google.code.qualitas.engines.api.core.ProcessBundle;

/**
 * The Interface ProcessBundleUndeployer.
 * 
 * @param <T>
 *            the generic type
 */
public interface ProcessBundleUndeployer<T extends ProcessBundle> {

	/**
	 * Checks if passed process bundle is supported.
	 *
	 * @param processBundle the process bundle
	 * @return true, if is supported
	 */
	boolean isSupported(ProcessBundle processBundle);
	
	/**
	 * Sets remote default deployment service endpoint.
	 * 
	 * @param defaultDeploymentServiceEndpoint
	 *            the new default deployment service endpoint
	 */
	void setDefaultDeploymentServiceEndpoint(
			String defaultDeploymentServiceEndpoint);

	/**
	 * Sets remote deployment service endpoint.
	 * 
	 * @param deploymentServiceEndpoint
	 *            the new deployment service endpoint
	 */
	void setDeploymentServiceEndpoint(String deploymentServiceEndpoint);

	/**
	 * Undeploys process bundle from a remote host.
	 * 
	 * @param processBundle
	 *            the process bundle
	 * @return deployment result object
	 */
	ProcessBundleDeploymentResult undeploy(T processBundle);

}