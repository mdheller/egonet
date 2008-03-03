/*
 * Generated by XDoclet - Do not edit!
 */
package com.endlessloopsoftware.egonet.interfaces;

/**
 * Primary key for InterviewEJB.
 * @xdoclet-generated at ${TODAY}
 * @copyright 2004 Endless Loop Software
 *  Inc.
 */
public class InterviewEJBPK
   extends java.lang.Object
   implements java.io.Serializable
{

   public java.lang.Long id;

   public InterviewEJBPK()
   {
   }

   public InterviewEJBPK( java.lang.Long id )
   {
      this.id = id;
   }

   public java.lang.Long getId()
   {
      return id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public int hashCode()
   {
      int _hashCode = 0;
         if (this.id != null) _hashCode += this.id.hashCode();

      return _hashCode;
   }

   public boolean equals(Object obj)
   {
      if( !(obj instanceof com.endlessloopsoftware.egonet.interfaces.InterviewEJBPK) )
         return false;

      com.endlessloopsoftware.egonet.interfaces.InterviewEJBPK pk = (com.endlessloopsoftware.egonet.interfaces.InterviewEJBPK)obj;
      boolean eq = true;

      if( obj == null )
      {
         eq = false;
      }
      else
      {
         if( this.id != null )
         {
            eq = eq && this.id.equals( pk.getId() );
         }
         else  // this.id == null
         {
            eq = eq && ( pk.getId() == null );
         }
      }

      return eq;
   }

   /** @return String representation of this pk in the form of [.field1.field2.field3]. */
   public String toString()
   {
      StringBuffer toStringValue = new StringBuffer("[.");
         toStringValue.append(this.id).append('.');
      toStringValue.append(']');
      return toStringValue.toString();
   }

}
