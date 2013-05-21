package juniorEntreprise;

/***********************************************************************
 * Module:  Acompte.java
 * Author:  p0903816
 * Purpose: Defines the Class Acompte
 ***********************************************************************/

import java.util.*;

/** @pdOid d590d5ff-8469-42f6-b752-428fb2ac1590 */
public class Acompte {
   /** @pdOid 5f789b04-e001-4153-84cc-d282eb82fe3d */
   private int idAcompte;
   /** @pdOid 256c9847-3e77-4d58-8a64-cf7f20368212 */
   private int montantAcompte;
   
   /** @pdRoleInfo migr=no name=Indemnisation assc=concerne coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Indemnisation> indemnisation;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Indemnisation> getIndemnisation() {
      if (indemnisation == null)
         indemnisation = new java.util.HashSet<Indemnisation>();
      return indemnisation;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorIndemnisation() {
      if (indemnisation == null)
         indemnisation = new java.util.HashSet<Indemnisation>();
      return indemnisation.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newIndemnisation */
   public void setIndemnisation(java.util.Collection<Indemnisation> newIndemnisation) {
      removeAllIndemnisation();
      for (java.util.Iterator iter = newIndemnisation.iterator(); iter.hasNext();)
         addIndemnisation((Indemnisation)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newIndemnisation */
   public void addIndemnisation(Indemnisation newIndemnisation) {
      if (newIndemnisation == null)
         return;
      if (this.indemnisation == null)
         this.indemnisation = new java.util.HashSet<Indemnisation>();
      if (!this.indemnisation.contains(newIndemnisation))
         this.indemnisation.add(newIndemnisation);
   }
   
   /** @pdGenerated default remove
     * @param oldIndemnisation */
   public void removeIndemnisation(Indemnisation oldIndemnisation) {
      if (oldIndemnisation == null)
         return;
      if (this.indemnisation != null)
         if (this.indemnisation.contains(oldIndemnisation))
            this.indemnisation.remove(oldIndemnisation);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllIndemnisation() {
      if (indemnisation != null)
         indemnisation.clear();
   }

}