class Doctor {
    protected String name;
    protected int idNumber;
    protected String address;
  
    Doctor() {
    }

     Doctor(final String str, final int num, final String addr) {
        name = str;
        idNumber = num;
        address = addr;
    }
    
    void display() {
        System.out.println("The name is :" + name);
        System.out.println("The number is :" + idNumber);
        System.out.println("The address is :" + address);
    }
}

 class Specialist extends Doctor {
       protected String speciality;

     Specialist() {
    }

    Specialist(final String str, final int num,
    final String addr, final String special) {
        super(str, num, addr);
        speciality = special;
    }

    void display() {
    super.display();
    System.out.println("The speciality is :" + speciality);
    }
}
class NonSpecialist extends Doctor {
    NonSpecialist() {
    }
       NonSpecialist(final String str, final int num, final String addr) {
        super(str, num, addr);
    }
}

class TestDoctor {
      public TestDoctor() {
    }
   
    public static void main(String [] args) {
         Specialist spObj = new Specialist("Mary", 1234,
         "New York", "Medicine");
         spObj.display();
         NonSpecialist nonSpObj = new NonSpecialist("John", 5231, "Sydney");
         nonSpObj.display();
    }
}
