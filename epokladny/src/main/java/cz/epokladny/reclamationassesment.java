package cz.epokladny;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class reclamationassesment implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Boolean replicated;
   private java.lang.String occurence;
   private Integer estimation;

   public reclamationassesment()
   {
   }

   public java.lang.Boolean getReplicated()
   {
      return this.replicated;
   }

   public void setReplicated(java.lang.Boolean replicated)
   {
      this.replicated = replicated;
   }

   public java.lang.String getOccurence()
   {
      return this.occurence;
   }

   public void setOccurence(java.lang.String occurence)
   {
      this.occurence = occurence;
   }

   public java.lang.Integer getEstimation()
   {
      return this.estimation;
   }

   public void setEstimation(java.lang.Integer estimation)
   {
      this.estimation = estimation;
   }

   public reclamationassesment(java.lang.Boolean replicated,
         java.lang.String occurence, java.lang.Integer estimation)
   {
      this.replicated = replicated;
      this.occurence = occurence;
      this.estimation = estimation;
   }

}