package cz.epokladny;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class customer implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String customerName;

   private java.lang.String productName;

   private Long productId;

   private java.lang.String customerEmail;

   public customer()
   {
   }

   public java.lang.String getCustomerName()
   {
      return this.customerName;
   }

   public void setCustomerName(java.lang.String customerName)
   {
      this.customerName = customerName;
   }

   public java.lang.String getProductName()
   {
      return this.productName;
   }

   public void setProductName(java.lang.String productName)
   {
      this.productName = productName;
   }

   public java.lang.String getCustomerEmail()
   {
      return this.customerEmail;
   }

   public void setCustomerEmail(java.lang.String customerEmail)
   {
      this.customerEmail = customerEmail;
   }

   public java.lang.Long getProductId()
   {
      return this.productId;
   }

   public void setProductId(java.lang.Long productId)
   {
      this.productId = productId;
   }

   public customer(java.lang.String customerName, java.lang.String productName,
         java.lang.Long productId, java.lang.String customerEmail)
   {
      this.customerName = customerName;
      this.productName = productName;
      this.productId = productId;
      this.customerEmail = customerEmail;
   }

}