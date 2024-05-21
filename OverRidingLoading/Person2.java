package OverRidingLoading;

public class Person2 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void showName(){System.out.println("Name: "+name);}
    public void showName(String nameTitle){System.out.println("Name: "+nameTitle+" "+name);}
}
