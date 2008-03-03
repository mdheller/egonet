/*
 * Generated by XDoclet - Do not edit!
 */
package com.endlessloopsoftware.egonet.interfaces;

/**
 * Primary key for QuestionEJB.
 * @xdoclet-generated at ${TODAY}
 * @copyright 2004 Endless Loop Software
 *  Inc.
 */
public class QuestionEJBPK
   extends java.lang.Object
   implements java.io.Serializable
{

   public java.lang.Long id;
   public java.lang.Long studyId;

   public QuestionEJBPK()
   {
   }

   public QuestionEJBPK( java.lang.Long id,java.lang.Long studyId )
   {
      this.id = id;
      this.studyId = studyId;
   }

   public java.lang.Long getId()
   {
      return id;
   }
   public java.lang.Long getStudyId()
   {
      return studyId;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }
   public void setStudyId(java.lang.Long studyId)
   {
      this.studyId = studyId;
   }

   public int hashCode()
   {
      int _hashCode = 0;
         if (this.id != null) _hashCode += this.id.hashCode();
         if (this.studyId != null) _hashCode += this.studyId.hashCode();

      return _hashCode;
   }

   public boolean equals(Object obj)
   {
      if( !(obj instanceof com.endlessloopsoftware.egonet.interfaces.QuestionEJBPK) )
         return false;

      com.endlessloopsoftware.egonet.interfaces.QuestionEJBPK pk = (com.endlessloopsoftware.egonet.interfaces.QuestionEJBPK)obj;
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
         if( this.studyId != null )
         {
            eq = eq && this.studyId.equals( pk.getStudyId() );
         }
         else  // this.studyId == null
         {
            eq = eq && ( pk.getStudyId() == null );
         }
      }

      return eq;
   }

   /** @return String representation of this pk in the form of [.field1.field2.field3]. */
   public String toString()
   {
      StringBuffer toStringValue = new StringBuffer("[.");
         toStringValue.append(this.id).append('.');
         toStringValue.append(this.studyId).append('.');
      toStringValue.append(']');
      return toStringValue.toString();
   }

}
