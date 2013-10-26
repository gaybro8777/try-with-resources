package trywithresources;

import trywithresources.exceptions.FinallyException;

public class OnlyFinally {

    public static void main(String[] args) throws Exception {

        try (MyResource resource = new MyResource(false, false, false)) {
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