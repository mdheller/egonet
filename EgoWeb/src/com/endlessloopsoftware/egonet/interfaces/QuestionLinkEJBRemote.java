/*
 * Generated by XDoclet - Do not edit!
 */
package com.endlessloopsoftware.egonet.interfaces;

/**
 * Remote interface for QuestionLinkEJB.
 * @xdoclet-generated at ${TODAY}
 * @copyright 2004 Endless Loop Software
 *  Inc.
 */
public interface QuestionLinkEJBRemote
   extends javax.ejb.EJBObject
{

   public void setQuestionLinkDataValue( com.endlessloopsoftware.egonet.data.QuestionLinkDataValue data )
      throws java.rmi.RemoteException;

   public com.endlessloopsoftware.egonet.data.QuestionLinkDataValue getQuestionLinkDataValue(  )
      throws java.rmi.RemoteException;

   public com.endlessloopsoftware.egonet.interfaces.QuestionEJBLocal getQuestion(  )
      throws java.rmi.RemoteException;

   public void setQuestion( com.endlessloopsoftware.egonet.interfaces.QuestionEJBLocal question )
      throws java.rmi.RemoteException;

}
