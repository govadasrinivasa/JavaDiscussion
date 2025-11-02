package com.jt.teja;

import com.jt.sunil.Parent1;

public class ChildDifferentPackage extends Parent1 {

	public void showAccess() {
        // System.out.println(privatemem); // ❌ private not accessible
        // System.out.println(defaultmem); // ❌ default not accessible outside package
        System.out.println(protectedmem); // ✅ accessible because of inheritance
        System.out.println(publicmem);    // ✅ public always accessible
    }
	
	public static void main(String[] args) {
        Parent1 parent = new Parent1();
        parent.showParent1Members();
        System.out.println();
		
		ChildDifferentPackage child = new ChildDifferentPackage();
        System.out.println("Access from Child in DIFFERENT package:");
        child.showAccess();
    }
}

	//	| Modifier  | Same Class | Same Package | Subclass Same Package | Subclass Different Package | Other Package |
	//	| --------- | ---------- | ------------ | --------------------- | -------------------------- | ------------- |
	//	| private   | ✅ Yes      | ❌ No         | ❌ No                  | ❌ No                       | ❌ No          |
	//	| default   | ✅ Yes      | ✅ Yes        | ✅ Yes                 | ❌ No                       | ❌ No          |
	//	| protected | ✅ Yes      | ✅ Yes        | ✅ Yes                 | ✅ Yes (via inheritance)    | ❌ No          |
	//	| public    | ✅ Yes      | ✅ Yes        | ✅ Yes                 | ✅ Yes                      | ✅ Yes         |
