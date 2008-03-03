/*
 * Generated by XDoclet - Do not edit!
 */
package com.endlessloopsoftware.egonet.data;

/**
 * CMP layer for QuestionEJB.
 * @xdoclet-generated at ${TODAY}
 * @copyright 2004 Endless Loop Software
 *  Inc.
 */
public abstract class QuestionEJBCMP
   extends com.endlessloopsoftware.egonet.ejb.QuestionEJB
   implements javax.ejb.EntityBean
{

   public void ejbLoad() throws javax.ejb.EJBException
   {
      super.ejbLoad();
   }

   public void ejbStore() throws javax.ejb.EJBException
   {
         super.ejbStore();
   }

   public void ejbActivate() throws javax.ejb.EJBException
   {
      super.ejbActivate();
   }

   public void ejbPassivate() throws javax.ejb.EJBException
   {
      super.ejbPassivate();

   }

   public void setEntityContext(javax.ejb.EntityContext ctx) throws javax.ejb.EJBException
   {
      super.setEntityContext(ctx);
   }

   public void unsetEntityContext() throws javax.ejb.EJBException
   {
      super.unsetEntityContext();
   }

   public void ejbRemove() throws javax.ejb.EJBException, javax.ejb.RemoveException
   {
      super.ejbRemove();

   }

 /* Value Objects BEGIN */

   public void addAnswer(com.endlessloopsoftware.egonet.util.AnswerDataValue added)
   throws javax.ejb.FinderException
   {
	  try
	  {
		  com.endlessloopsoftware.egonet.interfaces.AnswerEJBPK pk = new com.endlessloopsoftware.egonet.interfaces.AnswerEJBPK(added.getId());

		 com.endlessloopsoftware.egonet.interfaces.AnswerEJBLocalHome home = com.endlessloopsoftware.egonet.interfaces.AnswerEJBUtil.getLocalHome();

		 com.endlessloopsoftware.egonet.interfaces.AnswerEJBLocal relation = home.findByPrimaryKey(pk);
		getAnswers().add(relation);
	  }
	  catch (Exception e){
		 if (e instanceof javax.ejb.FinderException)
			throw (javax.ejb.FinderException)e;
		 else
			throw new javax.ejb.EJBException(e);
	  }
   }

   public void removeAnswer(com.endlessloopsoftware.egonet.util.AnswerDataValue removed)
   throws javax.ejb.RemoveException
   {
	  try
	  {
		  com.endlessloopsoftware.egonet.interfaces.AnswerEJBPK pk = new com.endlessloopsoftware.egonet.interfaces.AnswerEJBPK(removed.getId());

		 com.endlessloopsoftware.egonet.interfaces.AnswerEJBLocalHome home = com.endlessloopsoftware.egonet.interfaces.AnswerEJBUtil.getLocalHome();

		com.endlessloopsoftware.egonet.interfaces.AnswerEJBLocal relation = home.findByPrimaryKey(pk);
		getAnswers().remove(relation);
	  }
	  catch (Exception e){
		 if (e instanceof javax.ejb.RemoveException)
			throw (javax.ejb.RemoveException)e;
		 else
			throw new javax.ejb.EJBException(e);
	  }
   }

   public void addSelection(com.endlessloopsoftware.egonet.util.SelectionDataValue added)
   throws javax.ejb.CreateException
   {
	  try
	  {
		  com.endlessloopsoftware.egonet.interfaces.SelectionEJBPK pk = new com.endlessloopsoftware.egonet.interfaces.SelectionEJBPK(added.getId());

		 com.endlessloopsoftware.egonet.interfaces.SelectionEJBLocalHome home = com.endlessloopsoftware.egonet.interfaces.SelectionEJBUtil.getLocalHome();

		 com.endlessloopsoftware.egonet.interfaces.SelectionEJBLocal relation = home.create(added);
		getSelections().add(relation);
	  }
	  catch (Exception e){
		 if (e instanceof javax.ejb.CreateException)
			throw (javax.ejb.CreateException)e;
		 else
			throw new javax.ejb.EJBException(e);
	  }
   }

   public void removeSelection(com.endlessloopsoftware.egonet.util.SelectionDataValue removed)
   throws javax.ejb.RemoveException
   {
	  try
	  {
		  com.endlessloopsoftware.egonet.interfaces.SelectionEJBPK pk = new com.endlessloopsoftware.egonet.interfaces.SelectionEJBPK(removed.getId());

		 com.endlessloopsoftware.egonet.interfaces.SelectionEJBLocalHome home = com.endlessloopsoftware.egonet.interfaces.SelectionEJBUtil.getLocalHome();

		com.endlessloopsoftware.egonet.interfaces.SelectionEJBLocal relation = home.findByPrimaryKey(pk);
		getSelections().remove(relation);
		relation.remove();
	  }
	  catch (Exception e){
		 if (e instanceof javax.ejb.RemoveException)
			throw (javax.ejb.RemoveException)e;
		 else
			throw new javax.ejb.EJBException(e);
	  }
   }

   public void updateSelection(com.endlessloopsoftware.egonet.util.SelectionDataValue updated)
   throws javax.ejb.FinderException
   {
	  try
	  {
		  com.endlessloopsoftware.egonet.interfaces.SelectionEJBPK pk = new com.endlessloopsoftware.egonet.interfaces.SelectionEJBPK(updated.getId());

		 com.endlessloopsoftware.egonet.interfaces.SelectionEJBLocalHome home = com.endlessloopsoftware.egonet.interfaces.SelectionEJBUtil.getLocalHome();

		com.endlessloopsoftware.egonet.interfaces.SelectionEJBLocal relation = home.findByPrimaryKey(pk);
		relation.setSelectionDataValue(updated);
	  }
	  catch (Exception e){
		 if (e instanceof javax.ejb.FinderException)
			throw (javax.ejb.FinderException)e;
		 else
			throw new javax.ejb.EJBException(e);
	  }
   }

/* Value Objects END */

   public abstract java.lang.Long getId() ;

   public abstract void setId( java.lang.Long id ) ;

   public abstract java.lang.Long getStudyId() ;

   public abstract void setStudyId( java.lang.Long studyId ) ;

   public abstract boolean getCentralMarker() ;

   public abstract void setCentralMarker( boolean centralMarker ) ;

   public abstract int getQuestionType() ;

   public abstract void setQuestionType( int questionType ) ;

   public abstract int getAnswerType() ;

   public abstract void setAnswerType( int answerType ) ;

   public abstract java.lang.String getTitle() ;

   public abstract void setTitle( java.lang.String title ) ;

   public abstract java.lang.String getText() ;

   public abstract void setText( java.lang.String text ) ;

   public abstract java.lang.String getCitation() ;

   public abstract void setCitation( java.lang.String citation ) ;

}
