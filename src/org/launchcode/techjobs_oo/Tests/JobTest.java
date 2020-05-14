package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job jobOne;
    Job jobTwo;

    @Before
    public void createCarObject() {
         jobOne = new Job();
         jobTwo = new Job();
    }


    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void testSettingJobId() {
        assertFalse(jobOne.getId() == jobTwo.getId());
        assertTrue(jobOne.getId() + 1 == jobTwo.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(testJob.getName() == "Product tester");
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getEmployer().getValue() == "ACME");
        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getLocation().getValue() == "Desert");
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getPositionType().getValue() == "Quality control");
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(testJob.getCoreCompetency().getValue() == "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job testJobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJobTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(testJobOne.equals(testJobTwo));
    }

    @Test
    public void testJobsToStringBlankLines() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        System.out.println(testJob.toString());
        assertTrue(testJob.toString().indexOf("\n") == 0);
        assertTrue(testJob.toString().substring(testJob.toString().length() - 1).indexOf("\n") == 0);
    }

    @Test
    public void testJobsToStringLabels() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        System.out.println(testJob.toString());
        assertTrue(testJob.toString().indexOf("ID:") == 1);
        assertTrue(testJob.toString().contains("ID:"));
        assertTrue(testJob.toString().contains("Name:"));
        assertTrue(testJob.toString().contains("Employer:"));
        assertTrue(testJob.toString().contains("Location:"));
        assertTrue(testJob.toString().contains("Position Type:"));
        assertTrue(testJob.toString().contains("Core Competency:"));
    }

    @Test
    public void testJobsToStringData() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        System.out.println(testJob.toString());
        assertTrue(testJob.toString().contains("ID: " + testJob.getId()));
        assertTrue(testJob.toString().contains("Name: Product tester"));
        assertTrue(testJob.toString().contains("Employer: ACME"));
        assertTrue(testJob.toString().contains("Location: Desert"));
        assertTrue(testJob.toString().contains("Position Type: Quality control"));
        assertTrue(testJob.toString().contains("Core Competency: Persistence"));
    }

    @Test
    public void testJobsToStringBlankData() {
        Job testJob = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(jobOne.toString().contains("Employer: Data not available"));
        assertTrue(testJob.toString().contains("Name: Data not available"));
    }


}
