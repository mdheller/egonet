/*
 * Generated by XDoclet - Do not edit!
 */
package com.endlessloopsoftware.egonet.interfaces;

/**
 * Local home interface for ConfigurationEJB.
 * @xdoclet-generated at ${TODAY}
 * @copyright 2004 Endless Loop Software
 *  Inc.
 */
public interface ConfigurationEJBLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/ConfigurationEJBLocal";
   public static final String JNDI_NAME="ConfigurationEJBLocalHome";

   public com.endlessloopsoftware.egonet.interfaces.ConfigurationEJBLocal create()
      throws javax.ejb.CreateException;

   public com.endlessloopsoftware.egonet.interfaces.ConfigurationEJBLocal findByPrimaryKey(com.endlessloopsoftware.egonet.interfaces.ConfigurationEJBPK pk)
      throws javax.ejb.FinderException;

}
