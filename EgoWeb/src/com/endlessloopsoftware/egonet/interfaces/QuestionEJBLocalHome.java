/*
 * Generated by XDoclet - Do not edit!
 */
package com.endlessloopsoftware.egonet.interfaces;

/**
 * Local home interface for QuestionEJB.
 * @xdoclet-generated at ${TODAY}
 * @copyright 2004 Endless Loop Software
 *  Inc.
 */
public interface QuestionEJBLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/QuestionEJBLocal";
   public static final String JNDI_NAME="QuestionEJBLocalHome";

   public com.endlessloopsoftware.egonet.interfaces.QuestionEJBLocal create(com.endlessloopsoftware.egonet.util.QuestionDataValue data)
      throws javax.ejb.CreateException;

   public com.endlessloopsoftware.egonet.interfaces.QuestionEJBLocal findByPrimaryKey(com.endlessloopsoftware.egonet.interfaces.QuestionEJBPK pk)
      throws javax.ejb.FinderException;

}
