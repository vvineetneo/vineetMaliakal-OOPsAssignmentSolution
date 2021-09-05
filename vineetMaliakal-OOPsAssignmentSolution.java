
class Superclass{
    String departmentName(){
        return "Super Department";
    }
    String getTodaysWork(){
        return "No work as of now";
    }
    String getWorkDealine(){
        return "Nil";
    }
    String isTodayHoliday(){
        return "Today is not a holiday";
    }
}

class AdminDepartment extends Superclass{
    String departmentName(){
        return "Admin Department";
    }
    String getTodaysWork(){
        return "Complete your documents Submission";
    }
    String getWorkDeadline(){
        return "Complete by EOD";
    }
}

class HrDepartment extends Superclass{
    String departmentName(){
        return "Hr Department";
    }
    String getTodaysWork(){
        return "Fill today's worksheet and mark attendance";
    }
    String getWorkDeadline(){
        return "Complete by EOD";
    }
    String doActivity(){
        return "team Lunch";
    }
}

class TechDepartment extends Superclass{
 String departmentName(){
     return "Tech Department";
 }
 String getTodaysWork(){
     return "Complete coding of module 1";
 }
 String getWorkDeadline(){
     return "Complete by EOD";
 }
 String getTechStackInformation(){
     return "Core Java";
 }
}
public class department {
    public static void main(String[] args) {
        Superclass sup=new Superclass();
        AdminDepartment admin=new AdminDepartment();
        HrDepartment hr=new HrDepartment();
        TechDepartment tech=new TechDepartment();

        System.out.println("Welcome to "+admin.departmentName());
        System.out.println(admin.getTodaysWork());
        System.out.println(admin.getWorkDeadline());
        System.out.println(admin.isTodayHoliday());
        System.out.println("");
        System.out.println("");

        System.out.println("Welcome to "+hr.departmentName());
        System.out.println(hr.doActivity());
        System.out.println(hr.getTodaysWork());
        System.out.println(hr.getWorkDeadline());
        System.out.println(hr.isTodayHoliday());
        System.out.println("");
        System.out.println("");

        System.out.println("Welcome to "+tech.departmentName());
        System.out.println(tech.getTodaysWork());
        System.out.println(tech.getWorkDeadline());
        System.out.println(tech.getTechStackInformation());
        System.out.println(tech.isTodayHoliday());

    }
    
}
