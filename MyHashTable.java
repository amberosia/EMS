/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jenna
 */
import java.util.*;


public class MyHashTable {

	public ArrayList<EmployeeInfo>[] buckets;
        private int numInHashTable;

	
	// CONSTRUCTOR

	public MyHashTable(int howManyBuckets) {
                buckets = new ArrayList[howManyBuckets];

                for (int i = 0; i < howManyBuckets; i++) {
                        buckets[i] = new ArrayList();
                }
                
                numInHashTable = 0;
	}

	// METHODS
        
        public int getNumInHashTable() {
		return numInHashTable;
	}


	public int calcBucket(int empNumber) {
		return(Math.abs(empNumber) % buckets.length); 
	}


	public boolean addEmployee(EmployeeInfo theEmployee) {
		if (theEmployee == null) {
			return false;
		}
		
		try {
                    int bucketNum = calcBucket(theEmployee.empNumber);
                    buckets[bucketNum].add(theEmployee);
                    numInHashTable++;
                    return true;
                } catch (Exception e) {
                    return false;
                }      
        }


	public void removeEmployee(int empNum) {
		int bucketNum = calcBucket(empNum);

                for (int i = 0; i < buckets[bucketNum].size(); i++) {
			if (buckets[bucketNum].get(i).empNumber == empNum) {
                                buckets[bucketNum].remove(i);
                                numInHashTable--;
			}
			
                }
	}

	
	public EmployeeInfo searchEmployee(int empNum) {
		int bucketNum = calcBucket(empNum);

		if (buckets[bucketNum].isEmpty()) {
			return null;
			
		} else {
			for (int i = 0; i < buckets[bucketNum].size(); i++) {
				if (buckets[bucketNum].get(i).empNumber == empNum) {
					EmployeeInfo empToFind = buckets[bucketNum].get(i);
					return empToFind;
					
				}
			}
		}
		
		return null;
	}


	public void displayTable() {
		System.out.println("\n\nHERE ARE THE CONTENTS OF THE TABLE:");
		for (int i = 0; i < buckets.length; i++) {
			if (buckets[i].isEmpty()) {
				System.out.println("Bucket " + i + " is empty!");
			}
			else {
				System.out.println("Bucket " + i + " contains the following:");
				for (int j = 0; j < buckets[i].size(); j++) {
					System.out.println("    " + buckets[i].get(j).empNumber + " "
							+ buckets[i].get(j).date + " " + buckets[i].get(j).firstName
							+ " at position " + j);
				}
			}
		}	
	}
}
