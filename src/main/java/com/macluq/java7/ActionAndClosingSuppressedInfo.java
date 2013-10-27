package trywithresources;

public class ActionAndClosingSuppressedInfo {

    public static void main(String[] args) throws Exception {

        try (MyResource resource = new MyResource(false, true, true)) {
            resource.anyGivenAction();
        }
        catch (Exception exceptionThrown) {
            System.out.println("Catching " + exceptionThrown.getClass());
            for (Throwable exceptionSuppressed: exceptionThrown.getSuppressed()) {
                System.out.println("Suppressed: " + exceptionSuppressed);
            }
        }
        finally {
            System.out.println("At the finally");
        }
    }
}