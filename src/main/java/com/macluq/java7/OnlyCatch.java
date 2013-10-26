package trywithresources;

import trywithresources.exceptions.CatchException;

public class OnlyCatch {

    public static void main(String[] args) throws Exception {

        try (MyResource resource = new MyResource(false, false, false)) {
            resource.anyGivenAction();
        }
        catch (Exception e) {
            System.out.println("Catching " + e.getClass());
            throw new CatchException();
        }
        finally {
            System.out.println("At the finally");
        }
    }
}