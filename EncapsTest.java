class EncapsulationDemo
{
                                          private long Aadhar;
                                          private String empName;
                                          private int empAge;
                                          public long getEmpAadhar(){
                                          return Aadhar;
}
                                          public String getEmpName(){
                                          return empName;
}
                                          public int getEmpAge(){
                                          return empAge;
}
                                          public void setEmpAge(int newValue){
                                          empAge = newValue;
}
                                         public void setEmpName(String newValue){
                                         empName = newValue;
}
                                         public void setEmpAadhar(long newValue){
                                         Aadhar = newValue;
}
}
                                         public class EncapsTest{
                                         public static void main(String args[]){
                                         EncapsulationDemo obj = new EncapsulationDemo();
                                         obj.setEmpName("Ramu");
                                         obj.setEmpAge(26);
                                         obj.setEmpAadhar(122212221222L);
                                         System.out.println("Employee Name: " + obj.getEmpName());
                                         System.out.println("Employee Aadhar: " + obj.getEmpAadhar());
                                         System.out.println("Employee Age: " + obj.getEmpAge());
}
}