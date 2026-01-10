package src.CoreJava;

public class EqualsAndHashCode {

    public static void main(String[] args) {


        // If two objects are equal according to equals(),
        //then they must have the same hashCode()


//        If two objects have the same hashCode(),
//they may or may not be equal


//        During execution, hashCode() must return the same value
//if the object is not modified


        // Coming to the equlas() method
        // We can override the  Equals() method depending on our choices
        //Classes like String, Integer, List, etc. override equals() to compare content.

        // equals() => Always check the content  => False

        // == compares references for objects
        // equals() compares logical equality as defined by the class

        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println(s1.equals(s2)); // true (content comparison)


        //But when we are comparing 2 objects of persons p1 and p2 then equals() checks the refernce if class does not override the euals method

        //System.out.println(p1.equals(p2)); // false (Object.equals → reference check)


        // Why this contract exists ? =>

//        Because of hash-based collections:
//        HashMap
//         HashSet
//        Hashtable


//        How HashMap works internally:
//        Uses hashCode() to find the bucket
//        Uses equals() to find the exact object
//        If you break the contract → data loss / bugs

        /*
         *  5️⃣ What happens if you override equals() but NOT hashCode()?
            🚨 BUGGY CODE
            class Employee {
                int id;

                @Override
                public boolean equals(Object o) {
                    Employee e = (Employee) o;
                    return this.id == e.id;
                }
            }
            Employee e1 = new Employee(1);
            Employee e2 = new Employee(1);

            HashSet<Employee> set = new HashSet<>();
            set.add(e1);
            set.add(e2);

            System.out.println(set.size()); // ❌ 2 (WRONG!)
            Why?
            equals() says objects are equal
            hashCode() (from Object) gives different values
            HashSet puts them in different buckets
            6️⃣ Correct implementation (always override both)
            class Employee {
                int id;

                Employee(int id) {
                    this.id = id;
                }

                @Override
                public boolean equals(Object o) {
                    if (this == o) return true;
                    if (!(o instanceof Employee)) return false;
                    Employee e = (Employee) o;
                    return this.id == e.id;
                }

                @Override
                public int hashCode() {
                    return Integer.hashCode(id);
                }
            }
            Now:
            e1.equals(e2);      // true
            e1.hashCode()==e2.hashCode(); // true
            ✅ Works correctly in HashMap / HashSet.
            7️⃣ Relation between equals() and hashCode() (direct answer)
            ✅ Yes, there is a strict relationship (contract)
            Method	Purpose
            equals()	Checks logical equality (content)
            hashCode()	Used for bucket location in hash collections
            🔑 Rule to remember for interviews:
            Override equals() → MUST override hashCode()
            8️⃣ Final Interview-Ready Summary
            ✔ == → reference comparison (objects)
            ✔ equals() → logical equality (depends on implementation)
            ✔ equals() does not always check content
            ✔ If equals() is overridden → hashCode() must be overridden
            ✔ Hash-based collections rely on both
                     *
         *
         *
         *
         *
         *
         *
         *
         *
         *
         *
         * */


    }

}
