class Overloading{
                           int id;
                           String name;
                           int age;
                          Overloading(int i,String n)
                      {
                           id = i;
                           name = n;
                        }
                           Overloading(int i,String n,int a)
                       {
                           id = i;
                           name = n;
                           age=a;
                        }
                           void display(){System.out.println(id+" "+name+" "+age);
                        }
                           public static void main(String args[]){
                           Overloading o1 = new Overloading(17,"Ratan",27);
                           Overloading o2 = new Overloading(16,"Ram",42);
                           o1.display();
                           o2.display();
                       }
                       }