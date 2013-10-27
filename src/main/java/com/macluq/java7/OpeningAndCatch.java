package trywithresources;

import trywithresources.exceptions.CatchException;
import trywithresources.exceptions.FinallyException;

public class OpeningAndCatch {

    public static void main(String[] args) throws Exception {

        try (MyResource resource = new MyResource(true, false, false)) {
            resource.anyGivenAction();
        }
        catch (Exception e) {
            System.out.println("Catching " + e.getClass());
            throw new CatchException();

        }
        finally {
            System.out.println("At the finally");
            throw new FinallyException();
        }
    }
}