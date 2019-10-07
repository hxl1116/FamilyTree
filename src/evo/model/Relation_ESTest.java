/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 07 19:20:13 GMT 2019
 */

package model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import model.Person;
import model.Relation;
import model.RelationParentChild;
import model.RelationSpouse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Relation_ESTest extends model.Relation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Person person0 = new Person("", "Father", true);
      RelationParentChild relationParentChild0 = new RelationParentChild(person0, person0);
      boolean boolean0 = relationParentChild0.isParent(person0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Person person0 = Person.restorePerson((-2058), "2u", "2u", true);
      RelationSpouse relationSpouse0 = new RelationSpouse(person0, person0);
      String string0 = relationSpouse0.getRelationType(person0);
      assertEquals("Wife", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RelationSpouse relationSpouse0 = new RelationSpouse((Person) null, (Person) null);
      Person person0 = relationSpouse0.getPerson2();
      assertNull(person0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Person person0 = Person.restorePerson(0, "male", "", true);
      RelationSpouse relationSpouse0 = new RelationSpouse(person0, person0);
      Person person1 = relationSpouse0.getPerson2();
      assertEquals(1, person1.getGenderAsInt());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Person person0 = Person.restorePerson((-2058), "2u", "2u", true);
      RelationSpouse relationSpouse0 = new RelationSpouse(person0, person0);
      Person person1 = relationSpouse0.getPerson2();
      assertEquals("2u", person1.getFirstName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Person person0 = Person.restorePerson(1, "!i", "!i", false);
      RelationSpouse relationSpouse0 = new RelationSpouse(person0, person0);
      Person person1 = relationSpouse0.getPerson2();
      assertEquals(0, person1.getGenderAsInt());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Person person0 = new Person((String) null, (String) null, true);
      RelationParentChild relationParentChild0 = new RelationParentChild(person0, (Person) null);
      Person person1 = relationParentChild0.getPerson1();
      assertNull(person1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Person person0 = Person.restorePerson((-1215), "female", "H", true);
      RelationParentChild relationParentChild0 = new RelationParentChild(person0, person0);
      Person person1 = relationParentChild0.getPerson1();
      assertSame(person1, person0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Person person0 = Person.restorePerson(1, (String) null, (String) null, false);
      RelationParentChild relationParentChild0 = new RelationParentChild(person0, person0);
      Person person1 = relationParentChild0.getPerson1();
      assertSame(person0, person1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Person person0 = Person.restorePerson(0, "", "F", true);
      RelationParentChild relationParentChild0 = new RelationParentChild(person0, person0);
      Person person1 = relationParentChild0.getPerson1();
      assertEquals(0, person1.getId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Person person0 = Person.restorePerson(344, "", "model.RelationSpouse", true);
      RelationParentChild relationParentChild0 = new RelationParentChild((Person) null, person0);
      Person person1 = relationParentChild0.getPartner(person0);
      assertNull(person1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Person person0 = Person.restorePerson(344, "", "model.RelationSpouse", true);
      RelationParentChild relationParentChild0 = new RelationParentChild(person0, person0);
      Person person1 = relationParentChild0.getPartner(person0);
      assertEquals("model.RelationSpouse", person1.getLastName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Person person0 = Person.restorePerson((-3316), "B9E}.TerGX$i", "gKKO,BE/SI<G", false);
      RelationSpouse relationSpouse0 = new RelationSpouse(person0, person0);
      Person person1 = relationSpouse0.getPartner(person0);
      assertEquals("male", person1.getGender());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Person person0 = Person.restorePerson(0, "", "F", true);
      RelationParentChild relationParentChild0 = new RelationParentChild(person0, person0);
      Person person1 = relationParentChild0.getPartner(person0);
      assertEquals(1, person1.getGenderAsInt());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Person person0 = Person.restorePerson((-1), "Mother", "Mother", false);
      RelationParentChild relationParentChild0 = new RelationParentChild(person0, person0);
      boolean boolean0 = relationParentChild0.equals(relationParentChild0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Person person0 = Person.restorePerson(0, "", "F", true);
      RelationParentChild relationParentChild0 = new RelationParentChild(person0, person0);
      Object object0 = new Object();
      boolean boolean0 = relationParentChild0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RelationSpouse relationSpouse0 = new RelationSpouse((Person) null, (Person) null);
      // Undeclared exception!
      try { 
        relationSpouse0.getRelationType((Person) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.RelationSpouse", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Person person0 = new Person((String) null, (String) null, true);
      RelationSpouse relationSpouse0 = new RelationSpouse(person0, person0);
      // Undeclared exception!
      try { 
        relationSpouse0.getPartner((Person) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.RelationSpouse", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Person person0 = Person.restorePerson((-79), "", "", false);
      RelationParentChild relationParentChild0 = new RelationParentChild(person0, person0);
      // Undeclared exception!
      try { 
        relationParentChild0.equalsPersons((Relation) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Relation", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RelationParentChild relationParentChild0 = new RelationParentChild((Person) null, (Person) null);
      // Undeclared exception!
      try { 
        relationParentChild0.equalsPersons((Person) null, (Person) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Relation", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Person person0 = Person.restorePerson(0, "", "F", true);
      RelationParentChild relationParentChild0 = new RelationParentChild(person0, person0);
      Person person1 = Person.restorePerson(0, "Kj", "Y-,QC|1E^|", true);
      boolean boolean0 = relationParentChild0.equalsPersons(person1, person0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Person person0 = Person.restorePerson((-699), "DV", "DV", true);
      RelationSpouse relationSpouse0 = new RelationSpouse(person0, person0);
      boolean boolean0 = relationSpouse0.equalsPersons(person0, person0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Person person0 = new Person((String) null, (String) null, true);
      Person person1 = Person.restorePerson((-48), "male", "Spouse", true);
      RelationSpouse relationSpouse0 = new RelationSpouse(person1, person0);
      boolean boolean0 = relationSpouse0.equalsPersons(person1, person0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Person person0 = new Person((String) null, (String) null, false);
      Person person1 = new Person("female", "Child", false);
      RelationSpouse relationSpouse0 = new RelationSpouse(person1, person1);
      boolean boolean0 = relationSpouse0.equalsPersons(person1, person0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Person person0 = new Person((String) null, (String) null, false);
      RelationParentChild relationParentChild0 = new RelationParentChild(person0, person0);
      Person person1 = new Person("female", "Child", false);
      RelationSpouse relationSpouse0 = new RelationSpouse(person1, person1);
      boolean boolean0 = relationSpouse0.equalsPersons((Relation) relationParentChild0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Person person0 = new Person((String) null, (String) null, false);
      RelationParentChild relationParentChild0 = new RelationParentChild(person0, person0);
      RelationSpouse relationSpouse0 = new RelationSpouse(person0, person0);
      boolean boolean0 = relationSpouse0.equalsPersons((Relation) relationParentChild0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Person person0 = Person.restorePerson((-699), "DV", "DV", true);
      RelationSpouse relationSpouse0 = new RelationSpouse(person0, person0);
      boolean boolean0 = relationSpouse0.isParent(person0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Relation relation0 = Relation.createRelation((-48), (String) null, (-48));
      assertNull(relation0);
  }
}