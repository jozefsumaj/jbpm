package cz.epokladny;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class reclamationlog implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String description;
   private java.lang.String location;
   private java.lang.Boolean damaged;

   private java.util.Date datecreated;

   public reclamationlog()
   {
   }

   public java.lang.String getDescription()
   {
      return this.description;
   }

   public void setDescription(java.lang.String description)
   {
      this.description = description;
   }

   public java.lang.String getLocation()
   {
      return this.location;
   }

   public void setLocation(java.lang.String location)
   {
      this.location = location;
   }

   public java.lang.Boolean getDamaged()
   {
      return this.damaged;
   }

   public void setDamaged(java.lang.Boolean damaged)
   {
      this.damaged = damaged;
   }

   public java.util.Date getDatecreated()
   {
      return this.datecreated;
   }

   public void setDatecreated(java.util.Date datecreated)
   {
      this.datecreated = datecreated;
   }

   public reclamationlog(java.lang.String description, java.lang.String location,
         java.lang.Boolean damaged, java.util.Date datecreated)
   {
      this.description = description;
      this.location = location;
      this.damaged = damaged;
      this.datecreated = datecreated;
   }

}