package com.example1;

/*public class Singleton {
    String name;
    private Singleton(String name){
    	  this.name = name;
    }
    public static void printPerson(Singleton sing){
    	System.out.println("my name is: "+sing.name);
    }
      //ָ������,�ɷ�ֹ�����Թ��󣬶Է�����������;
	 public static void main(String[] args) {   
        Singleton s1 = new Singleton("lfb");
	    printPerson(s1);
	    Singleton s2 = new Singleton("lfbb");
	    printPerson(s2);
	    Singleton s3 = new Singleton("lfbbb");
	    printPerson(s3);
	}
}
*/
public class Singleton {
    private volatile static Singleton uniqueInstance;
    String name;
    public Singleton(String name){
    	   this.name = name;
    }
    public static Singleton getUniqueInstance(String name) {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton(name);
                }
            }
        }
        return uniqueInstance;
    }
	public static void main(String[] args) {  
    	Singleton sing1 = getUniqueInstance("lfb");       //急速那
    	Singleton sing2 = getUniqueInstance("lfbb"); 
    	Singleton sing3 = getUniqueInstance("lfbbb"); 
        System.out.println(sing1.name+" "+sing2.name+" "+sing3.name);	
    }
}