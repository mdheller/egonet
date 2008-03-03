/*
 * Generated by XDoclet - Do not edit!
 */
package com.endlessloopsoftware.egonet.interfaces;

/**
 * Local interface for StudySB.
 * @copyright 2004 Endless Loop Software Inc.
 * @xdoclet-generated at ${TODAY}
 * @copyright 2004 Endless Loop Software
 *  Inc.
 */
public interface StudySBLocal
   extends com.endlessloopsoftware.egonet.interfaces.EgoSBLocal
{
   /**
    * Returns Data value for a given study
    */
   public com.endlessloopsoftware.egonet.util.StudyDataValue fetchDataByStudyName( java.lang.String name ) throws javax.ejb.FinderException, javax.naming.NamingException;

   /**
    * Returns Data value for a given study
    */
   public com.endlessloopsoftware.egonet.interfaces.StudyEJBLocal fetchByStudyName( java.lang.String name ) throws javax.ejb.FinderException, javax.naming.NamingException;

   public void createStudy( com.endlessloopsoftware.egonet.util.StudyDataValue data ) throws javax.ejb.CreateException, javax.naming.NamingException;

   public void removeEntity( com.endlessloopsoftware.egonet.util.StudyDataValue data ) throws javax.ejb.RemoveException, javax.ejb.FinderException, javax.naming.NamingException;

   public com.endlessloopsoftware.egonet.util.StudyDataValue getStudyDataValue( java.lang.Long id ) ;

   public java.util.Vector getDisplayableAlterQuestions( java.lang.Long id ) ;

   public com.endlessloopsoftware.egonet.interfaces.StudyEJBLocal getStudy( java.lang.Long id ) ;

}
