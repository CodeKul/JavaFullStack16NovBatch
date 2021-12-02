package pkg1;

public class User {
    private String name = "abc";

    public void displayPublic(){ //public
        System.out.println("Hello Public"+name);
    }

    private void displayPrivate(){
        System.out.println("Hello Private"+name);
    }

    void displayDefault(){
        System.out.println("Hello Default"+name);
    }

    protected void displayProtected(){
        System.out.println("Hello Protected"+name);
    }
}


/**
 * private = access within a class only
 * default = within a package accessible only
 * protected = accessible within package only and outside the package but through inheritance only
 * public = accessible within application
 */