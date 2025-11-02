package com.jt.teja;

import com.jt.sunil.Parent1;

public class ChildDifferentPackage extends Parent1 {

	public void showAccess() {
        // System.out.println(privateVar); // ❌ private not accessible
        // System.out.println(defaultVar); // ❌ default not accessible outside package
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
