package juniorEntreprise;

/***********************************************************************
 * Module:  Etudiant.java
 * Author:  p0903816
 * Purpose: Defines the Class Etudiant
 ***********************************************************************/

import java.util.*;

/** @pdOid b90126f6-bd83-4291-890d-c954ee24dd83 */
public class Etudiant {
   /** @pdOid 7ba2c3fe-4e4b-4776-82e9-daad1de3d4ff */
   private int idEtudiant;
   /** @pdOid 7a3cfdb6-a172-4bd4-9e6b-540f9bc91ac2 */
   private String nomEtudiant;
   /** @pdOid 0f84162b-f792-4b75-be7c-71d9ee15377f */
   private String prenomEtudiant;
   /** @pdOid 95e96a0b-d077-4d16-9702-65007976d51f */
   private String telephoneEtudiant;
   
   public java.util.Collection participe;
   public Remboursement paye;
   /** @pdRoleInfo migr=no name=Acompte assc=demande coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public Acompte acompte;

}
