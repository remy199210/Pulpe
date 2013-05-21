package juniorEntreprise;

/***********************************************************************
 * Module:  Entreprise.java
 * Author:  p0903816
 * Purpose: Defines the Class Entreprise
 ***********************************************************************/

import java.util.*;

/** @pdOid 1709a013-ae54-486a-8dfb-245334d374ef */
public class Entreprise {
   /** @pdOid 28dce31f-1722-401e-b384-f3f03e863e6d */
   private int noSiret;
   /** @pdOid c87e0a19-5e5a-43d0-8f61-e98f375467ea */
   private String rs;
   /** @pdOid 70d4c764-792f-4958-9886-67417c929675 */
   private String adresse;
   /** @pdOid fdf5e92f-ed6e-42ac-b503-c6b7b76a2b9a */
   private int telephoneEntreprise;
   
   /** @pdRoleInfo migr=no name=Etude assc=commande coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public Etude etude;

}