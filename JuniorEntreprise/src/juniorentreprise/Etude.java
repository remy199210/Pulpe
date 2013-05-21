package juniorEntreprise;

/***********************************************************************
 * Module:  Etude.java
 * Author:  p0903816
 * Purpose: Defines the Class Etude
 ***********************************************************************/

import java.util.*;

/** @pdOid d98600a0-d641-4be7-bbd3-7630af1dd52a */
public class Etude {
   /** @pdOid a48956f8-7bfb-4b01-9fd8-cacba90334d4 */
   private int idEtude;
   /** @pdOid 4d9ad550-0ced-4a45-8ce1-e7632f2c35a4 */
   private String nomEtude;
   /** @pdOid b130a002-5332-4c99-83dd-ba3bf715de0e */
   private boolean etatEtude;
   /** @pdOid 6daaee31-3e3c-4415-9ff0-4122f30eaed0 */
   private String description;
   /** @pdOid bb1460b4-eaff-485e-882b-96a78cc54574 */
   private int dureeEtude;
   /** @pdOid 0850af34-0bb7-453c-816b-d9857277f669 */
   private int dateFin;
   /** @pdOid 56dcb9c4-9ec4-489e-9431-d919819f029c */
   private int prixJournee;
   
   /** @pdRoleInfo migr=no name=Facture assc=genere coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public Facture facture;

}
