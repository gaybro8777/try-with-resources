package trywithresources;

import trywithresources.exceptions.FinallyException;

public class ActionAndFinally {

    public static void main(String[] args) throws Exception {

        try (MyResource resource = new MyResource(false, true, true)) {
            resource.anyGivenAction();
        }
        catch (Exception e) {
            System.out.println("Catching " + e.getClass());
        }
        finally {
            System.out.println("At the finally");
            throw new FinallyException();
        }
    }
}