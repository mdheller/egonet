/*
 * Generated by XDoclet - Do not edit!
 */
package com.endlessloopsoftware.egonet.interfaces;

/**
 * Home interface for QuestionLinkEJB.
 * @xdoclet-generated at ${TODAY}
 * @copyright 2004 Endless Loop Software
 *  Inc.
 */
public interface QuestionLinkEJBRemoteHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/QuestionLinkEJB";
   public static final String JNDI_NAME="QuestionLinkEJBHome";

   public com.endlessloopsoftware.egonet.interfaces.QuestionLinkEJBRemote create(com.endlessloopsoftware.egonet.data.QuestionLinkDataValue data , com.endlessloopsoftware.egonet.interfaces.QuestionEJBLocal question)
      throws javax.ejb.CreateException,java.rmi.RemoteException;

   public com.endlessloopsoftware.egonet.interfaces.QuestionLinkEJBRemote findByPrimaryKey(com.endlessloopsoftware.egonet.interfaces.QuestionLinkEJBPK pk)
      throws javax.ejb.FinderException,java.rmi.RemoteException;

}
