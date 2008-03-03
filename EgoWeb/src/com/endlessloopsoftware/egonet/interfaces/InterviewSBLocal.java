/*
 * Generated by XDoclet - Do not edit!
 */
package com.endlessloopsoftware.egonet.interfaces;

/**
 * Local interface for InterviewSB.
 * @copyright 2004 Endless Loop Software Inc.
 * @xdoclet-generated at ${TODAY}
 * @copyright 2004 Endless Loop Software
 *  Inc.
 */
public interface InterviewSBLocal
   extends com.endlessloopsoftware.egonet.interfaces.EgoSBLocal
{

   public com.endlessloopsoftware.egonet.interfaces.InterviewEJBLocal findUserInterview( com.endlessloopsoftware.egonet.interfaces.StudyEJBLocal study,java.lang.String firstName,java.lang.String lastName,boolean create ) throws javax.ejb.CreateException, javax.naming.NamingException, javax.ejb.FinderException;

   /**
    * Finds interview matching study and name, returns data object
    * @param studyName
    * @param firstName
    * @param lastName
    * @return 
    */
   public com.endlessloopsoftware.egonet.util.InterviewDataValue fetchUserInterviewData( java.lang.String studyName,java.lang.String firstName,java.lang.String lastName ) throws javax.naming.NamingException, javax.ejb.FinderException;

   public com.endlessloopsoftware.egonet.util.InterviewDataValue findByPrimaryKey( com.endlessloopsoftware.egonet.interfaces.InterviewEJBPK pk ) throws javax.ejb.FinderException, javax.naming.NamingException;

   public com.endlessloopsoftware.egonet.util.InterviewDataValue createEntity( com.endlessloopsoftware.egonet.util.InterviewDataValue data ) throws javax.ejb.CreateException, javax.naming.NamingException;

   public void removeEntity( com.endlessloopsoftware.egonet.util.InterviewDataValue data ) throws javax.ejb.RemoveException, javax.ejb.FinderException, javax.naming.NamingException;

   /**
    * Used by applet to retrieve adjacency matrix
    */
   public java.lang.String[] getAlters( com.endlessloopsoftware.egonet.interfaces.InterviewEJBPK pk ) ;

   /**
    * Used by applet to retrieve adjacency matrix
    */
   public int[][] getAdjacencyMatrix( com.endlessloopsoftware.egonet.interfaces.InterviewEJBPK pk ) ;

   /**
    * Used by applet to retrieve adjacency matrix
    */
   public void setAdjacencyMatrix( com.endlessloopsoftware.egonet.interfaces.InterviewEJBPK pk,int[][] matrix ) ;

}
