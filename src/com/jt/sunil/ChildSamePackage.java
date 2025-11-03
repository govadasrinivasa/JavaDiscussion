package com.jt.sunil;

public class ChildSamePackage extends Parent1 {

	public void showAccess() {
        // System.out.println(privatemem); // ❌ Not accessible (private)
        System.out.println(defaultmem);   // ✅ Accessible (same package)
        System.out.println(protectedmem); // ✅ Accessible (inheritance + same package)
        System.out.println(publicmem);    // ✅ Accessible (public)
    }

    public static void main(String[] args) {
    	Parent1 parent = new Parent1();
        parent.showParent1Members();
        System.out.println();
        ChildSamePackage child = new ChildSamePackage();
        System.out.println("Access from Child in SAME package:");
        child.showAccess();
    }
}
