/*Stores a list of users
Display list of unique user names
lists the user in the increasing order of age  (done)
Ability to edit a user(phone number and email id)
Search a user by mobile number
Search a user by email ID*/
package com.example.user;

import org.junit.Test;

import java.util.ArrayList;

public class JobCandidateSorterTest {
    @Test
    public void testGetSortedJobCandidateByAge() throws Exception {
        JobCandidate jobCandidate1 = new JobCandidate("Anoop Tiwari", "Male", 26,25970.00,"anoop@gmail.com",9415418279L);
        JobCandidate jobCandidate2 = new JobCandidate("Lakshmi", "Female", 23,29970.00,"lakshmi@gmail.com",8579461325L);
        JobCandidate jobCandidate3 = new JobCandidate("Priyanka Tripathi", "Female", 20,35970.00,"priyanka@gmail.com",9044669201L);
        JobCandidate jobCandidate4 = new JobCandidate("Ronish Pakhrin", "Male", 24,45970.00,"ronish@gmail.com",9638527411L);
        ArrayList<JobCandidate> jobCandidateList = new ArrayList<>();
        jobCandidateList.add(jobCandidate1);
        jobCandidateList.add(jobCandidate2);
        jobCandidateList.add(jobCandidate3);
        jobCandidateList.add(jobCandidate4);
        JobCandidateSorter jobCandidateSorter = new JobCandidateSorter(jobCandidateList);
        ArrayList<JobCandidate> sortedJobCandidate = jobCandidateSorter.getSortedJobCandidateByAge();
        System.out.println("-----Sorted JobCandidate by age: Ascending-----");
        for (JobCandidate jobCandidate : sortedJobCandidate) {
            System.out.println(jobCandidate);
        }
    }
}