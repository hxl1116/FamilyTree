/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 07 19:17:21 GMT 2019
 */

package io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.DiskManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.Person;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import view.PersonTableModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DiskManager_ESTest extends io.DiskManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DiskManager diskManager0 = DiskManager.getDiskManager();
      PersonTableModel personTableModel0 = new PersonTableModel();
      Person person0 = personTableModel0.createPerson("model.RelationSpouse", "model.RelationSpouse", "model.RelationSpouse");
      Person person1 = personTableModel0.createPerson("{d", "{d", "model.RelationSpouse");
      person0.addSpouse(person1);
      PersonTableModel personTableModel1 = new PersonTableModel();
      diskManager0.writeToDisk(personTableModel0);
      diskManager0.readFromDisk(personTableModel1);
      assertEquals(2, personTableModel1.getRowCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DiskManager diskManager0 = DiskManager.getDiskManager();
      // Undeclared exception!
      try { 
        diskManager0.writeToDisk((PersonTableModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.DiskManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DiskManager diskManager0 = DiskManager.getDiskManager();
      PersonTableModel personTableModel0 = new PersonTableModel();
      FileSystemHandling.shouldAllThrowIOExceptions();
      try { 
        diskManager0.writeToDisk(personTableModel0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DiskManager diskManager0 = DiskManager.getDiskManager();
      PersonTableModel personTableModel0 = new PersonTableModel();
      diskManager0.writeToDisk(personTableModel0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("FamilyTreePersons.fml");
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
      try { 
        diskManager0.writeToDisk(personTableModel0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DiskManager diskManager0 = DiskManager.getDiskManager();
      PersonTableModel personTableModel0 = new PersonTableModel();
      diskManager0.writeToDisk(personTableModel0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("FamilyTreeRelations.fml");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "yqkqu");
      // Undeclared exception!
      try { 
        diskManager0.readFromDisk(personTableModel0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DiskManager diskManager0 = DiskManager.getDiskManager();
      PersonTableModel personTableModel0 = new PersonTableModel();
      personTableModel0.createPerson("model.RelationSpouse", "model.RelationSpouse", "");
      diskManager0.writeToDisk(personTableModel0);
      // Undeclared exception!
      try { 
        diskManager0.readFromDisk((PersonTableModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.DiskManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DiskManager diskManager0 = DiskManager.getDiskManager();
      PersonTableModel personTableModel0 = new PersonTableModel();
      try { 
        diskManager0.readFromDisk(personTableModel0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PersonTableModel personTableModel0 = new PersonTableModel();
      Person person0 = personTableModel0.createPerson("SI", "SI", "SI");
      Person person1 = personTableModel0.createPerson("SI", "male", "SI");
      person0.addChild(person1);
      Person person2 = personTableModel0.createPerson("male", "male", "SI");
      person0.addSpouse(person2);
      DiskManager diskManager0 = DiskManager.getDiskManager();
      diskManager0.writeToDisk(personTableModel0);
      assertEquals(3, personTableModel0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PersonTableModel personTableModel0 = new PersonTableModel();
      Person person0 = personTableModel0.createPerson("SI", "SI", "SI");
      Person person1 = personTableModel0.createPerson("SI", "male", "SI");
      person0.addChild(person1);
      DiskManager diskManager0 = DiskManager.getDiskManager();
      diskManager0.writeToDisk(personTableModel0);
      try { 
        diskManager0.readFromDisk(personTableModel0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // AddRelation failed when reading file.
         //  The file is likely corrupt
         //
         verifyException("io.DiskManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DiskManager diskManager0 = DiskManager.getDiskManager();
      PersonTableModel personTableModel0 = new PersonTableModel();
      Person person0 = personTableModel0.createPerson("mofdel.ReltionSpouse", "mofdel.ReltionSpouse", "mofdel.ReltionSpouse");
      person0.setFemale(true);
      Person person1 = Person.restorePerson((-243), "female", "mofdel.ReltionSpouse", true);
      person0.addSpouse(person1);
      diskManager0.writeToDisk(personTableModel0);
      try { 
        diskManager0.readFromDisk(personTableModel0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Found none-existing person in relation when reading file.
         //  The file is likely corrupt
         //
         verifyException("io.DiskManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DiskManager diskManager0 = DiskManager.getDiskManager();
      PersonTableModel personTableModel0 = new PersonTableModel();
      Person person0 = personTableModel0.createPerson("", "", "");
      Person person1 = new Person("", "female", false);
      person0.addSpouse(person1);
      diskManager0.writeToDisk(personTableModel0);
      try { 
        diskManager0.readFromDisk(personTableModel0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Found none-existing person in relation when reading file.
         //  The file is likely corrupt
         //
         verifyException("io.DiskManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PersonTableModel personTableModel0 = new PersonTableModel();
      Person person0 = personTableModel0.createPerson("model.RelationSpouse", "model.RelationSpouse", "model.RelationSpouse");
      Person person1 = personTableModel0.createPerson("model.RelationSpouse", "male", "female");
      person0.addChild(person1);
      DiskManager diskManager0 = DiskManager.getDiskManager();
      diskManager0.writeToDisk(personTableModel0);
      try { 
        diskManager0.readFromDisk(personTableModel0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // AddRelation failed when reading file.
         //  The file is likely corrupt
         //
         verifyException("io.DiskManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DiskManager diskManager0 = DiskManager.getDiskManager();
      PersonTableModel personTableModel0 = new PersonTableModel();
      Person person0 = personTableModel0.createPerson("model.RelationSpouse", "model.RelationSpouse", "");
      Person person1 = Person.restorePerson((-243), "", "model.RelationSpouse", false);
      person0.addSpouse(person1);
      diskManager0.writeToDisk(personTableModel0);
      // Undeclared exception!
      try { 
        diskManager0.readFromDisk(personTableModel0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DiskManager diskManager0 = DiskManager.getDiskManager();
      DiskManager diskManager1 = DiskManager.getDiskManager();
      assertSame(diskManager1, diskManager0);
  }
}